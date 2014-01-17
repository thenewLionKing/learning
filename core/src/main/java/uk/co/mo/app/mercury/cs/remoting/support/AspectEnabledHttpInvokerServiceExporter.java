/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.remoting.support;

import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.remoting.support.RemoteInvocation;

import java.lang.reflect.InvocationTargetException;

/**
 * An extension class to apply remote service invocation aspects
 * @see uk.co.mo.app.mercury.cs.remoting.support.RemoteServiceInspectionAspect
 *
 * <p/>
 * User: PrabaT
 * Date: 29-Apr-2010
 * Time: 17:56:18
 * <p/>
 * Change Log - Who : When : Comment
 *              PrabaT : 25-Jul-2010 : added java doc
 */
public class AspectEnabledHttpInvokerServiceExporter extends HttpInvokerServiceExporter {

    @Override
    protected Object invoke(RemoteInvocation invocation, Object targetObject)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return super.invoke(invocation, targetObject);
    }
}
