package uk.co.mo.app.mercury.domain.serviceagent.service;

/**
 * <p/>
 * User: prabat
 * Date: 08/09/11
 * Time: 11:02
 * <p/>
 * Change Log - Who : When : Comment
 */
public class ServiceAgentValidationException extends Exception {
    private static final long serialVersionUID = 630604642511429088L;

    public ServiceAgentValidationException() {
    }

    public ServiceAgentValidationException(String s) {
        super(s);
    }

    public ServiceAgentValidationException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ServiceAgentValidationException(Throwable throwable) {
        super(throwable);
    }
}
