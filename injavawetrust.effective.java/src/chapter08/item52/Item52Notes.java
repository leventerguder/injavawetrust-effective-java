package chapter08.item52;

public class Item52Notes {

	// Item 52: Use overloading judiciously

	/*
	 * The behavior of this program is counterintuitive because selection among
	 * overloaded methods is static, while selection among overridden methods is
	 * dynamic.
	 */

	// you should avoid confusing uses of overloading
	/*
	 * A safe, conservative policy is never to export two overloadings with the same
	 * number of parameters.
	 */

	// you can always give methods different names instead of overloading them

	// For example, consider the ObjectOutputStream class
	// writeBoolean(boolean), writeInt(int),writeLong(long) ...

	/*
	 * For constructors, you don’t have the option of using different names:
	 * multiple constructors for a class are always overloaded. Also, with
	 * constructors you don’t have to worry about interactions between overloading
	 * and overriding, because constructors can’t be overridden.
	 */

	/*
	 * Technically speaking, the problem is that System.out::println is an inexact
	 * method reference [JLS, 15.13.1] and that “certain argument expressions that
	 * contain implicitly typed lambda expressions or inexact method references are
	 * ignored by the applicability tests, because their meaning cannot be
	 * determined until a target type is selected [JLS, 15.12.2].”
	 */

	// do not overload methods to take different functional interfaces in the same
	// argument position.

	/*
	 * To summarize, just because you can overload methods doesn’t mean you should.
	 * It is generally best to refrain from overloading methods with multiple
	 * signatures that have the same number of parameters. In some cases, especially
	 * where constructors are involved, it may be impossible to follow this advice.
	 * In these cases, you should at least avoid situations where the same set of
	 * parameters can be passed to different overloadings by the addition of casts.
	 * If this cannot be avoided, for example, because you are retrofitting an
	 * existing class to implement a new interface, you should ensure that all
	 * overloadings behave identically when passed the same parameters. If you fail
	 * to do this, programmers will be hard pressed to make effective use of the
	 * overloaded method or constructor, and they won’t understand why it doesn’t
	 * work.
	 * 
	 */
}
