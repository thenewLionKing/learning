/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.cs.rule;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import uk.co.mo.app.mercury.cs.applicationerror.MoRuntimeException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * A rule aspect to perform validation, rule execution on a domain object.
 *
 * <p/>
 * User: prabat
 * Date: 29-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
@Aspect
public class RuleAspect {

    private static final Log LOG = LogFactory.getLog(RuleAspect.class);

    /**
     * A Before advice to do validation on the given domain object.
     *
     * @param pj proceeding joint point
     * @param rule of type @Rule
     * @param domainObj any object that must have createRule() factory method
     * @throws BusinessRuleException throws validation exception
     * @throws MoRuntimeException if no method getRule()
     * @return object return by target
     */
    @Around("execution(* uk.co.mo.app.mercury.domain..service..*.*(..))  && @annotation(rule) && args(domainObj,..)")
    public Object validateDomainObject(ProceedingJoinPoint pj, Rule rule, Object domainObj) throws Throwable {
        LOG.debug("Inside rule aspect...");
        IRule executor = null;
        try {
            executor = (IRule) domainObj.getClass().getMethod("createRule").invoke(domainObj);
        } catch (Exception e) {
            throw new MoRuntimeException("Could not invoke rule", e);
        }

        if(rule.validate()) executor.validate();
        executePreConditionRules(rule, domainObj, executor);
        Object o = pj.proceed();
        executePostconditionRules(rule, domainObj, executor);
        return o;
    }

    private void executePostconditionRules(Rule rule, Object domainObj, IRule executor) throws IllegalAccessException, InvocationTargetException {
        RuleExecution post = rule.postExecution();
        if(post.type().equals(RuleType.CUSTOM)) {
            executeCustomRule(domainObj, executor, post);
        }
    }

    private void executePreConditionRules(Rule rule, Object domainObj, IRule executor) throws BusinessRuleException, IllegalAccessException, InvocationTargetException {
        RuleExecution[] pre = rule.preExecution();

        try {

            for (RuleExecution aPre : pre) {
                if(aPre.type().equals(RuleType.NONE)) break;
                if(aPre.type().equals(RuleType.CREATION)) executor.executeCreationRules();
                if(aPre.type().equals(RuleType.MODIFICATION)) executor.executeModificationRules();
                if(aPre.type().equals(RuleType.DELETION)) executor.executeDeletionRules();
                executeCustomRule(domainObj, executor, aPre);
            }
        } catch(BusinessRuleException e) {
            LOG.debug("RULES FAILED: " + e.getFailedRulesAsString());
            throw e;
        }
    }

    private void executeCustomRule(Object domainObj, IRule executor, RuleExecution aPre) throws IllegalAccessException, InvocationTargetException {
        if(aPre.type().equals(RuleType.CUSTOM)) {
            Method[] methods = executor.getClass().getDeclaredMethods();
            for (Method aMethod : methods){
                if(aMethod.isAnnotationPresent(RuleExecution.class)) {
                    RuleExecution annotation = aMethod.getAnnotation(RuleExecution.class);
                    if(annotation.name().equals(aPre.name())) {
                        aMethod.invoke(executor);
                        break;
                    }
                }
            }
        }
    }
}
