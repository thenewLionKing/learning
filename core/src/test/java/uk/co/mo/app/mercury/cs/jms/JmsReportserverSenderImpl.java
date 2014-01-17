/**
 * Copyright (c) 2010 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorised use or copying is prohibited.
 */
package uk.co.mo.app.mercury.cs.jms;

import java.io.Serializable;

import javax.jms.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Sends a message to the Reportserver queue
 * @author julianau
 * @date: 11 Mar 2010
 */
@Component
public class JmsReportserverSenderImpl implements JmsSender {
	private static final Log LOG = LogFactory.getLog(JmsReportserverSenderImpl.class);
	
	@Autowired
    @Qualifier("jmsTemplate")
	private JmsTemplate amqJmsTemplate; // Spring JMS template to use for sending the message

	/**
	 * Sends the serializable object to the destination
	 * @param serializable
	 */
	@Transactional
	public void send(final Serializable serializable) {
		if(LOG.isDebugEnabled()){
			LOG.debug("getDefaultDestination: "+ amqJmsTemplate.getDefaultDestination());
			LOG.debug("getDeliveryMode: "+ amqJmsTemplate.getDeliveryMode());
			LOG.debug("getConnectionFactory: "+ amqJmsTemplate.getConnectionFactory());
			LOG.debug("object to send: "+ serializable);
		}
		
		//Create a JMS message & send to the destination
		this.amqJmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
		    	  ObjectMessage message = session.createObjectMessage(serializable);
		    	  return message;
		      }
		    });
	}
}
