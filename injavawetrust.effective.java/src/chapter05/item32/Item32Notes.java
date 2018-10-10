package chapter05.item32;

public class Item32Notes {

	// ##### Item 32: Combine generics and varargs judiciously

	// The purpose of varargs is to allow clients to pass a variable number of
	// arguments to a method, but it is a leaky abstraction: when you invoke a
	// varargs method, an array is created to hold the varargs parameters; that
	// array, which should be an implementation detail, is visible.

	// As a consequence, you get confusing compiler warnings when varargs parameters
	// have generic or parameterized types.

	// a non-reifiable type is one whose runtime representation has less information
	// than its compile-time representation, and that nearly all generic and
	// parameterized types are non-reifiable.

	// If a method declares its varargs parameter to be of a non-reifiable type, the
	// compiler generates a warning on the declaration. If the method is invoked on
	// varargs parameters whose inferred type is non-reifiable, the compiler
	// generates a warning on the invocation too.

	// Heap pollution occurs when a variable of a parameterized type refers to an
	// object that is not of that type
	// TODO Heap Pollution
	// https://en.0wikipedia.org/wiki/Heap_pollution
	// https://docs.oracle.com/javase/tutorial/java/generics/nonReifiableVarargsType.html

	// it is unsafe to store a value in a generic varargs array parameter.

	// In fact, the Java libraries export several such methods, including
	// Arrays.asList(T... a),
	// Collections.addAll(Collection<? super T> c, T... elements)
	// EnumSet.of(E first, E... rest)

	// In Java 7, the SafeVarargs annotation was added to the platform, to allow the
	// author of a method with a generic varargs parameter to suppress client
	// warnings automatically

	// In essence, the SafeVarargs annotation constitutes a promise by the author of
	// a method that it is typesafe.

	// if the varargs parameter array is used only to transmit a variable number of
	// arguments from the caller to the method—which is, after all, the purpose of
	// varargs—then the method is safe.

	// It is critical that you do not annotate a method with @SafeVarargs unless it
	// actually is safe.

	// it is safe to pass the array to another varargs method that is correctly
	// annotated with @SafeVarargs, and it is safe to pass the array to a
	// non-varargs method that merely computes some function of the contents of the
	// array.

	// Use @SafeVarargs on every method with a varargs parameter of a generic or
	// parameterized type, so its users won’t be burdened by needless and confusing
	// compiler warnings.

	// As a reminder, a generic varargs methods is safe if:
	// 1. it doesn’t store anything in the varargs parameter array, and
	// 2. it doesn’t make the array (or a clone) visible to untrusted code. If
	// either of these prohibitions is violated, fix it.

	// Note that the SafeVarargs annotation is legal only on methods that can’t be
	// overridden, because it is impossible to guarantee that every possible
	// overriding method will be safe.

	// In Java 8, the annotation was legal only on static methods and final instance
	// methods; in Java 9, it became legal on private instance methods as well.

	// In summary, varargs and generics do not interact well because the varargs
	// facility is a leaky abstraction built atop arrays, and arrays have different
	// type rules from generics.
	// Though generic varargs parameters are not typesafe, they are legal. If you
	// choose to write a method with a generic (or parameterized) varargs parameter,
	// first ensure that the method is typesafe, and then annotate it with
	// @SafeVarargs so it is not unpleasant to use.
}
