package uk.co.mo.app.mercury.domain.event;

import java.util.Date;
import java.util.List;

import javax.jms.JMSException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import uk.co.mo.app.mercury.cs.applicationerror.ApplicationErrorSeverity;
import uk.co.mo.app.mercury.cs.applicationerror.ApplicationErrorType;
import uk.co.mo.app.mercury.cs.applicationerror.MoRuntimeException;
import uk.co.mo.app.mercury.cs.dao.LegacyDAO;
import uk.co.mo.app.mercury.cs.system.ConnectionStatus;
import uk.co.mo.app.mercury.cs.system.SystemStatus;
import uk.co.mo.app.mercury.cs.util.DateUtils;

/**
 * <p/>
 * User: prabat
 * Date: 10/06/11
 * Time: 14:51
 * <p/>
 * Change Log - Who : When : Comment
 */
@Component("eventNotificationJob")
public class EventNotificationJob {

    private static final Log LOG = LogFactory.getLog(EventNotificationJob.class);

    private static final short EVENT_NOTIFICATION_JOB_ID = 4;
    
    /*
     *  0 - Unprocessed
     *  1 - processed
     *  2 - Reserved
     *  13 - Failed
     *  15 - Blocked by previous event of same entity
     */

    @Autowired
    private LegacyDAO dao;

    @Autowired
    private EventDispatcher dispatcher;

    private boolean interrupt;


    @Transactional(propagation = Propagation.NEVER)
    public void doEventNotificationWork() {

        interrupt = false;

        String jobname =  "Event Notification job";
        LOG.info(jobname + " invoked at " + new Date());

        try{
        	//Reserve NEW events. Status = 0
        	List<EventKey> newEventKeys = dao.getSoaInterfaceSessionFactory().getCurrentSession()
        	.getNamedQuery("domain.businessEvent.toProcess")
        	.setParameter(0, 0)
        	.setResultTransformer(Transformers.aliasToBean((EventKey.class))).list();
        	
        	//Reserver the FAILED events as well. Status = 13
        	List<EventKey> failedEventKeys = dao.getSoaInterfaceSessionFactory().getCurrentSession()
        	.getNamedQuery("domain.businessEvent.toProcess")
        	.setParameter(0, 13)
        	.setResultTransformer(Transformers.aliasToBean((EventKey.class))).list();
        	
        	// Reserve the BLOCKED events too. Status =15
        	List<EventKey> blockedEventKeys = dao.getSoaInterfaceSessionFactory().getCurrentSession()
        	.getNamedQuery("domain.businessEvent.toProcess")
        	.setParameter(0, 15)
        	.setResultTransformer(Transformers.aliasToBean((EventKey.class))).list();
        	
        	newEventKeys.addAll(failedEventKeys);
        	newEventKeys.addAll(blockedEventKeys);
        	
        	reserveEvents(newEventKeys);
        	SystemStatus.setSoaInterfaceDbStatus(ConnectionStatus.UP);
        }catch (Exception e){
        	SystemStatus.setSoaInterfaceDbStatus(ConnectionStatus.DOWN);
        	throw new MoRuntimeException(ApplicationErrorType.MERCURY_SOA_INTERFACE_FAILURE.getErrorType(),
                    null, ApplicationErrorSeverity.HIGH.getCode(),
                    "MERCURY Business Event Notification failure", e.getCause(), true);
        }
        
        dispatchEvents();
        Date updateDate = new Date();
        updateJob(EVENT_NOTIFICATION_JOB_ID, updateDate);
        LOG.info(jobname + " completed at " + updateDate);
        SystemStatus.setLastSuccessfulJobRunTime(updateDate);
    }


	@Transactional(propagation = Propagation.REQUIRES_NEW)
    private void reserveEvents(List<EventKey> eventKeys) {
        for (EventKey next : eventKeys) {
            dao.getSoaInterfaceSessionFactory().getCurrentSession()
                .getNamedQuery("domain.businessEvent.data.update")
                    .setParameter(0, next.getBeDataId())
                    .setParameter(1, 2)
                    .executeUpdate();
        }

        LOG.info("Events reserved:" + eventKeys.size());
    }

    private void updateEventStatus(EventKey eventKey, int status) {
    	LOG.debug("EventNotificationJob :: updateEventStatus :: status :: "+status);
    	
    	if(status==1){
    		dao.getSoaInterfaceSessionFactory().getCurrentSession()
    		.getNamedQuery("domain.businessEvent.data.update")
    		.setParameter(0, eventKey.getBeDataId())
    		.setParameter(1, 1)
    		.executeUpdate();
    	}
    	else if(status==0){
    		dao.getSoaInterfaceSessionFactory().getCurrentSession()
    		.getNamedQuery("domain.businessEvent.data.update")
    		.setParameter(0, eventKey.getBeDataId())
    		.setParameter(1, 13)
    		.executeUpdate();
    	}else if (status==2){
    		dao.getSoaInterfaceSessionFactory().getCurrentSession()
    		.getNamedQuery("domain.businessEvent.data.update")
    		.setParameter(0, eventKey.getBeDataId())
    		.setParameter(1, 15)
    		.executeUpdate();
    	}
    }

    private void dispatchEvents() {

        List<EventKey> eventKeys = dao.getSoaInterfaceSessionFactory().getCurrentSession()
                .getNamedQuery("domain.businessEvent.toProcess")
                .setParameter(0, 2)
                .setResultTransformer(Transformers.aliasToBean((EventKey.class))).list();
        LOG.info("Events to send:" + eventKeys.size());
        dispatch(eventKeys);
    }

    private void dispatch(List<EventKey> eventKeys) {
        for (EventKey next : eventKeys) {
            if(!interrupt)dispatchSingleEvent(next);
            else{ 
            	LOG.info("Notifcation job interrupted at " + new Date());
            	break;
            }
        }
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    private void dispatchSingleEvent(EventKey next) {
		try{
			if(checkEvent(next)){
				dispatcher.dispatchEvent(next);
				updateEventStatus(next, 1); // The event has processed successfully
			}else{
				updateEventStatus(next, 2); // The event is blocked by previous failed event
			}
		}catch (UnknownEventException uee){
			LOG.error("EventNotificationJob :: dispatch :: Unknown Event ERROR :: ", uee);
			updateEventStatus(next, 0); // The event has failed.
		}catch (EventNotGeneratedException eng){
			LOG.error("EventNotificationJob :: dispatch :: Event Not Generated ERROR :: ", eng);
			updateEventStatus(next, 0); // The event has failed.
		}
	}

    private boolean checkEvent(EventKey next) {

    	int recordsFound = (Integer) dao.getSoaInterfaceSessionFactory().getCurrentSession()
		.getNamedQuery("domain.businessEvent.checkEventProcessing")
		.setParameter(0, next.getBeId()).list().get(0);
		
    	if(recordsFound==1){
    		LOG.info("EventNotificationJob :: checkEvent :: EventKey :: "+next.toString()+" EVENT BLOCKED BY PREVIOUS FAILED EVENT");
    		return false;
    	}
   		return true;
	}

	@Transactional(propagation = Propagation.REQUIRED)
    private Date updateJob(short jobId, Date updateDate) {
        Query query  = dao.getSoaInterfaceSessionFactory().getCurrentSession().getNamedQuery("domain.businessEvent.job.update");
        query.setParameter(0, jobId).setParameter(1, updateDate);
        return (Date)query.list().get(0);
    }

    public void setInterrupt(boolean interrupt) {
        this.interrupt = interrupt;
    }
}
