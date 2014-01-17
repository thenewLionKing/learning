package uk.co.mo.app.mercury.web.cs.ws;

/**
 * <p/>
 * User: prabat
 * Date: 17-May-2011
 * Time: 16:29:27
 * <p/>
 * Change Log - Who : When : Comment
 */
public class BindingException extends Exception {

    public BindingException() {
    }

    public BindingException(String message) {
        super(message);
    }

    public BindingException(String message, Throwable rootCause) {
        super(message, rootCause);
    }

    public BindingException(Throwable rootCause) {
        super(rootCause);
    }
}
