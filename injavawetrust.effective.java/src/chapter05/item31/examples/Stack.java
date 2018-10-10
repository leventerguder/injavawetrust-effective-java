package chapter05.item31.examples;

import java.util.Collection;
import java.util.EmptyStackException;

public class Stack<E> {
	private int size = 0;

	// pushAll method without wildcard type - deficient!
	public void pushAll(Iterable<E> src) {
		for (E e : src)
			push(e);
	}

	// the type of the input parameter to pushAll should not be “Iterable of E” but
	// "Iterable of some subtype of E," and there is a wildcard type that means
	// precisely that: Iterable<? extends E>

	// Wildcard type for a parameter that serves as an E producer
	public void pushAllV2(Iterable<? extends E> src) {
		for (E e : src)
			push(e);
	}

	public void push(E e) {
		//
	}

	// popAll method without wildcard type - deficient!
	public void popAll(Collection<E> dst) {
		while (!isEmpty())
			dst.add(pop());
	}

	// Wildcard type for parameter that serves as an E consumer
	public void popAllV2(Collection<? super E> dst) {
		while (!isEmpty())
			dst.add(pop());
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E pop() {
		return null;
	}
}
