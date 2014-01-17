/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import uk.co.mo.app.mercury.cs.remoting.support.SystemUser;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * An abstract static class that provides various system utility functions
 *
 * <p/>
 * User: prabat
 * Date: 28-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
public abstract class SystemUtils {

    private static final Log LOG = LogFactory.getLog(SystemUtils.class);
    private static final String UNKNOWN_HOST = "UNKNOWN";
    private static final String UNKNOWN_USER = "UNKNOWN";

    /**
     * Gets the hostname or returns "UNKNOWN" if the host is not known.
     * @return String hostname
     */
    public static String getHostname() {
        String result;
        try {
            result = InetAddress.getLocalHost().getHostName();
        }
        catch ( UnknownHostException uue ) {
            LOG.warn( "Unknown host exception from InetAddress, non-fatal" );
            result = UNKNOWN_HOST;
        }
        return result == null ? UNKNOWN_HOST : result;
    }

    /**
     * Gets the user name of the system user
     *
     * @return String user name
     */
    public static String getUsername() {
        //SecurityContext sc = SecurityContextHolder.getContext();
        //String username = sc.getAuthentication().getName();
        String username = SystemUser.getUserName();
        return username == null ? UNKNOWN_USER : username;
        //return UNKNOWN_USER;
    }
}
