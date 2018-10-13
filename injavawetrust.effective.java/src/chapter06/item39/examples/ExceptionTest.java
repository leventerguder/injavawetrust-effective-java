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
public @interface ExceptionTest {
	Class<? extends Throwable> value();
	// In English, it means “the Class object for some class that extends
	// Throwable,” and it allows the user of the annotation to specify any exception
	// (or error) type.
}
