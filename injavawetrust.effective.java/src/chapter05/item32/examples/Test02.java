package chapter05.item32.examples;

import java.util.concurrent.ThreadLocalRandom;

public class Test02 {

	// UNSAFE - Exposes a reference to its generic parameter array!
	static <T> T[] toArray(T... args) {
		return args;
	}

	// This method simply returns its varargs parameter array. The method may not
	// look dangerous, but it is! The type of this array is determined by the
	// compile- time types of the arguments passed in to the method, and the
	// compiler may not have enough information to make an accurate determination.
	// Because this method returns its varargs parameter array, it can propagate
	// heap pollution up the call stack.

	static <T> T[] pickTwo(T a, T b, T c) {
		switch (ThreadLocalRandom.current().nextInt(3)) {
		case 0:
			// Warning : Type safety: A generic array of T is created for a varargs
			// parameter
			// This code allocates an array of type Object[], which is the most specific
			// type that is guaranteed to hold these instances, no matter what types of
			// objects are passed to pickTwo at the call site
			return toArray(a, b);
		case 1:
			return toArray(a, c);
		case 2:
			return toArray(b, c);
		}
		throw new AssertionError(); // Can't get here
	}

	public static void main(String[] args) {
		String[] attributes = pickTwo("Good", "Fast", "Cheap"); // ClassCastException
		// The cast fails, because Object[] is not a subtype of String[]
	}

	// it is unsafe to give another method access to a generic varargs parameter
	// array
}
