/**
 * Copyright (c) 2010 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorised use or copying is prohibited.
 */
package uk.co.mo.app.mercury.cs.jms;

import java.io.Serializable;

/**
 * Interface for all classes sending a JMS message
 * @user: JulianAu
 * @since: 11-Mar-2010
 */
public interface JmsSender {

	/**
	 * Sends the serializable object to the destination
	 * @param serializable
	 */
	public void send(Serializable serializable);
	
}
