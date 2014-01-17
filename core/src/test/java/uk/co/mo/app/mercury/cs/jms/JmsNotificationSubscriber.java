package uk.co.mo.app.mercury.cs.jms;

import org.apache.activemq.command.ActiveMQObjectMessage;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import uk.co.mo.app.mercury.cs.applicationerror.MoRuntimeException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * <p/>
 * User: prabat
 * Date: 27-Jan-2011
 * Time: 16:16:26
 * <p/>
 * Change Log - Who : When : Comment
 */

public abstract class JmsNotificationSubscriber implements MessageListener {

    private static final Log LOG = LogFactory.getLog(JmsNotificationSubscriber.class);

    public void onMessage(Message message) {
        try {
            LOG.debug("Received message from: "+ message.getJMSDestination().toString());
            LOG.debug("classname:"+message.getClass().getName());
            if(message instanceof ActiveMQObjectMessage){
                ActiveMQObjectMessage msg = (ActiveMQObjectMessage)message;
                processNotification(msg.getObject());
            } else {
                LOG.warn("Ignoring unknown message type: " + message.getClass().getName());
            }
        } catch (JMSException e) {
            throw new MoRuntimeException("Exception caught processing message: "+message,e);
        }
    }

    protected abstract void processNotification(Object obj);
}
