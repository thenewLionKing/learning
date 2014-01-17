/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.applicationerror;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import uk.co.mo.app.mercury.cs.applicationerror.service.ApplicationErrorService;

/**
 * An aspect to intercept application error and log in application error framework
 *
 * <p/>
 * User: prabat
 * Date: 28-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
@Aspect
@Configurable
public class MoApplicationExceptionHandler {

    private static final Log LOG = LogFactory.getLog(MoApplicationExceptionHandler.class);

    private ApplicationErrorService applicationErrorService;

    @Autowired
    public void setApplicationErrorService(ApplicationErrorService applicationErrorService) {
        this.applicationErrorService = applicationErrorService;
    }

    @AfterThrowing(pointcut = "execution(public * uk.co.mo.app.mercury.domain..service..*.*(..)) " +
            "|| @annotation(LogRuntimeError)", throwing = "e")
    public void handleMoApplicationException(MoRuntimeException e) throws Throwable {

        try {
            if(e.isLogError())
                applicationErrorService.createApplicationError(e);
        } finally {
            LOG.error("Caught MoRuntimeException", e);
        }
    }
}
