/**
 * Copyright (c) 2010 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorised use or copying is prohibited.
 */
package uk.co.mo.app.mercury.cs.jms;
/**
 *
 * @author: julianau
 * @date: 9 Apr 2010
 */

import javax.jms.ExceptionListener;
import javax.jms.JMSException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import uk.co.mo.app.mercury.cs.applicationerror.MoRuntimeException;

@Component
public class JmsExceptionListener implements ExceptionListener{
	private static final Log LOG = LogFactory.getLog(JmsExceptionListener.class);
    
	public void onException( final JMSException e ) {
		LOG.error("Caught jms exception: "+e);
		throw new MoRuntimeException("Caught jms exception: ",e);
	}
}
