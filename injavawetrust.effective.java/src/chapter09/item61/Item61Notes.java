package chapter09.item61;

public class Item61Notes {

	// #####
	// Item 61: Prefer primitive types to boxed primitives

	// Every primitive type has a corresponding reference type, called a boxed
	// primitive.

	// There are three major differences between primitives and boxed primitives.
	/*
	 * First, primitives have only their values, whereas boxed primitives have
	 * identities distinct from their values. In other words, two boxed primitive
	 * instances can have the same value and different identities.
	 */

	/*
	 * 
	 * Second, primitive types have only fully functional values, whereas each boxed
	 * primitive type has one nonfunctional value, which is null, in addition to all
	 * the functional values of the corresponding primitive type.
	 */

	/*
	 * Last, primitives are more timeand space-efficient than boxed primitives.
	 */

	// Applying the == operator to boxed primitives is almost always wrong.

	// In nearly every case when you mix primitives and boxed primitives in an
	// operation, the boxed primitive is auto-unboxed.

	/*
	 * the programmer ignored the distinction between primitives and boxed
	 * primitives and suffered the consequences. In the first two programs, the
	 * consequences were outright failure; in the third, severe performance
	 * problems.
	 */

	/*
	 * So when should you use boxed primitives? They have several legitimate uses.
	 * The first is as elements, keys, and values in collections. You can’t put
	 * primitives in collections, so you’re forced to use boxed primitives.
	 */

	/*
	 * You must use boxed primitives as type parameters in parameterized types and
	 * methods (Chapter 5), because the language does not permit you to use
	 * primitives.
	 */

	/*
	 * you must use boxed primitives when making reflective method invocations
	 */

	/*
	 * In summary, use primitives in preference to boxed primitives whenever you
	 * have the choice. Primitive types are simpler and faster. If you must use
	 * boxed primitives, be careful! Autoboxing reduces the verbosity, but not the
	 * danger, of using boxed primitives. When your program compares two boxed
	 * primitives with the == operator, it does an identity comparison, which is
	 * almost certainly not what you want. When your program does mixed-type
	 * computations involving boxed and unboxed primitives, it does unboxing, and
	 * when your program does unboxing, it can throw a NullPointerException.
	 * Finally, when your program boxes primitive values, it can result in costly
	 * and unnecessary object creations.
	 */
}