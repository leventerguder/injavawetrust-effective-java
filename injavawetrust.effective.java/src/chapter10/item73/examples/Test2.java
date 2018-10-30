package chapter10.item73.examples;

public class Test2 {

	public static void main(String[] args) throws HigherLevelExceptionV2 {
		// Exception Chaining
		try {
			throwException();
			// Use lower-level abstraction to do our bidding
		} catch (LowerLevelExceptionV2 cause) {
			throw new HigherLevelExceptionV2(cause);
		}
	}

	public static void throwException() throws LowerLevelExceptionV2 {
	}
}

class LowerLevelExceptionV2 extends Exception {

}

class HigherLevelExceptionV2 extends Exception {

	public HigherLevelExceptionV2(LowerLevelExceptionV2 lower) {
		super(lower);
	}
}