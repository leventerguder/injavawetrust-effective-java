package chapter06.item39.examples;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
/**
 * Indicates that the annotated method is a test method. Use only on
 * parameterless static methods.
 */
public @interface Test {

}

// Test annotation , called a marker annotation because it has no parameters but simply marks the annotated element.