package chapter10.item69.examples;

public class Test1 {

	public static void main(String[] args) {

		Mountain[] range = new Mountain[] { new Mountain(), new Mountain() };
		// Horrible abuse of exceptions. Don't ever do this!
		try {
			int i = 0;
			while (true)
				range[i++].climb();
		} catch (ArrayIndexOutOfBoundsException e) {
		}

		// It’s supposed to be equivalent to the standard idiom for looping through an
		// array

		for (Mountain m : range)
			m.climb();

		// In fact, the exception-based idiom is far slower than the standard one.

		// If there is a bug in the loop, the use of exceptions for flow control can
		// mask the bug, greatly complicating the debugging process
	}
}

class Mountain {
	void climb() {

	}
}