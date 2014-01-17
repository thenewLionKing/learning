package uk.co.mo.app.mercury.web.cs.ws;

/**
 * <p/>
 * User: prabat
 * Date: 18-May-2011
 * Time: 09:45:38
 * <p/>
 * Change Log - Who : When : Comment
 */
public class CustomServletException extends RuntimeException {

    public CustomServletException() {
    }

    public CustomServletException(String s) {
        super(s);
    }

    public CustomServletException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public CustomServletException(Throwable throwable) {
        super(throwable);
    }
}
