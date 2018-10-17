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
}
