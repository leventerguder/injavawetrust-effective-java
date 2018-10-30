package chapter10.item77.examples;

public class Test1 {

	public static void main(String[] args) {
		// Empty catch block ignores exception - Highly suspect!
		try {
			giveMeSomeException();
		} catch (SomeException e) {
		}
	}

	public static void giveMeSomeException() throws SomeException {
		throw new SomeException();
	}
}

class SomeException extends Exception {
}