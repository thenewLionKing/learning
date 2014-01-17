/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */

package uk.co.mo.app.mercury.cs.applicationerror;

/**
 * Put your class comment here
 * <p/>
 * User: prabat
 * Date: 27-Jan-2010
 * Time: 19:23:48
 * <p/>
 * Change Log - Who : When : Comment
 */
public class MoRuntimeException extends RuntimeException {

    static final long serialVersionUID = -5536179804702731311L;  // for backwards compatibility.
    private final Integer errorTypeId;
    private final String failureKey;
    private final Integer errorSeverityId;
    private final boolean logError;

    /**
     * Constructs a runtime exception
     *
     * @param message
     */
    public MoRuntimeException(String message) {
        this(message, null);
    }

    public MoRuntimeException(String message, Throwable cause) {
        this(null, null, null, message, cause, false);
    }

    /**
     * Constructs an <tt>MFLApplicationException</tt>
     *
     * @param errorTypeId     the error type
     * @param failureKey      optional primary key of an entity which caused the failure
     * @param errorSeverityId how severe the error is
     */
    public MoRuntimeException(Integer errorTypeId, String failureKey, Integer errorSeverityId ) {
        this(errorTypeId, failureKey, errorSeverityId, null, null, true);
    }

    /**
     * Constructs an <tt>MFLApplicationException</tt> with an exception to nest
     *
     * @param errorTypeId     the error type
     * @param failureKey      optional primary key of an entity which caused the failure
     * @param errorSeverityId how severe the error is
     * @param nested          the exception to nest
     */
    public MoRuntimeException(Integer errorTypeId, String failureKey, Integer errorSeverityId, Throwable nested ) {
        this(errorTypeId, failureKey, errorSeverityId, null, nested, true);
    }

    /**
     * Constructs an <tt>MFLApplicationException</tt> with a message
     *
     * @param errorTypeId     the error type
     * @param failureKey      optional primary key of an entity which caused the failure
     * @param errorSeverityId how severe the error is
     * @param message         a failure message
     */
    public MoRuntimeException(Integer errorTypeId, String failureKey, Integer errorSeverityId, String message ) {
        this(errorTypeId, failureKey, errorSeverityId, message, null, true);
    }

    /**
     * Constructs an <tt>MFLApplicationException</tt>
     *
     * @param errorTypeId     the error type
     * @param failureKey      optional primary key of an entity which caused the failure
     * @param errorSeverityId how severe the error is
     * @param message         a failure message
     * @param nested          the exception to nest
     * @param logError
     */
    public MoRuntimeException(Integer errorTypeId, String failureKey, Integer errorSeverityId, String message, Throwable nested, boolean logError) {
        super( message, nested );
        this.errorTypeId = errorTypeId;
        this.failureKey = failureKey;
        this.errorSeverityId = errorSeverityId;
        this.logError = logError;
    }

    public Integer getErrorTypeId() { return errorTypeId; }
    public String getFailureKey() { return failureKey; }
    public Integer getErrorSeverityId() { return errorSeverityId; }
    public boolean isLogError() { return logError; }
}
