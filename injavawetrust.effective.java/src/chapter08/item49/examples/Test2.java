package chapter08.item49.examples;

public class Test2 {

	// Private helper function for a recursive sort
	private static void sort(long a[], int offset, int length) {
		assert a != null;
		assert offset >= 0 && offset <= a.length;
		assert length >= 0 && length <= a.length - offset;
		// Do the computation

		// In essence, these assertions are claims that the asserted condition will be
		// true, regardless of how the enclosing package is used by its clients. Unlike
		// normal validity checks, assertions throw AssertionError if they fail. And
		// unlike normal validity checks, they have no effect and essentially no cost
		// unless you enable them, which you do by passing the -ea (or
		// -enableassertions) flag to the java command.
	}
}
