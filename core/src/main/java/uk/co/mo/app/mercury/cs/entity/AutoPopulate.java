package uk.co.mo.app.mercury.cs.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Retention(RUNTIME)
@Target(ElementType.METHOD)
public @interface AutoPopulate {

 String stringValue() default "";
 int intValue() default 0;
 
}
