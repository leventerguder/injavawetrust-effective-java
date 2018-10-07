package chapter05.item29.examples;

import java.util.Arrays;
import java.util.EmptyStackException;

//The first step in generifying a class is to add one or more type parameters
// to its declaration.
// In this case there is one type parameter , representing the element type of
// the stack ,
// and the convertional name for this type parameter is E (item 68)

// The next step is to replace all the uses of the type Object with the
// appropriate type parameter and then try to compile the resulting program

public class StackV2<E> {

	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	// The elements array will contain only E instance from push(E)
	// This is sufficient to ensure type safety but the runtime type of the array wont be E[]
	// it will always be Object[]
	@SuppressWarnings("unchecked")
	public StackV2() {
		// elements = new E[DEFAULT_INITIAL_CAPACITY];
		// Compile error
		// You can't create an array of a non-reifiable type such as E
		//
		// There are two reasonable ways to solve it.
		// The first solution directly circumvents the prohibition on generic array
		// creation :
		// create an array of Object an cast it to the generic array type.
		// This usaage is legal but it 's not (in general ) typesafe

		elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
		// Type safety: Unchecked cast from Object[] to E[]

		// Once you have proved that an unchecked cast is safe , suppress the warning in
		// as narrow scope as possible (Item 27)

	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public E pop() {
		if (size == 0)
			throw new EmptyStackException();
		E result = elements[--size];
		elements[size] = null; // eliminate obsolete reference
		return result;
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
