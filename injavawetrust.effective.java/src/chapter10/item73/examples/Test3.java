package chapter10.item73.examples;

public class Test3 {

	// The higher-level exception’s constructor passes the cause to a chaining-aware
	// superclass constructor, so it is ultimately passed to one of Throwable’s
	// chaining-aware constructors, such as Throwable(Throwable):
}

//Exception with chaining-aware constructor
class HigherLevelExceptionV3 extends Exception {
	HigherLevelExceptionV3(Throwable cause) {
		super(cause);
	}
}