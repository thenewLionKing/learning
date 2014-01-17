package uk.co.mo.app.mercury.domain.event;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

/**
 * <p/>
 * User: prabat
 * Date: 10/06/11
 * Time: 14:08
 * <p/>
 * Change Log - Who : When : Comment
 */
@Stateless(mappedName="mercury/ejb", name = "EventNotificationSessionEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class EventNotificationSessionBean implements EventNotificationSessionBeanLocal{

    private static final Log LOG = LogFactory.getLog(EventNotificationSessionBean.class);

    @Autowired
    private EventNotificationJob job;

    public EventNotificationSessionBean() {
    }

    @Resource
    private TimerService timerService;
    
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void createTimer(long timeout) {
        timerService.createTimer(timeout, null);
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public void doWork() {
        job.doEventNotificationWork();
    }

    @Timeout
    public void timeOut(Timer timer) {

        LOG.info("The event notification job timed out. Cancelling the job...");
        job.setInterrupt(true);
        timer.cancel();
        LOG.info("Job cancelled.");
    }
}
