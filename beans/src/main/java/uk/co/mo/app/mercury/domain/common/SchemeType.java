package uk.co.mo.app.mercury.domain.common;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 08:51
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum SchemeType {
    CAR((short)1),
    PWS((short)2),
    CAR_PWS((short)3);

    static final int PRODUCT_TYPE_CAR = 3;
    static final int PRODUCT_TYPE_WHEELCHAIR = 1;
    static final int PRODUCT_TYPE_SCOOTER = 2;

    private short code;

    SchemeType(short code) {
        this.code = code;
    }

    public short getCode() {
        return code;
    }

    public static SchemeType getSchemeType(short code) throws InvalidAgreementSchemeTypeException {
        if(CAR.getCode() == code) return CAR;
        if(PWS.getCode() == code) return PWS;
        if(CAR_PWS.getCode() == code) return CAR_PWS;

        throw new InvalidAgreementSchemeTypeException("Scheme code not found " + code);
    }

	public static SchemeType getSchemeTypeForProductType(int productTypeId) throws InvalidAgreementSchemeTypeException {
		switch (productTypeId) {
		case PRODUCT_TYPE_CAR:
			return CAR;
		case PRODUCT_TYPE_WHEELCHAIR:
			return PWS;
		case PRODUCT_TYPE_SCOOTER:
			return PWS;
		default:
			throw new InvalidAgreementSchemeTypeException("Scheme code not found for product type " + productTypeId);

		}
	}
}
