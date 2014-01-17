package uk.co.mo.app.mercury.web.cs.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Component
public class WebConfigUtil {
    private @Value("#{serverConfig.request_count_critical}") String rcCritical;
    private @Value("#{serverConfig.request_count_critical_timeLimit}") String rcCriticalTimeLimit;
    private @Value("#{serverConfig.request_count_critical_ratio_longRunning}") String rcCriticalRatioLongRunning;
    private @Value("#{serverConfig.request_count_critical_longRunning_threshold}") String rcCriticalLongRunningThreshold;
    private @Value("#{serverConfig.request_count_critical_longRunning_timeout}") String rcCriticalLongRunningTimeout;

    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final Log LOG = LogFactory.getLog(WebConfigUtil.class);

    public int getRequestCountCritical() {
        return Integer.parseInt(rcCritical);
    }

    public int getRequestCountCriticalTimeLimit() {
        return Integer.parseInt(rcCriticalTimeLimit);
    }

    public int getRequestCountCriticalRatioLongRunning() {
        return Integer.parseInt(rcCriticalRatioLongRunning);
    }

    public int getRcCriticalLongRunningThreshold() {
        return Integer.parseInt(rcCriticalLongRunningThreshold);
    }

    public int getRcCriticalLongRunningTimeout() {
        return Integer.parseInt(rcCriticalLongRunningTimeout);
    }

    @Override
    public String toString() {
        return "WebConfigUtil{" +
                "rcCritical='" + rcCritical + '\'' +
                ", rcCriticalTimeLimit='" + rcCriticalTimeLimit + '\'' +
                ", rcCriticalRatioLongRunning='" + rcCriticalRatioLongRunning + '\'' +
                ", rcCriticalLongRunningThreshold='" + rcCriticalLongRunningThreshold + '\'' +
                ", rcCriticalLongRunningTimeout='" + rcCriticalLongRunningTimeout + '\'' +
                '}';
    }
}