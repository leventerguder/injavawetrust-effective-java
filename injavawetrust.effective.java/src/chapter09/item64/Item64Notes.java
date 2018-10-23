package chapter09.item64;

public class Item64Notes {

	// Item 64: Refer to objects by their interfaces

	/*
	 * Item 51 says that you should use interfaces rather than classes as parameter
	 * types. More generally, you should favor the use of interfaces over classes to
	 * refer to objects.
	 */

	// If appropriate interface types exist, then parameters, return values,
	// variables, and fields should all be declared using interface types.

	// The only time you really need to refer to an object’s class is when you’re
	// creating it with a constructor.

	/*
	 * If you get into the habit of using interfaces as types, your program will be
	 * much more flexible.
	 */

	/*
	 * There is one caveat: if the original implementation offered some special
	 * functionality not required by the general contract of the interface and the
	 * code depended on that functionality, then it is critical that the new
	 * implementation provide the same functionality.
	 */

	/*
	 * It is entirely appropriate to refer to an object by a class rather than an
	 * interface if no appropriate interface exists.
	 */

	/*
	 * If an object belongs to such a class-based framework, it is preferable to
	 * refer to it by the relevant base class, which is often abstract, rather than
	 * by its implementation class. Many java.io classes such as OutputStream fall
	 * into this category.
	 */

	/*
	 * A final case in which there is no appropriate interface type is that of
	 * classes that implement an interface but also provide extra methods not found
	 * in the interface—for example, PriorityQueue has a comparator method that is
	 * not present on the Queue interface. Such a class should be used to refer to
	 * its instances only if the program relies on the extra methods, and this
	 * should be very rare.
	 */

	/*
	 * In practice, it should be apparent whether a given object has an appropriate
	 * interface. If it does, your program will be more flexible and stylish if you
	 * use the interface to refer to the object. If there is no appropriate
	 * interface, just use the least specific class in the class hierarchy that
	 * provides the required functionality.
	 * 
	 */
}
