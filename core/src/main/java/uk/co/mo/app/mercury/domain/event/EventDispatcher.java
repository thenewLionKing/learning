package uk.co.mo.app.mercury.domain.event;

import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import uk.co.mo.app.mercury.cs.applicationerror.ApplicationErrorSeverity;
import uk.co.mo.app.mercury.cs.applicationerror.ApplicationErrorType;
import uk.co.mo.app.mercury.cs.applicationerror.LogRuntimeError;
import uk.co.mo.app.mercury.cs.applicationerror.MoRuntimeException;
import uk.co.mo.app.mercury.cs.system.ConnectionStatus;
import uk.co.mo.app.mercury.cs.system.SystemStatus;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 17:22
 * <p/>
 * Change Log - Who : When : Comment
 */
@Component
public class EventDispatcher {

    private static final Log LOG = LogFactory.getLog(EventDispatcher.class);

    @Autowired
    private EventBuilderFactory eventBuilderFactory;

    @Autowired
    private MarshallEvent marshaller;


    @Autowired
    @Qualifier("jmsTemplate")
    private JmsTemplate wlQueueTemplate;
    
    @LogRuntimeError
    public void dispatchEvent(final EventKey key) throws UnknownEventException, EventNotGeneratedException {

        LOG.debug("Sending event...." + key);

        final Event event = eventBuilderFactory.getEventBuilder(key).getEvent(key);

        MessageCreator messageCreator = new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                try {
                    return session.createTextMessage(marshaller.serialiseEvent(event).toString());
                } catch (IOException e) {
                    /*throw new MoRuntimeException(ApplicationErrorType.MDP_ENGINE_NOTIFICATION_FAILURE.getErrorType(),
                            event.getKey().getEventId(), ApplicationErrorSeverity.HIGH.getCode(),
                            "Business Event Notification failure", e.getCause(), true);*/
                	throw new JMSException("Unable to serialise event to XML format,  "+key.toString()+" "+e.getCause());
                }
            }
        };
        try{
        	wlQueueTemplate.send("jmsMercuryEventsQ", messageCreator);
        	SystemStatus.setJmsConnectionStatus(ConnectionStatus.UP);
        }catch(JmsException jme){
        	SystemStatus.setJmsConnectionStatus(ConnectionStatus.DOWN);
        	throw new MoRuntimeException(ApplicationErrorType.MERCURY_JMS_OUTBOUND_FAILURE.getErrorType(),
                    event.getKey().getEventId(), ApplicationErrorSeverity.HIGH.getCode(),
                    "MERCURY Business Event Notification failure", jme.getCause(), true);
        }
    }
}
