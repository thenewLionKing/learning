package uk.co.mo.app.mercury.domain.common;

public enum CustomerEventSubType {
	AMENDED_CUSTOMER("5"),
	CUSTOMER_LAPSED("6"),
	DLA_CHANGED("8"),
	JOINT_CUSTOMER_AMENDED("10"),
	APPOINTEE_AMENDED("11"),
	JOINT_DLA_CHANGED("12"),
	JOINT_APPOINTEE_AMENDED("13"),
	NEW_APPLICANT("21"),
	NEW_JOINT_APPLICANT("22"),
	NEW_APPOINTEE("23"),
	NEW_JOINT_APPOINTEE("24"),
	NEW_DRIVER("25"),
	NEW_NEXT_OF_KIN("26");
	
	
	
	private String type;

	CustomerEventSubType(){
	}
	
	
	CustomerEventSubType(String type) {
		this.type = type;
	}
    
	public String getType() {
        return type;
    }
	
    public static CustomerEventSubType getCustomerEventType(String type) {
         for (CustomerEventSubType c: CustomerEventSubType.values()) {
             if (c.type.equals(type)) {
                 return c;
             }
         }
         return null;
     }
}
