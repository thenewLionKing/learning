package uk.co.mo.app.mercury.cs.applicationerror.data;

/**
 * Put your class comment here
 * <p/>
 * User: prabat
 * Date: 28-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
public enum ApplicationErrorStatuses {

    NEW(1), OPEN(2), CLOSED(3);

    private final int status;

    ApplicationErrorStatuses(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
