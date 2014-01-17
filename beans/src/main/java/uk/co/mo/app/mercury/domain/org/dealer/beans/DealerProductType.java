package uk.co.mo.app.mercury.domain.org.dealer.beans;

/**
 * <p/>
 * User: prabat
 * Date: 28/06/11
 * Time: 12:24
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum DealerProductType {

    Scooter((short)2),
    PoweredWheelchair((short)1),
    CustomBuiltPoweredWheelchair((short)3),
    Unknown((short)0);

    private short code;

    DealerProductType(short code) {
        this.code = code;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }
    
    public static DealerProductType getDealerProductType(short code) {
        switch (code) {
            case 1: return PoweredWheelchair;
            case 2: return Scooter;
            case 3: return CustomBuiltPoweredWheelchair;
            default: return Unknown;
        }
    }
}
