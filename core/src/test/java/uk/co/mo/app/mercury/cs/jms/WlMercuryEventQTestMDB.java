package uk.co.mo.app.mercury.cs.jms;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * <p/>
 * User: prabat
 * Date: 08/06/11
 * Time: 14:06
 * <p/>
 * Change Log - Who : When : Comment
 */
@Component("testQListener")
public class WlMercuryEventQTestMDB implements MessageListener {

    private static final Log LOG = LogFactory.getLog(WlMercuryEventQTestMDB.class);

    @Override
    public void onMessage(Message message) {
        try {
            String mesg = ((TextMessage) message).getText();
            LOG.debug("Received message..." + mesg);
        } catch (JMSException ex) {
            throw new RuntimeException(ex);
        }
    }
}
