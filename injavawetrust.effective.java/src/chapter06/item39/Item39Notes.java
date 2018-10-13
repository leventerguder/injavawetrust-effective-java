package chapter06.item39;

public class Item39Notes {

	// ##### Item 39: Prefer annotations to naming patterns
	// Historically, it was common to use naming patterns to indicate that some
	// program elements demanded special treatment by a tool or framework.

	// For example, prior to release 4, the JUnit testing framework required its
	// users to
	// designate test methods by beginning their names with the characters "test"

	// This technique works, but it has several big disadvantages. First,
	// typographical errors result in silent failures. For example, suppose you
	// accidentally named a test method tsetSafetyOverride instead of
	// testSafetyOverride. JUnit 3 wouldn’t complain, but it wouldn’t
	// execute the test either, leading to a false sense of security.

	// Annotations [JLS, 9.7] solve all of these problems nicely, and JUnit
	// adopted them starting with release 4

	// The declaration for the Test annotation type is itself annotated with
	// Retention and Target annotations.
	// Such annotations on annotation type declarations are known as
	// meta-annotations.

	// @Retention (RetentionPolicy.RUNTIME) meta annotation indicates that Test
	// annotations should be retained at runtime.
	// The @Target(ElementType.METHOD) meta-annotation indicates that the Test
	// annotation is legal only on method declarations
	// it can not be applied to class declarations , fields declarations , or other
	// program elements.

	// As of Java 8, there is another way to do multivalued annotations. Instead of
	// declaring an annotation type with an array parameter, you can annotate the
	// declaration of an annotation with the @Repeatable meta-annotation, to
	// indicate that the annotation may be applied repeatedly to a single element.

	// Repeatable annotations were added to improve the readability of source
	// code that logically applies multiple instances of the same annotation type to
	// a given program element. If you feel they enhance the readability of your
	// source code, use them, but remember that there is more boilerplate in
	// declaring and processing repeatable annotations, and that processing
	// repeatable annotations is error-prone.

	// There is simply no reason to use naming patterns when you can use
	// annotations instead.

	// most programmers will have no
	// need to define annotation types. But all programmers should use the
	// predefined annotation types that Java provides
}
