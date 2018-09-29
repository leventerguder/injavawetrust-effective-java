package chapter03.item13.examples;

import java.util.Arrays;
import java.util.EmptyStackException;

// if the clone method merely returns super.clone() 
// the resulting Stack instance will have the correct value in its size field
// but its elements field will refer to the same array as the original Stack instance.
// Modifying the original will destroy the invariants in the clone and vice versa.
public class StackImpl implements Cloneable {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public StackImpl() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[size--];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

	// ensure space for at least one more element , roughly
	// doubling the
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}

	@Override
	protected StackImpl clone() {
		try {
			return (StackImpl) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

	@Override
	public String toString() {
		return "Stack [elements=" + Arrays.toString(elements) + ", size=" + size + "]";
	}

}
