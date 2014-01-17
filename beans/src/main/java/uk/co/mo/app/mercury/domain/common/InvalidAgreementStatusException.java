package uk.co.mo.app.mercury.domain.common;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 08:59
 * <p/>
 * Change Log - Who : When : Comment
 */
public class InvalidAgreementStatusException extends Exception {
    /**
     *
     */
    public InvalidAgreementStatusException() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     */
    public InvalidAgreementStatusException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public InvalidAgreementStatusException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public InvalidAgreementStatusException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

}
