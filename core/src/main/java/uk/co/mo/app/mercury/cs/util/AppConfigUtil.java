package uk.co.mo.app.mercury.cs.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.StringTokenizer;

/**
 * <p/>
 * User: prabat
 * Date: 16/08/11
 * Time: 12:01
 * <p/>
 * Change Log - Who : When : Comment
 */
@Component
public class AppConfigUtil {
    private @Value("#{serverConfig.app_ejb_event_scheduler_timer}") String ejbSchedulerTimerValue;
    private @Value("#{serverConfig.app_ejb_event_notification_timeout}") String ejbNotificationJobTimeoutValue;

    public String getEjbSchedulerTimerValue() {
        return ejbSchedulerTimerValue;
    }

    public String getEjbNotificationJobTimeoutValue() {
        return ejbNotificationJobTimeoutValue;
    }
}
