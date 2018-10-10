package chapter05.item31.examples;

import java.util.List;

public class Test02 {

	// Two possible declarations for the swap method
	public static <E> void swapV1(List<E> list, int i, int j) {
	}

	// Which of these two declarations is preferable, and why? In a public API, the
	// second is better because it’s simpler. You pass in a list—any list—and the
	// method swaps the indexed elements. There is no type parameter to worry about.

	// As a rule, if a type parameter appears only once in a method declaration,
	// replace it with a wildcard.
	// If it’s an unbounded type parameter, replace it with an unbounded wildcard;
	// if it’s a bounded type parameter, replace it with a bounded wildcard.

	public static void swapV2(List<?> list, int i, int j) {
		// list.set(i, list.set(j, list.get(i))); // compile error
		// The problem is that the type of list is List<?>, and you can’t put any value
		// except null into a List<?>
		// Fortunately, there is a way to implement this method without resorting to an
		// unsafe cast or a raw type.
	}

	public static void swapV3(List<?> list, int i, int j) {
		swapHelper(list, i, j);
	}

	//
	// The swapHelper method knows that list is a List<E>
	// Therefore, it knows that any value it gets out of this list is of type E and
	// that it’s safe to put any value of type E into the list
	private static <E> void swapHelper(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}

	// This slightly convoluted implementation of swap compiles cleanly. It allows
	// us to export the nice wildcard-based declaration, while taking advantage of
	// the more complex generic method internally.
}
