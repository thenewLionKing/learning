package uk.co.mo.app.mercury.domain.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;
import uk.co.mo.app.mercury.cs.util.AppConfigUtil;

import javax.annotation.Resource;
import javax.ejb.*;
import javax.interceptor.Interceptors;


/**
 * <p/>
 * User: prabat
 * Date: 10/06/11
 * Time: 08:16
 * <p/>
 * Change Log - Who : When : Comment
 */
@Stateless(mappedName="mercury/ejb", name = "EventSchedulerSessionEJB")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class EventSchedulerSessionBean implements EventSchedulerSessionBeanLocal {

    private static final Log LOG = LogFactory.getLog(EventSchedulerSessionBean.class);

    @EJB//(name = "EventNotificationSessionEJB", mappedName = "mercury/ejb")
    EventNotificationSessionBeanLocal ejbEventNotification;
    long arg3 = 300000; // default to 5 mins equivalent

    @Autowired
    private AppConfigUtil configUtil;

    public EventSchedulerSessionBean() {
    }

    @Resource
    private TimerService timerService;


    public void createTimer() {
        String[] value = configUtil.getEjbSchedulerTimerValue().split(",{1}");
        String[] timePeriod = value[1].split("[*]");
        String[] timeoutPeriod = configUtil.getEjbNotificationJobTimeoutValue().split("[*]");

        long arg1 = Long.parseLong(value[0]);
        long arg2 = Long.parseLong(timePeriod[0]) * Long.parseLong(timePeriod[1]) * Long.parseLong(timePeriod[2]);
        this.arg3 = Long.parseLong(timeoutPeriod[0]) * Long.parseLong(timeoutPeriod[1]) * Long.parseLong(timeoutPeriod[2]);

        if(LOG.isDebugEnabled()) {
            LOG.debug("arg1: " + arg1);
            LOG.debug("arg2: " + arg2);
            LOG.debug("arg3: " + arg3);
        }

        timerService.createTimer(arg1, arg2, null);
    }

    @Timeout
    public void timeout(Timer timer) {
    	ejbEventNotification.createTimer(arg3);
    	ejbEventNotification.doWork();
        
    }
}
