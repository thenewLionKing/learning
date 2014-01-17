package uk.co.mo.app.mercury.domain.common;

public enum VehicleEventSubType {

	VEHICLE_CUSTOMER_SALE("37"),
	VEHICLE_HANDBACK("38"),
	VEHICLE_REFURBISHED("39"),
	VEHICLE_AMENDED("40"),
	VEHICLE_DELIVERED("44");
	
	private String type;

	VehicleEventSubType(){
	}
	
	
	VehicleEventSubType(String type) {
		this.type = type;
	}
    
	public String getType() {
        return type;
    }
	
    public static VehicleEventSubType getVehicleEventType(String type) {
         for (VehicleEventSubType c: VehicleEventSubType.values()) {
             if (c.type.equals(type)) {
                 return c;
             }
         }
         return null;
     }
}
