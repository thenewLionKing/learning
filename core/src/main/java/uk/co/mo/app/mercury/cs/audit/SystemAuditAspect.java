/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.audit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import uk.co.mo.app.mercury.cs.remoting.support.SystemUser;

/**
 * <p/>
 * User: PrabaT
 * Date: 29-Apr-2010
 * Time: 19:00:45
 * <p/>
 * Change Log - Who : When : Comment
 */
@Aspect
public class SystemAuditAspect {

    private static final Log LOG = LogFactory.getLog(SystemAuditAspect.class);

    /**
     * An advice to audit service calls
     *
     * @param jp
     * @return
     * @throws Throwable
     */
    @Before("execution(* uk.co.mo.app.mercury..service.*Service.*(..))")
    public void auditServiceCalls(JoinPoint jp) throws Throwable {
        SystemAudit.addUserTrail(Thread.currentThread().getName() + " - " + SystemUser.getUserName() + " - " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName());
    }
}
