package uk.co.mo.app.mercury.cs.applicationerror;

/**
 * Put your class comment here
 * <p/>
 * User: prabat
 * Date: 29-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum ApplicationErrorType {

    /**
     * Generic runtime exception from support layer
     */
    SERVICE_LAYER_RUNTIME_EXCEPTION(100001),
    AGREEMENT_EVENT_NOTIFICATION_FAILURE(100002),
    MDP_ENGINE_NOTIFICATION_FAILURE(100003),
    PWS_MDP_INVOICE_POSTING_FAILURE(100004),
    MERCURY_JMS_OUTBOUND_FAILURE(100005),
    MERCURY_SOA_INTERFACE_FAILURE(100006)
    ;

    private int errorType;

    ApplicationErrorType(int errorType) {
        this.errorType = errorType;
    }

    public int getErrorType() {
        return errorType;
    }
}
