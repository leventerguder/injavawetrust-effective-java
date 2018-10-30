package chapter10.item73;

import java.util.NoSuchElementException;

public class Item73Notes {

	// #####
	// Item 73: Throw exceptions appropriate to the abstraction

	/*
	 * higher layers should catch lower-level exceptions and, in their place, throw
	 * exceptions that can be explained in terms of the higher-level abstraction.
	 * This idiom is known as exception translation:
	 */

	// Exception Translation
	// try {
	// ... // Use lower-level abstraction to do our bidding
	// } catch (LowerLevelException e) {
	// throw new HigherLevelException(...);
	// }

	/*
	 * Here is an example of exception translation taken from the
	 * AbstractSequentialList class, which is a skeletal implementation (Item 20) of
	 * the List interface
	 */
	// public E get(int index) {
	// try {
	// return listIterator(index).next();
	// } catch (NoSuchElementException exc) {
	// throw new IndexOutOfBoundsException("Index: "+index);
	// }
	// }

	/*
	 * A special form of exception translation called exception chaining is called
	 * for in cases where the lower-level exception might be helpful to someone
	 * debugging the problem that caused the higher-level exception. The lower-level
	 * exception (the cause) is passed to the higher-level exception, which provides
	 * an accessor method (Throwable’s getCause method) to retrieve the lower-level
	 * exception:
	 */

	// Exception Chaining
	// try {
	// ... // Use lower-level abstraction to do our bidding
	// } catch (LowerLevelException cause) {
	// throw new HigherLevelException(cause);
	// }

	/*
	 * The higher-level exception’s constructor passes the cause to a chaining-aware
	 * superclass constructor, so it is ultimately passed to one of Throwable’s
	 * chaining-aware constructors, such as Throwable(Throwable):
	 */

	/*
	 * Most standard exceptions have chaining-aware constructors. For exceptions
	 * that don’t, you can set the cause using Throwable’s initCause method. Not
	 * only does exception chaining let you access the cause programmatically (with
	 * getCause), but it integrates the cause’s stack trace into that of the
	 * higher-level exception.
	 */

	/*
	 * While exception translation is superior to mindless propagation of exceptions
	 * from lower layers, it should not be overused. Where possible, the best way to
	 * deal with exceptions from lower layers is to avoid them, by ensuring that
	 * lower-level methods succeed. Sometimes you can do this by checking the
	 * validity of the higher-level method’s parameters before passing them on to
	 * lower layers.
	 */

	/*
	 * If it is impossible to prevent exceptions from lower layers, the next best
	 * thing is to have the higher layer silently work around these exceptions,
	 * insulating the caller of the higher-level method from lower-level problems.
	 * Under these circumstances, it may be appropriate to log the exception using
	 * some appropriate logging facility such as java.util.logging. This allows
	 * programmers to investigate the problem, while insulating client code and the
	 * users from it.
	 */

	/*
	 * In summary, if it isn’t feasible to prevent or to handle exceptions from
	 * lower layers, use exception translation, unless the lower-level method
	 * happens to guarantee that all of its exceptions are appropriate to the higher
	 * level. Chaining provides the best of both worlds: it allows you to throw an
	 * appropriate higherlevel exception, while capturing the underlying cause for
	 * failure analysis (Item 75).
	 */
}
