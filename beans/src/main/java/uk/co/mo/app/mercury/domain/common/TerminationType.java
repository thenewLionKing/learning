package uk.co.mo.app.mercury.domain.common;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 08:53
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum TerminationType {

    	VMS_DEATH("1", "VMS Death"),
	VMS_INSURANCE("2", "VMS Insurance"),
	VMS_STOPPED_ALLOWANCE("3", "VMS Stopped Allowance"),
	VOLUNTARY("4", "Voluntary"),
	HP_50_SETTLEMENT("5", "HP 50 Percent Settlement"),
	HP_FULL_SETTLEMENT("6", "HP Full Settlement"),
	DEATH("A", "Death"),
	DEATH_NO_REFUND("B", "Death - no refund"),
	MECHANICAL_FAILURE("C", "Mechanical Failure"),
	HEALTH_NO_SECOND_CAR("D", "Health - No second car"),
	FINANCIAL_HARDSHIP_REFUND("E", "Financial hardship - with refund"),
	NO_DRIVER("F", "No driver"),
	EX_REFUND("G", "Exceptional - with refund"),
	FINANCIAL_HARDSHIP_NO_REFUND("H", "Financial hardship - no refund"),
	EX_NO_REFUND("I", "Exceptional - no refund"),
	EX_COSTS_NO_REFUND("J", "Exceptional - with costs - no refund"),
	INS_WRITE_OFF("K", "Insurance write off"),
	STOPPED_ALLOWANCE_NO_REFUND("L", "Stopped allowance - no refund"),
	HEALTH_SECND_CAR("M", "Health - Second car"),
	EX_COSTS_REFUND("N", "Exceptional - with costs - with refund"),
	UNSUITABLE_VEHICLE("O", "Unsuitable Vehicle"),
	XS_MILEAGE("P", "Excess mileage"),
	STOPPED_ALLOWANCE_REFUND("Q", "Stopped allowance - with refund"),
	ABANDONED_VEHICLE("R", "Abandoned vehicle "),
	INSURANCE_BREACHES("S", "Insurance breaches"),
	CRIMINAL_ACTIVITY("T", "Criminal activity"),
	CONTRACTUAL_BREACHES("U", "Other contractual breaches"),
	REPUDIATIONS("V", "RepudiationS"),
	CANCELLATION_NO_ASSET("W", "Cancellation - Without Asset"),
	TERMINATED_ALTERNATIVE_TRANSPORT("X", "Terminated with alternative transport"),
	EXPIRY("Y", "Expiry"),
	UNKNOWN("Z", "Unknown");

	private String type;
	private String desc;

	TerminationType(String type, String desc) {
		this.type = type;
		this.desc = desc;
	}

	/**
	 * Gets the enumerated type for the given type
	 * @param type
	 * @return TerminationType
	 */
	public static TerminationType getTerminationType(String type){
		if(type == null || "".equals(type))return null;
		if("1".equals(type)) return VMS_DEATH;
		if("2".equals(type)) return VMS_INSURANCE;
		if("3".equals(type)) return VMS_STOPPED_ALLOWANCE;
		if("4".equals(type)) return VOLUNTARY;
		if("5".equals(type)) return HP_50_SETTLEMENT;
		if("6".equals(type)) return HP_FULL_SETTLEMENT;
		if("A".equals(type)) return DEATH;
		if("B".equals(type)) return DEATH_NO_REFUND;
		if("C".equals(type)) return MECHANICAL_FAILURE;
		if("D".equals(type)) return HEALTH_NO_SECOND_CAR;
		if("E".equals(type)) return FINANCIAL_HARDSHIP_REFUND;
		if("F".equals(type)) return NO_DRIVER;
		if("G".equals(type)) return EX_REFUND;
		if("H".equals(type)) return FINANCIAL_HARDSHIP_NO_REFUND;
		if("I".equals(type)) return EX_NO_REFUND;
		if("J".equals(type)) return EX_COSTS_NO_REFUND;
		if("K".equals(type)) return INS_WRITE_OFF;
		if("L".equals(type)) return STOPPED_ALLOWANCE_NO_REFUND;
		if("M".equals(type)) return HEALTH_SECND_CAR;
		if("N".equals(type)) return EX_COSTS_REFUND;
		if("O".equals(type)) return UNSUITABLE_VEHICLE;
		if("P".equals(type)) return XS_MILEAGE;
		if("Q".equals(type)) return STOPPED_ALLOWANCE_REFUND;
		if("R".equals(type)) return ABANDONED_VEHICLE;
		if("S".equals(type)) return INSURANCE_BREACHES;
		if("T".equals(type)) return CRIMINAL_ACTIVITY;
		if("U".equals(type)) return CONTRACTUAL_BREACHES;
		if("V".equals(type)) return REPUDIATIONS;
		if("W".equals(type)) return CANCELLATION_NO_ASSET;
		if("X".equals(type)) return TERMINATED_ALTERNATIVE_TRANSPORT;
		if("Y".equals(type)) return EXPIRY;

		return UNKNOWN;
	}

	/**
	 * Gets the description of the termination type
	 * @return
	 */
	public String getDescription(){
		return this.desc;
	}

    public String getType() {
        return type;
    }
}
