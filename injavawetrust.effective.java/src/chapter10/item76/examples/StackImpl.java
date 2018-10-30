package chapter10.item76.examples;

import java.util.EmptyStackException;

public class StackImpl {

	private Object[] elements;
	private int size = 0;

	// For example, consider the Stack.pop method in Item 7:
	// If the initial size check were eliminated, the method would still throw an
	// exception when it attempted to pop an element from an empty stack. It would,
	// however, leave the size field in an inconsistent (negative) state, causing
	// any future method invocations on the object to fail. Additionally, the
	// ArrayIndexOutOfBoundsException thrown by the pop method would be
	// inappropriate to the abstraction (Item 73).

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[size--];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

	///
}
