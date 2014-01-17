/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */

package uk.co.mo.app.mercury.cs.applicationerror.service;

import uk.co.mo.app.mercury.cs.applicationerror.MoRuntimeException;

/**
 * A simple support to create and audit application errors
 *
 * <p/>
 * User: Praba T
 * Date: 28/01/10
 * <p/>
 * Change Log - Who : When : Comment
 */
public interface ApplicationErrorService {

    /**
     * creates application error for a runtime exception
     *
     * @param e exception that need to be logged.
     */
    void createApplicationError(MoRuntimeException e);
}
