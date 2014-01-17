/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */

package uk.co.mo.app.mercury.cs.rule;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * An annotation to signify business rules are to be
 * executed in the method
 *
 * <p/>
 * User: prabat
 * Date: 29-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
@Retention(RUNTIME)
@Target(ElementType.METHOD)
public @interface Rule {

    /**
     * To execute validation rules
     *
     * @return true(default) to validate, else set to false
     */
    boolean validate() default true;

    /**
     * To execute pre-conditions.
     *
     * @return Array of rule types.
     */
    RuleExecution[]  preExecution();

    /**
     * To execute post-conditions. Only custom rule type will be processed
     *
     * @return RuleType.CUSTOM
     */
    RuleExecution postExecution() default @RuleExecution(type = RuleType.NONE);
}
