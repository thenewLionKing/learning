package uk.co.mo.app.mercury.domain.common;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 08:58
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum AgreementStatus {

    NEW         ((short)-1),
    PENDING     ((short)0),
    LIVE        ((short)1),
    TERMINATED  ((short)2),
    PRE_LIVE    ((short)3),
    RETURNED    ((short)4),
    RECEIVED    ((short)5),
    ELIGIBILITY ((short)6),
    CONFIRMED   ((short)7),
    HANDOVER    ((short)8),
    VOIDED      ((short)9),
    EXPIRED     ((short)10),
    CANCELLED   ((short)11),
    CANCELLATION_IN_PROGRESS((short)12)
    ;

    private static final String INFO_CANCELLATION_IN_PROGRESS = "(Cancellation in Progress)";

    /**
     * @return the statusCode
     */
    public short getStatusCode() {
        return statusCode;
    }

    private short statusCode;
    /**
     * Attribute to hold any additional information such as 'Cancellation in progress'
     */
    private String additionalInfo = "";


    AgreementStatus(short statusCode){
        this.statusCode = statusCode;
    }

    public static AgreementStatus getAgreementStatus(short statusCode, String terminationType)
            throws InvalidAgreementStatusException {
        if(statusCode == TERMINATED.getStatusCode() && ("[".equals(terminationType) || "]".equals(terminationType) )) return AgreementStatus.CANCELLED;
        if(statusCode == TERMINATED.getStatusCode() && terminationType != null) return AgreementStatus.TERMINATED;
        if(statusCode == TERMINATED.getStatusCode() && terminationType == null) return AgreementStatus.EXPIRED;
        if(statusCode == ELIGIBILITY.getStatusCode()) return AgreementStatus.ELIGIBILITY;
        if(statusCode == PENDING.getStatusCode()) return AgreementStatus.PENDING;
        if(statusCode == CONFIRMED.getStatusCode()) return AgreementStatus.CONFIRMED;
        if(statusCode == HANDOVER.getStatusCode() && terminationType == null ) return AgreementStatus.HANDOVER;
        if(statusCode == HANDOVER.getStatusCode() && ("[".equals(terminationType) || "]".equals(terminationType))) return AgreementStatus.CANCELLATION_IN_PROGRESS;
        if(statusCode == LIVE.getStatusCode()) return AgreementStatus.LIVE;
        if(statusCode == VOIDED.getStatusCode()) return AgreementStatus.VOIDED;
        if(statusCode == CANCELLATION_IN_PROGRESS.getStatusCode()) return AgreementStatus.CANCELLATION_IN_PROGRESS;

        throw new InvalidAgreementStatusException("Agreement status " + statusCode + " unknown");
    }

}
