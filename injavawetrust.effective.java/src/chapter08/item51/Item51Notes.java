package chapter08.item51;

public class Item51Notes {

	// #####
	// Item 51: Design method signatures carefully

	// ##### Choose method names carefully.
	// Names should always obey the standard naming conventions (Item 68).
	// Your primary goal should be to choose names
	// that are understandable and consistent with other names in the same package.
	// Your secondary goal should be to choose names consistent with the broader
	// consensus, where it exists.

	// #####
	// Don’t go overboard in providing convenience methods.
	// Every method should “pull its weight.” Too many methods make a class
	// difficult to learn, use, document, test, and maintain.
	// This is doubly true for interfaces, where too many methods complicate life
	// for implementors as well as users. For each action supported by your class or
	// interface, provide a fully functional method.
	// Consider providing a “shorthand” only if it will be used often. When in
	// doubt, leave it out.

	// #####
	// Avoid long parameter lists.
	/*
	 * Aim for four parameters or fewer. Most programmers can’t remember longer
	 * parameter lists. If many of your methods exceed this limit, your API won’t be
	 * usable without constant reference to its documentation. Modern IDEs help, but
	 * you are still much better off with short parameter lists. Long sequences of
	 * identically typed parameters are especially harmful. Not only won’t users be
	 * able to remember the order of the parameters, but when they transpose
	 * parameters accidentally, their programs will still compile and run. They just
	 * won’t do what their authors intended.
	 */

	// There are three techniques for shortening overly long parameter lists.

	/*
	 * One is to break the method up into multiple methods, each of which requires
	 * only a subset of the parameters. If done carelessly, this can lead to too
	 * many methods, but it can also help reduce the method count by increasing
	 * orthogonality
	 */

	/*
	 * A second technique for shortening long parameter lists is to create helper
	 * classes to hold groups of parameters. Typically these helper classes are
	 * static member classes (Item 24). This technique is recommended if a
	 * frequently occurring sequence of parameters is seen to represent some
	 * distinct entity
	 * 
	 */

	/*
	 * A third technique that combines aspects of the first two is to adapt the
	 * Builder pattern (Item 2) from object construction to method invocation. If
	 * you have a method with many parameters, especially if some of them are
	 * optional, it can be beneficial to define an object that represents all of the
	 * parameters and to allow the client to make multiple “setter” calls on this
	 * object, each of which sets a single parameter or a small, related group. Once
	 * the desired parameters have been set, the client invokes the object’s
	 * “execute” method, which does any final validity checks on the parameters and
	 * performs the actual computation.
	 * 
	 */

	// #####
	// For parameter types, favor interfaces over classes (Item 64).
	/*
	 * If there is an appropriate interface to define a parameter, use it in favor
	 * of a class that implements the interface.
	 * 
	 * For example, there is no reason to ever write a method that takes HashMap on
	 * input—use Map instead.
	 */

	// #####
	/*
	 * Prefer two-element enum types to boolean parameters 
	 * Enums make your code easier to read and to write. 
	 * Also, they make it easy to add more options later
	 */
}
