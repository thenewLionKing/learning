package uk.co.mo.app.mercury.domain.org.dealer.beans;

/**
 * <p/>
 * User: prabat
 * Date: 02-Jun-2011
 * Time: 12:38:21
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum DealerPartner {

    Unknown((short)0),
    Premier((short)1),
    Dealer((short)2),
    HP_Only((short)3),
    Service_Agent((short)4),
    Premier_Service_Agent((short)5),
    Converter((short)6),
    PWS_Dealer((short)7);

    private short code;

    DealerPartner(short code) {
        this.code = code;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    public static DealerPartner getDealerPartner(short code) {
        switch (code) {
            case 1: return DealerPartner.Premier;
            case 2: return DealerPartner.Dealer;
            case 3: return DealerPartner.HP_Only;
            case 4: return DealerPartner.Service_Agent;
            case 5: return DealerPartner.Premier_Service_Agent;
            case 6: return DealerPartner.Converter;
            case 7: return DealerPartner.PWS_Dealer;
            default:return DealerPartner.Unknown;
        }
    }
}
