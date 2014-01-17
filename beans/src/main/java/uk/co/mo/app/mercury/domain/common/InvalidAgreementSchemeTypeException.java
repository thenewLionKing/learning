package uk.co.mo.app.mercury.domain.common;

/**
 * <p/>
 * User: prabat
 * Date: 13/06/11
 * Time: 08:52
 * <p/>
 * Change Log - Who : When : Comment
 */
public class InvalidAgreementSchemeTypeException extends Exception {

    public InvalidAgreementSchemeTypeException() {
    }

    public InvalidAgreementSchemeTypeException(String message) {
        super(message);
    }

    public InvalidAgreementSchemeTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAgreementSchemeTypeException(Throwable cause) {
        super(cause);
    }
}
