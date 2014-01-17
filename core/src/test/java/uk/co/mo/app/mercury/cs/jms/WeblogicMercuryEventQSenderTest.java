package uk.co.mo.app.mercury.cs.jms;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import uk.co.mo.app.mercury.cs.test.AbstractJunit4Test;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * <p/>
 * User: prabat
 * Date: 08/06/11
 * Time: 13:28
 * <p/>
 * Change Log - Who : When : Comment
 */
public class WeblogicMercuryEventQSenderTest extends AbstractJunit4Test {

    private static final Log LOG = LogFactory.getLog(WeblogicMercuryEventQSenderTest.class);

    @Autowired
    @Qualifier("jmsTemplate")
    private JmsTemplate wlQueueTemplate;

    protected void setup() {
    }

    @Override
    protected void destroy() {
    }

    @Test
    public void testSendMessage() throws InterruptedException {

        final String mesg = "Test message";

        LOG.debug("Sending message...." + mesg);

		MessageCreator messageCreator=new MessageCreator() {
		public Message createMessage(Session session) throws
                JMSException {
		return session.createTextMessage(mesg);}
		};
		wlQueueTemplate.send("mercury.jms.mercuryOutboundSAF", messageCreator);
        Thread.sleep(5000);
	}
}
