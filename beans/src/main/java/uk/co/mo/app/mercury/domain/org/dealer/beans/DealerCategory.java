package uk.co.mo.app.mercury.domain.org.dealer.beans;

/**
 * <p/>
 * User: prabat
 * Date: 02-Jun-2011
 * Time: 12:57:00
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum DealerCategory {
    Unknown((short)0),
    Car((short)1),
    PWS((short)2);

    DealerCategory(short code) {
        this.code = code;
    }

    private short code;

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    public static DealerCategory getDealerCategory(short code) {
        switch (code) {
            case 1: return DealerCategory.Car;
            case 2: return DealerCategory.PWS;
            default: return DealerCategory.Unknown;
        }
    }
}
