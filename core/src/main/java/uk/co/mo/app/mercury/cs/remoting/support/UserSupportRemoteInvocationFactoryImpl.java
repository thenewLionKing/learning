/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.remoting.support;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.remoting.support.RemoteInvocation;
import org.springframework.remoting.support.RemoteInvocationFactory;
import org.springframework.security.core.context.SecurityContextHolder;

import java.security.Principal;

/**
 * <p/>
 * User: PrabaT
 * Date: 29-Apr-2010
 * Time: 11:41:10
 * <p/>
 * Change Log - Who : When : Comment
 */
public class UserSupportRemoteInvocationFactoryImpl implements RemoteInvocationFactory {

    public RemoteInvocation createRemoteInvocation(MethodInvocation methodInvocation) {
        RemoteInvocation invocation = new RemoteInvocation(methodInvocation);
        Principal principal = SecurityContextHolder.getContext().getAuthentication();
        User user = new User(principal != null ? principal.getName() : "ANONYMOUS", "");
        invocation.addAttribute(User.ATTRIBUTE_NAME, user);
        return invocation;
    }
}
