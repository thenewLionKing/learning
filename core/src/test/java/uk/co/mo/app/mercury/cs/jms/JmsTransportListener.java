package uk.co.mo.app.mercury.cs.jms;

import org.apache.activemq.transport.TransportListener;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import uk.co.mo.app.mercury.cs.system.ConnectionStatus;
import uk.co.mo.app.mercury.cs.system.SystemStatus;

import java.io.IOException;

/**
 * <p/>
 * User: prabat
 * Date: 25-Feb-2011
 * Time: 09:03:23
 * <p/>
 * Change Log - Who : When : Comment
 */
@Component
public class JmsTransportListener implements TransportListener {

    private static final Log LOG = LogFactory.getLog(JmsTransportListener.class);

    public void onCommand(Object o) {

    }

    public void onException(IOException e) {
        LOG.info("JMS Down...", e);
        SystemStatus.setJmsConnectionStatus(ConnectionStatus.DOWN);
    }

    public void transportInterupted() {
        LOG.info("JMS Interrupted...");
        SystemStatus.setJmsConnectionStatus(ConnectionStatus.INTERRUPTED);
    }

    public void transportResumed() {
        LOG.info("JMS Up...");
        SystemStatus.setJmsConnectionStatus(ConnectionStatus.UP);
    }
}
