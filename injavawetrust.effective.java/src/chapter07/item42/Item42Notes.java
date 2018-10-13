package chapter07.item42;

public class Item42Notes {

	// Chapter 7. Lambdas and Streams
	// In Java 8, functional interfaces, lambdas, and method references were added
	// to make it easier to create function objects. The streams API was added in
	// tandem with these language changes to provide library support for processing
	// sequences of data elements.

	// #####
	// Item 42 : Prefer lambdas to anonymous classes

	// Historically, interfaces (or, rarely, abstract classes) with a single
	// abstract method were used as function types.
	// Their instances, known as function objects, represent functions or actions.
	// Since JDK 1.1 was released in 1997,
	// the primary means of creating a function object was the anonymous class
	// (Item 24).

	// Anonymous classes were adequate for the classic objected-oriented design
	// patterns requiring function objects, notably the Strategy pattern

	// The Comparator interface represents an abstract strategy for sorting; the
	// anonymous class above is a concrete strategy for sorting strings
	// (Test01.java)

	// In Java 8, the language formalized the notion that interfaces with a single
	// abstract method are special and deserve special treatment. These interfaces
	// are now known as functional interfaces, and the language allows you to create
	// instances of these interfaces using lambda expressions, or lambdas for short.

	// Lambdas are similar in function to anonymous classes, but far more concise.

	// In some cases, the compiler won’t be able to
	// determine the types, and you’ll have to specify them

	// Omit the types of all lambda parameters unless their presence makes your
	// program clearer.

	// If the compiler generates an error telling you it can’t infer
	// the type of a lambda parameter, then specify it.

	// One caveat should be added concerning type inference. Item 26 tells you
	// not to use raw types, Item 29 tells you to favor generic types, and Item 30
	// tells you to favor generic methods. This advice is doubly important when
	// you’re using lambdas, because the compiler obtains most of the type
	// information that allows it to perform type inference from generics. If you
	// don’t provide this information, the compiler will be unable to do type
	// inference, and you’ll have to specify types manually in your lambdas, which
	// will greatly increase their verbosity

	// Unlike methods and classes, lambdas lack names and
	// documentation; if a computation isn’t self-explanatory, or exceeds a few
	// lines, don’t put it in a lambda.

	// One line is ideal for a lambda, and three lines
	// is a reasonable maximum. If you violate this rule, it can cause serious harm
	// to
	// the readability of your programs.

	// Likewise, you might think that anonymous classes are obsolete in the era of
	// lambdas. This is closer to the truth, but there are a few things you can do
	// with
	// anonymous classes that you can’t do with lambdas.

	// Lambdas are limited to functional interfaces. If you want to create an
	// instance of an abstract
	// class, you can do it with an anonymous class, but not a lambda.

	// a lambda cannot obtain a reference to itself.
	// In a lambda, the this keyword refers to the enclosing instance, which is
	// typically wha you want.
	
	// Lambdas share with anonymous classes the property that you can’t reliably
	// serialize and deserialize them across implementations. Therefore, you should
	// rarely, if ever, serialize a lambda (or an anonymous class instance).
	
	// In summary, as of Java 8, lambdas are by far the best way to represent
	// small function objects. Don’t use anonymous classes for function objects
	// unless you have to create instances of types that aren’t functional
	// interfaces. Also, remember that lambdas make it so easy to represent small
	// function objects that it opens the door to functional programming techniques
	// that were not previously practical in Java.
}
