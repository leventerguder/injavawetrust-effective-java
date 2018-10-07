package chapter05.item29.examples;

import java.util.Arrays;
import java.util.EmptyStackException;

// Object based collection - a prime candidate for generics
public class StackV1 {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public StackV1() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null; // eliminate obsolete reference
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}

	// This class should have been parameterized to begin with , but since it was
	// we can generify it after the fact.
	// In other words , we can parameterize it without harming clients of the
	// original non-parameterized version.
}
