package uk.co.mo.app.mercury.domain.org.dealer.service;

/**
 * <p/>
 * User: prabat
 * Date: 08/09/11
 * Time: 16:05
 * <p/>
 * Change Log - Who : When : Comment
 */
public class DealerNotFoundException extends Exception {
    public DealerNotFoundException() {
    }

    public DealerNotFoundException(String s) {
        super(s);
    }

    public DealerNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public DealerNotFoundException(Throwable throwable) {
        super(throwable);
    }
}
