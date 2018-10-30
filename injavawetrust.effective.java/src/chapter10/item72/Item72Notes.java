package chapter10.item72;

public class Item72Notes {

	// #####
	// Item 72: Favor the use of standard exceptions

	/*
	 * An attribute that distinguishes expert programmers from less experienced ones
	 * is that experts strive for and usually achieve a high degree of code reuse.
	 * Exceptions are no exception to the rule that code reuse is a good thing. The
	 * Java libraries provide a set of exceptions that covers most of the
	 * exceptionthrowing needs of most APIs.
	 */

	// The most commonly reused exception type is IllegalArgumentException (Item
	// 49).
	// This is generally the exception to throw when the caller passes in an
	// argument whose value is inappropriate.

	/*
	 * Another commonly reused exception is IllegalStateException. This is generally
	 * the exception to throw if the invocation is illegal because of the state of
	 * the receiving object. For example, this would be the exception to throw if
	 * the caller attempted to use some object before it had been properly
	 * initialized.
	 *
	 */

	/*
	 * If a caller passes null in some parameter for which null values are
	 * prohibited, convention dictates that NullPointerException be thrown rather
	 * than IllegalArgumentException.
	 */

	/*
	 * if a caller passes an out-ofrange value in a parameter representing an index
	 * into a sequence IndexOutOfBoundsException should be thrown rather than
	 * IllegalArgumentException.
	 */

	/*
	 * ConcurrentModificationException. It should be thrown if an object that was
	 * designed for use by a single thread (or with external synchronization)
	 * detects that it is being modified concurrently
	 */

	/*
	 * UnsupportedOperationException. This is the exception to throw if an object
	 * does not support an attempted operation. Its use is rare because most objects
	 * support all of their methods. This exception is used by classes that fail to
	 * implement one or more optional operations defined by an interface they
	 * implement. For example, an append-only List implementation would throw this
	 * exception if someone tried to delete an element from the list.
	 */

	/*
	 * Do not reuse Exception, RuntimeException, Throwable, or Error directly. Treat
	 * these classes as if they were abstract. You can't reliably test for these
	 * exceptions because they are superclasses of other exceptions that a method
	 * may throw.
	 */

	// IllegalArgumentException : Non-nul parameter value is inappropriate
	// IllegalStateException : Object state is inappropriate for method invocation
	// NullPointerException : Parameter value is null where prohibited.
	// IndexOutOfBoundsException :Index parameter value is out of range
	// ConcurrentModificationException : Concurrent modification of an object has
	// been detected where is it is prohibited.
	// UnsupportedOperationException : Object does not support method.

	/*
	 * it would be appropriate to reuse ArithmeticException and
	 * NumberFormatException if you were implementing arithmetic objects such as
	 * complex numbers or rational numbers.
	 */

	/*
	 * If an exception fits your needs, go ahead and use it, but only if the
	 * conditions under which you would throw it are consistent with the exception’s
	 * documentation: reuse must be based on documented semantics, not just on name.
	 * Also, feel free to subclass a standard exception if you want to add more
	 * detail (Item 75), but remember that exceptions are serializable (Chapter 12).
	 * That alone is reason not to write your own exception class without good
	 * reason.
	 */

	/*
	 * IllegalStateException if no argument values would have worked, otherwise
	 * throw IllegalArgumentException.
	 */
}
