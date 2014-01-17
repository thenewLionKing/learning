/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */

package uk.co.mo.app.mercury.cs.mock;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Before;
import uk.co.mo.app.mercury.cs.entity.AutoPopulate;

import java.lang.reflect.Method;

/**
 * An aspect to mock methods. To be used in test cases
 *
 *
 * <p/>
 * User: PrabaT
 * Date: 08-Jan-2010
 * Time: 13:22:39
 * <p/>
 * Change Log - Who : When : Comment
 */

@Aspect
public class TestAspects {

    private static final Log LOG = LogFactory.getLog(TestAspects.class);

    private static String methodName;
    private static Object methodReturn;

    public synchronized static void setMockMethodAndReturn(String str, Object retObj) {
        methodName = str;
        methodReturn = retObj;
    }


    @Before("execution(* uk.co.mo.app.mercury.domain..*.*ServiceTest.*(*)) && @annotation(autoPopulate) && args(domainObj)")
	public void setDefaultValues(JoinPoint jp, AutoPopulate autoPopulate, Object domainObj  )throws Throwable{
		LOG.debug("AutoPopulate Advice Called for setting default values");
		Method[] methods = domainObj.getClass().getMethods();
        for (Method aMethod : methods){
            if(aMethod.isAnnotationPresent(AutoPopulate.class)) {
            	AutoPopulate annotation = aMethod.getAnnotation(AutoPopulate.class);
                if(annotation.intValue()>0) {
                    aMethod.invoke(domainObj,annotation.intValue());
                }else{
                	aMethod.invoke(domainObj, annotation.stringValue());
                }
            }
        }
	}

    /**
     * An advice to mock support interface methods
     * 
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(* uk.co.mo.app.mercury..service.*Service.*(..))")
    public Object mockInterfaceMethods(ProceedingJoinPoint pjp) throws Throwable {
        if(LOG.isDebugEnabled()) LOG.debug("Advice called as part of Service interception...");
        if(LOG.isDebugEnabled()) LOG.debug("signature: " + pjp.getSignature().getName());
        if(pjp.getSignature().getName().equalsIgnoreCase(methodName)) {
            Object o = methodReturn;
            resetMockMethodAndReturn();
            return o;
        } else {
            return pjp.proceed();
        }
    }

    /**
     * An advice to mock entity methods
     * 
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(* uk.co.mo.app.mercury.domain..*Entity.*())")
    public Object mockEntityMethods(ProceedingJoinPoint pjp) throws Throwable {
        if(LOG.isDebugEnabled()) LOG.debug("Advice called as part of Entity interception...for ");
        if(LOG.isDebugEnabled()) LOG.debug("signature: " + pjp.getSignature().getName());
        if(pjp.getSignature().getName().equalsIgnoreCase(methodName)) {
            Object o = methodReturn;
            resetMockMethodAndReturn();
            return o;
        } else {
            return pjp.proceed();
        }
    }

    private synchronized static void resetMockMethodAndReturn() {
        methodName = null;
        methodReturn = null;
    }
}
