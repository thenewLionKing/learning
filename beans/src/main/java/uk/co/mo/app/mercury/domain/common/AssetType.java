package uk.co.mo.app.mercury.domain.common;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 08:52
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum AssetType {

    	/**
	 * Power Wheelchair
	 *
	 */
	POWERED_WHEELCHAIR((short)1, "POWERED WHEELCHAIR"),
	/**
	 * Scooter
	 *
	 */
	SCOOTER((short)2, "SCOOTER"),
	/**
	 * Car
	 *
	 */
	CAR((short)3, "CAR");

	private final short code;

    private final String name;

	/**
	 *
	 * @param code
     * @param name
	 */
	AssetType(short code, String name){
		this.code = code;
        this.name = name;
	}

	public short getCode(){
		return code;
	}

    public static AssetType getProductType(short code) {
        if(POWERED_WHEELCHAIR.getCode() == code) {
            return POWERED_WHEELCHAIR;
        } else if(SCOOTER.getCode() == code) {
            return SCOOTER;
        } else {
            return CAR;
        }
    }

    public String getName() {
        return name;
    }
}
