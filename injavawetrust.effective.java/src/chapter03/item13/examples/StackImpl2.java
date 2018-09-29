package chapter03.item13.examples;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackImpl2 implements Cloneable {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public StackImpl2() {
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

	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}

//	@Override
//	protected StackImpl2 clone() {
//		try {
//			return (StackImpl2) super.clone();
//		} catch (CloneNotSupportedException e) {
//			throw new AssertionError();
//		}
//	}

	// Clone method for class with references to mutable state
	@Override
	protected StackImpl2 clone() {
		try {
			StackImpl2 result = (StackImpl2) super.clone();
			result.elements = elements.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	// if the elements field were final because clone would be prohibited from
	// assigning a new value to the field.
	// This is a fundamental problme : like serialization , 
	// The Cloneable architecture is imcompatible with normal use of final fields referring to mutable objects
	// except in cases where the mutable objects may be safely shared between an object and its clone.
	
	// In order to make a class cloneable , it may be necessary to remove final modifiers from some fields.

	@Override
	public String toString() {
		return "Stack [elements=" + Arrays.toString(elements) + ", size=" + size + "]";
	}

}
