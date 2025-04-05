package org.java101.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define custom annotation
/*
@Retention(RetentionPolicy.RUNTIME) means the annotation will be available at runtime.
@Target(ElementType.METHOD) means the annotation can be used on methods.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value() default "Hello";
}



