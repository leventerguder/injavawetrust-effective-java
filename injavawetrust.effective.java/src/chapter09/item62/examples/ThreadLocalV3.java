package chapter09.item62.examples;

public class ThreadLocalV3<T> {
	public ThreadLocalV3() {
	}

	public void set(T value) {
	}

	public T get() {
		return null;
	}
	/*
	 * This is, roughly speaking, the API that java.lang.ThreadLocal provides. In
	 * addition to solving the problems with the string-based API, it is faster and
	 * more elegant than either of the key-based APIs.
	 */
}
