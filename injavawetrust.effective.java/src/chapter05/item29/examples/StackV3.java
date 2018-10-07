package chapter05.item29.examples;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackV3<E> {

	// The second way to eliminate the generic array creation error,
	// change the type of the field "elements" from E[] to Object[]

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public StackV3() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public E pop() {
		if (size == 0)
			throw new EmptyStackException();
		// E result = elements[--size]; // compile error
		// ----------------------------------
		// push requires elements to be of type e, so cast is correct
		@SuppressWarnings("unchecked")
		E result = (E) elements[--size]; // Type safety: Unchecked cast from Object to E
		// E is a non-reifiable type, there is no way the compiler can check the cast at
		// runtime.
		// ## It is appropriate to suppress the warning
		// ## Suppress the warning only on the assignment that contains the unchecked
		// cast , not on the entire pop method
		elements[size] = null; // eliminate obsolete reference
		return result;
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
