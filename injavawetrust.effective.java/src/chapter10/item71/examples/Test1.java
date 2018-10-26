package chapter10.item71.examples;

import java.io.FileNotFoundException;

public class Test1 {

	public void throwException() throws TheCheckedException {
		throw new TheCheckedException();
	}

	public void testMethod() {
		try {
			throwException();
		} catch (TheCheckedException e) {
			throw new AssertionError(); // Can't happen!
		}

		try {
			throwException();
		} catch (TheCheckedException e) {
			e.printStackTrace(); // Oh well, we lose.
			System.exit(1);
		}

		String[] args = new String[] {};
		if (actionPermitted(args)) {

		} else {

		}
	}

	public boolean actionPermitted(String[] args) {
		return true;
	}

}

class TheCheckedException extends FileNotFoundException {

}