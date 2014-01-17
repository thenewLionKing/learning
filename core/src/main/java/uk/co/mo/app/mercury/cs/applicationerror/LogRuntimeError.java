package uk.co.mo.app.mercury.cs.applicationerror;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * <p/>
 * User: PrabaT
 * Date: 26-Mar-2010
 * Time: 18:13:00
 * <p/>
 * Change Log - Who : When : Comment
 */
@Retention(RUNTIME)
@Target(ElementType.METHOD)
public @interface LogRuntimeError {
}
