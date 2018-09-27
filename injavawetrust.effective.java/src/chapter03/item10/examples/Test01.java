package chapter03.item10.examples;

public class Test01 {

	@Override
	public boolean equals(Object obj) {
		throw new AssertionError();
		// Method is never called.
	}
}
