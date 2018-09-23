package chapter02.item07.examples;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackImpl {

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

	// memory leak
	public Object popMemoryLeak() {
		if (size == 0)
			throw new EmptyStackException();
		return elements[--size];
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
}

// if a stack grows and then shrinks , the objects that were popped off the stack will not be garbage collected,
// even if the program using the stack has no more references to them.
// This is because the stacks maintains obsolete references to these objects.
// An obsolete reference is simply a reference that will never be dereferenced again.

// Memory leaks in garbage-collected languages are insidious.
// The fix for this sort of problem is simple : null out references once they become obsolete.
// In the case of our StackImpl class the reference to an item becomes obsolete as soon as it's popped off the stack.

// Ad added benefit of nulling out obsolete references is that if they are subsequently dereferenced by mistake ,
// the program will immediately fail with a NullPointerException , rather that quietly doing the wrong thing.
// It is always beneficial to detect programming errors as quickly as possible.

// Nulling out object references should be the exception rather than the norm.
// Each variable in the narrowest possible scope.

// Generally speaking , whenever  a class manages its own memory , the programmer should be alert for memory leaks.

// Another common source of memory leaks is caches.
// Once you put an object reference into a cache , its easy to forget that its there and leave it is the cache long after it becomes irrelevant.
// 
// WeakHashMap is useful only if the desired lifetime of cache entries is determined by external references to the key , not the value.

// A third common source of memory of leaks is listeners and other callbacks.
// if you implement an API where clients register callbacks but dont deregister them explicitly , they will accumulate unless you take some action.
// One way to ensure that callbacks are garbage collected promptly is to store only weak references to them , for instance ,
// by storing them only as keys in a WeakHashMap

// Memory leaks typically do not manifest themselves as obvious failures , they may remain present in a system for years.
// they are typically discovered only as a result of careful code inspetion or with the aid of a debugging tool known as a heap profiler.
//