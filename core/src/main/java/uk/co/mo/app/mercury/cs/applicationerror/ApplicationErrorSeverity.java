package uk.co.mo.app.mercury.cs.applicationerror;

/**
 * Put your class comment here
 * <p/>
 * User: prabat
 * Date: 29-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum ApplicationErrorSeverity {

    LOW(1), MEDIUM(2), HIGH(3);

    private int code;

    ApplicationErrorSeverity(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
