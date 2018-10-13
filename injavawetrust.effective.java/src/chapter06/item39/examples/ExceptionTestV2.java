package chapter06.item39.examples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotation type with a parameter
/**
 * Indicates that the annotated method is a test method that must throw the
 * designated exception to succeed.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTestV2 {
	Class<? extends Throwable>[] value();
	// The syntax for array parameters in annotations is flexible. It is optimized
	// for single-element arrays.
}
