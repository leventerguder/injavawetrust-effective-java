package chapter08.item55;

public class Item55Notes {

	// #####
	// Item 55: Return optionals judiciously

	// Prior to Java 8, there were two approaches you could take when writing a
	// method that was unable to return a value under certain circumstances.
	// Either you could throw an exception, or you could return null (assuming the
	// return type was an object reference type).

	// Neither of these approaches is perfect. Exceptions should be reserved for
	// exceptional conditions (Item 69), and throwing an exception is expensive
	// because the entire stack trace is captured when an exception is created.
	// Returning null doesn’t have these shortcomings, but it has its own.

	// If a method returns null, clients must contain special-case code to deal with
	// the possibility of a null return, unless the programmer can prove that a null
	// return is impossible. If a client neglects to check for a null return and
	// stores a null return value away in some data structure, a
	// NullPointerException may result at some arbitrary time in the future, at some
	// place in the code that has nothing to do with the problem.

	// In Java 8, there is a third approach to writing methods that may not be able
	// to return a value. The Optional<T> class represents an immutable container
	// that can hold either a single non-null T reference or nothing at all.

	// An optional that contains nothing is said to be empty. A value is said to be
	// present in an optional that is not empty. An optional is essentially an
	// immutable collection that can hold at most one element. Optional<T> does not
	// implement Collection<T>, but it could in principle.

	// Never return a null value from an Optional-returning method: it defeats the
	// entire purpose of the facility.

	/*
	 * Many terminal operations on streams return optionals. If we rewrite the max
	 * method to use a stream, Stream’s max operation does the work of generating an
	 * optional for us (though we do have to pass in an explicit comparator):
	 * 
	 */

	// Optionals are similar in spirit to checked exceptions (Item 71), in that they
	// force the user of an API to confront the fact that there may be no value
	// returned. Throwing an unchecked exception or returning a null allows the user
	// to ignore this eventuality, with potentially dire consequences.

	// If you can prove that an optional is nonempty, you can get the value from the
	// optional without specifying an action to take if the optional is empty, but

	// Occasionally you may be faced with a situation where it’s expensive to get
	// the default value, and you want to avoid that cost unless it’s necessary.

	// For these situations, Optional provides a method that takes a Supplier<T> and
	// invokes it only when necessary.

	// This method is called orElseGet, but perhaps it should have been called
	// orElseCompute because it is closely related to the three Map methods whose
	// names begin with compute

	// There are several Optional methods for dealing with more specialized use
	// cases: filter, map, flatMap, and ifPresent.

	// In Java 9, two more of these methods were added: or and ifPresentOrElse.

	// When programming with streams, it is not uncommon to find yourself with a
	// Stream<Optional<T>> and to require a Stream<T> containing all the elements in
	// the nonempty optionals in order to proceed.

	// Container types, including collections, maps, streams, arrays, and optionals
	// should not be wrapped in optionals.

	// So when should you declare a method to return Optional<T> rather than T? As a
	// rule, you should declare a method to return Optional<T> if it might not be
	// able to return a result and clients will have to perform special processing
	// if no result is returned.

	// Optional<T> for the primitive types int, long, and double. These optional
	// types are OptionalInt, OptionalLong, and OptionalDouble. They contain most,
	// but not all, of the methods on Optional<T>. Therefore, you should never
	// return an optional of a boxed primitive type, with the possible exception of
	// the “minor primitive types,” Boolean, Byte, Character, Short, and Float.

	// More generally, it is almost never appropriate to use an optional as a key,
	// value, or element in a collection or array.

	// In summary, if you find yourself writing a method that can’t always return a
	// value and you believe it is important that users of the method consider this
	// possibility every time they call it, then you should probably return an
	// optional. You should, however, be aware that there are real performance
	// consequences associated with returning optionals; for performance-critical
	// methods, it may be better to return a null or throw an exception. Finally,
	// you should rarely use an optional in any other capacity than as a return
	// value.
}
