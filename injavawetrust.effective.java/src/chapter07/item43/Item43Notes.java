package chapter07.item43;

public class Item43Notes {

	// #####
	// Item 43 : Prefer method references to lambdas

	// The primary advantage of lambdas over anonymous classes is that they are
	// more succinct. Java provides a way to generate function objects even more
	// succinct than lambdas: method references.

	// give you an out if a lambda gets too long or complex: You can
	// extract the code from the lambda into a new method and replace the lambda
	// with a reference to that method. You can give the method a good name and
	// document it to your heart’s content.

	// Occasionally, a lambda will be more succinct than a
	// method reference. This happens most often when the method is in the same
	// class as the lambda

	// service.execute(GoshThisClassNameIsHumongous::action);

	// service.execute(() -> action());

	// The snippet using the method reference is neither shorter nor clearer than
	// the
	// snippet using the lambda, so prefer the latter.

	/*
	 * Many method references refer to static methods, but there are four kinds that
	 * do not. Two of them are bound and unbound instance method references. In
	 * bound references, the receiving object is specified in the method reference.
	 * Bound references are similar in nature to static references: the function
	 * object takes the same arguments as the referenced method.
	 */

	/*
	 * there are two kinds of constructor references, for classes and arrays.
	 * Constructor references serve as factory objects.
	 */

	// Method Ref Type -> static
	// Integer ::parseInt
	// Lambda Equivalent
	// str -> Integer.parseInt(str)

	// Method Ref Type -> Bound
	// Instant.now()::isAfter
	// Lambda Equivalent
	// Integer then = Instant.now(); t-> then.isAfter(t)

	// Unbound
	// String::toLowerCase
	// str -> str.toLowerCase()

	// Class Constructor
	// TreeMap<K,V>::new

	// () -> new TreeMap<K,V>

	// Array Constructor
	// int[]::new

	// len -> new int[len]

	/*
	 * In summary, method references often provide a more succinct alternative to
	 * lambdas. Where method references are shorter and clearer, use them; where
	 * they aren’t, stick with lambdas.
	 */

}
