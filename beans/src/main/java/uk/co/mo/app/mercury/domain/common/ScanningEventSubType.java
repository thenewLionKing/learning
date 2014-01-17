package uk.co.mo.app.mercury.domain.common;

public enum ScanningEventSubType {
	SCANNING("30");
	
	
	private String type;

	ScanningEventSubType(){
	}
	
	
	ScanningEventSubType(String type) {
		this.type = type;
	}
    
	public String getType() {
        return type;
    }
	
    public static ScanningEventSubType getScanningEventType(String type) {
         for (ScanningEventSubType c: ScanningEventSubType.values()) {
             if (c.type.equals(type)) {
                 return c;
             }
         }
         return null;
     }
}
