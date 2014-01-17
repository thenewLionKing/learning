/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.applicationerror.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import uk.co.mo.app.mercury.cs.applicationerror.MoRuntimeException;
import uk.co.mo.app.mercury.cs.applicationerror.data.ApplicationErrorStatuses;
import uk.co.mo.app.mercury.cs.applicationerror.data.VrmApplicationErrorAuditEntity;
import uk.co.mo.app.mercury.cs.applicationerror.data.VrmApplicationErrorEntity;
import uk.co.mo.app.mercury.cs.applicationerror.data.VrmErrorTypeEntity;
import uk.co.mo.app.mercury.cs.util.SystemUtils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A concrete call that implements ApplicationErrorService and uses enterprise
 * error framework
 * <p/>
 * <p/>
 * User: prabat
 * Date: 28-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
@Service
public class ApplicationErrorServiceImpl implements ApplicationErrorService {
    private static final Log LOG = LogFactory.getLog(ApplicationErrorServiceImpl.class);
    private static final int MAX_COMMENT_LENGTH = 1024;
    private static String DATE_FORMAT = "dd-MMM-yyyy kk:mm:ss";

    /**
     * Creates an error log in enterprise application error framework, so that it can be
     * monitored via enterprise admin gui app.
     *
     * @param e exception that need to be logged.
     */

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void createApplicationError(MoRuntimeException e) {
        String username = SystemUtils.getUsername();
        VrmApplicationErrorEntity applicationError = new VrmApplicationErrorEntity();
        final Date now = new Date();
        VrmErrorTypeEntity errorTypeEntity = VrmErrorTypeEntity.findVrmErrorTypeEntity(e.getErrorTypeId());
        applicationError.setApplicationId(errorTypeEntity.getApplicationId());
        applicationError.setErrorType(errorTypeEntity);
        applicationError.setFailureKey(e.getFailureKey());
        applicationError.setErrorSeverityId(e.getErrorSeverityId());
        applicationError.setApplicationMessage(e.getMessage());
        applicationError.setException(convertThrowableToString(e.getCause()));
        applicationError.setLoggedBy(username);
        applicationError.setLoggedDate(now);
        applicationError.setErrorStatusId(ApplicationErrorStatuses.NEW.getStatus());
        applicationError.setHostname(SystemUtils.getHostname());
        applicationError.setLastRepeatedDate(now);
        applicationError = checkRepeated(applicationError);

        VrmApplicationErrorAuditEntity errorAudit = new VrmApplicationErrorAuditEntity();
        errorAudit.setErrorSeverityId(e.getErrorSeverityId());
        errorAudit.setErrorStatusId(ApplicationErrorStatuses.NEW.getStatus());
        errorAudit.setAcknowledgedDate(now);
        errorAudit.setAcknowledgedBy(username);
        errorAudit.setError(applicationError);

        applicationError.persist();
        errorAudit.persist();

    }

    /**
     * Generate a String representation of a Throwable.
     *
     * @param t Throwable
     * @return String Throwable message + stack trace
     */
    private String convertThrowableToString(Throwable t) {
        if (t == null) return null;

        Writer writer = new StringWriter();
        PrintWriter printer = new PrintWriter(writer, true);
        t.printStackTrace(printer);
        printer.flush();
        printer.close();

        return writer.toString();
    }

    private VrmApplicationErrorEntity checkRepeated(VrmApplicationErrorEntity appError) {
        try{
            VrmApplicationErrorEntity existingError = (VrmApplicationErrorEntity)VrmApplicationErrorEntity.findByTypeAndStatusAndFailureKey(
                appError.getErrorType(),
                appError.getErrorStatusId(), appError.getFailureKey()).getSingleResult();
            String comment = existingError.getComment();
            //initialize the comment
            comment = (comment == null) ? "" : comment + ",";
            //if comment has space, then add to it
            if (comment.length() < MAX_COMMENT_LENGTH) {
                String sdf = new SimpleDateFormat(DATE_FORMAT).format(new Date());
                comment = comment + " repeated: " + sdf;
                existingError.setComment(comment);
            }

            existingError.setApplicationMessage(appError.getApplicationMessage());
            existingError.setException(appError.getException());
            existingError.setHostname(appError.getHostname());

            //set the reference
            appError = existingError;
        } catch (EmptyResultDataAccessException e) {
            LOG.info("New runtime error to be logged");
        }

        return appError;
    }
}
