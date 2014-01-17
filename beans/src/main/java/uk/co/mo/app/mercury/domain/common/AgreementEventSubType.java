package uk.co.mo.app.mercury.domain.common;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 08:55
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum AgreementEventSubType {
    AGREEMENT_AMENDED("1"),
    AGREEMENT_NEW("2"),
    AGREEMENT_VOIDED("3"),
    AGREEMENT_NOVATION("4"),
    ADAPTATION_CHANGED("7"),
    AGREEMENT_LIVE("14"),
    AGREEMENT_EXPIRED("15"),
    AGREEMENT_CANCELLED("16"),
    AGREEMENT_TERMINATED("17"),
    AGREEMENT_REINSTATED("18"),
    AGREEMENT_HANDOVER("19"),
    BACK_DATED_AGREEMENT("20"),
    LEASE_EXTENSION_START("27"),
    LEASE_EXTENSION_END("28"),
    AGREEMENT_VEHICLE_ORDERED("31"),
	AGREEMENT_JOINT_APPLICANT_NOVATION("41"),
	AGREEMENT_APPOINTEE_NOVATION("42"),
	AGREEMENT_JOINT_APPOINTEE_NOVATION("43"),
	LEASE_EXTENSION_AMENDED("45"),
    PWS_STLE_START("46"),
    PWS_STLE_TERMINATION("47"),
    PWS_STLE_EXPIRY("48");

    private String type;

    AgreementEventSubType() {
    }

    AgreementEventSubType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static AgreementEventSubType getAgreementEventType(String type) {
        for (AgreementEventSubType c: AgreementEventSubType.values()) {
            if (c.type.equals(type)) {
                return c;
            }
        }
        return null;
    }
}
