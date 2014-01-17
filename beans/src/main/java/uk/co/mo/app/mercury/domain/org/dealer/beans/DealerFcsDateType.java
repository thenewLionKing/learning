package uk.co.mo.app.mercury.domain.org.dealer.beans;

/**
 * <p/>
 * User: prabat
 * Date: 02-Jun-2011
 * Time: 13:59:13
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum DealerFcsDateType {

    Application_Pack_Sent("A"),
    Agreement_Received("B"),
    Credit_Application_Received("C"),
    Direct_Debit_Received("D"),
    Password_Issued("G"),
    Contract_Received_Q("Q"),
    Contract_Received_T("T");
    
    private String code;

    DealerFcsDateType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static DealerFcsDateType getDealerFcsDateType(String code) {

        if(code.equals("A")) return Application_Pack_Sent;
        if(code.equals("B")) return Agreement_Received;
        if(code.equals("C")) return Credit_Application_Received;
        if(code.equals("D")) return Direct_Debit_Received;
        if(code.equals("G")) return Password_Issued;
        if(code.equals("Q")) return Contract_Received_Q;
        if(code.equals("T")) return Contract_Received_T;

        return null;
    }
}
