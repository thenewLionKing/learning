package uk.co.mo.app.mercury.cs.jms;

import org.springframework.stereotype.Component;
import org.springframework.util.ErrorHandler;
import uk.co.mo.app.mercury.cs.applicationerror.LogRuntimeError;
import uk.co.mo.app.mercury.cs.applicationerror.MoRuntimeException;

/**
 * <p/>
 * User: prabat
 * Date: 11-Feb-2011
 * Time: 15:06:11
 * <p/>
 * Change Log - Who : When : Comment
 */
@Component
public class JmsListenerErrorHandler implements ErrorHandler {

    @LogRuntimeError
    public void handleError(Throwable throwable) {
        if(throwable instanceof MoRuntimeException) {
            throw (MoRuntimeException) throwable;
        }
    }
}
