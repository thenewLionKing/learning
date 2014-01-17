/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.remoting.support;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.remoting.support.RemoteInvocation;
import uk.co.mo.app.mercury.cs.audit.SystemAudit;

/**
 * An aspect class that intercepts remote service calls and applies different types of service aspects.
 *
 * <p/>
 * User: PrabaT
 * Date: 06-Feb-2010
 * <p/>
 * Change Log - Who : When : Comment
 *              PrabaT : 25-Jul-2010 : added java doc
 */
@Aspect
//@Configurable
public class RemoteServiceInspectionAspect {

    private static final Log LOG = LogFactory.getLog(RemoteServiceInspectionAspect.class);

    /**
     * Inspects user set in the call and appropriately adds to the thread local variable
     *
     * @param invocation
     * @throws Throwable
     */

    @Around(value = "execution(* uk.co.mo.app.mercury.cs.remoting.support.AspectEnabledHttpInvokerServiceExporter.invoke(..)) && args(invocation, target)", argNames = "pjp, invocation, target")
    public Object inspectUserSet(ProceedingJoinPoint pjp, RemoteInvocation invocation, Object target) throws Throwable {
        setUpSystemUser(invocation);
        Object o = pjp.proceed();
        LOG.debug(SystemAudit.getUserTrailAndClean());
        return o;
    }

    private void setUpSystemUser(RemoteInvocation invocation) {
        LOG.debug("inside RemoteServiceInspectionAspect...");
        User user = (User) invocation.getAttribute(User.ATTRIBUTE_NAME);

        if(user != null) {
            LOG.debug("service called with user..." + user);
            SystemUser.setUserName(user.getUserName());
        }
    }
}
