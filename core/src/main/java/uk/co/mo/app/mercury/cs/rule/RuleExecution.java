package uk.co.mo.app.mercury.cs.rule;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Put your class comment here
 * <p/>
 * User: PrabaT
 * Date: 30-Jan-2010
 * <p/>
 * Change Log - Who : When : Comment
 */
@Retention(RUNTIME)
@Target(ElementType.METHOD)

public @interface RuleExecution {

    RuleType type();

    String name() default "";
}
