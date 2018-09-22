package chapter02.item04.examples;

public class UtilityClass {

	private UtilityClass() {
		throw new AssertionError();
	}
	// Explicit constructor is private , it is inaccessible outside the class.
	// AssertionError ,it provides insurance in case the constructor is accidentally
	// invoked from within the class.
}
