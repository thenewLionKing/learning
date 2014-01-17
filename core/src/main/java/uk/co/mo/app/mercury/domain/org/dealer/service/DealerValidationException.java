package uk.co.mo.app.mercury.domain.org.dealer.service;

/**
 * <p/>
 * User: prabat
 * Date: 01/07/11
 * Time: 12:46
 * <p/>
 * Change Log - Who : When : Comment
 */
public class DealerValidationException extends Exception {


	private static final long serialVersionUID = 630604642511429088L;

	public DealerValidationException() {
    }

    public DealerValidationException(String s) {
        super(s);
    }

    public DealerValidationException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public DealerValidationException(Throwable throwable) {
        super(throwable);
    }
}
