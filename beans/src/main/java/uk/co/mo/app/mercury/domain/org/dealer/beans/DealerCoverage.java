package uk.co.mo.app.mercury.domain.org.dealer.beans;

/**
 * <p/>
 * User: prabat
 * Date: 02-Jun-2011
 * Time: 17:16:12
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum DealerCoverage {

    Unknown((short)0),
    Local((short)1),
    England((short)2),
    Scotland((short)3),
    NI((short)4),
    Wales((short)5);

    private short code;

    DealerCoverage(short code) {
        this.code = code;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    public static DealerCoverage getDealerCoverage(short code) {
        switch (code) {
            case 1: return Local;
            case 2: return England;
            case 3: return Scotland;
            case 4: return NI;
            case 5: return Wales;
            default: return Unknown;
        }
    }
}
