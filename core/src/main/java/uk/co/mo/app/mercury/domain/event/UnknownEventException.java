package uk.co.mo.app.mercury.domain.event;

public class UnknownEventException extends Exception {

	private static final long serialVersionUID = 7340000415928204285L;

	public UnknownEventException() {
		super();
	}

	public UnknownEventException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnknownEventException(String message) {
		super(message);
	}

	public UnknownEventException(Throwable cause) {
		super(cause);
	}

	
}
