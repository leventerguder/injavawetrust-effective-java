package chapter10.item73.examples;

public class Test1 {

	public static void main(String[] args) throws HigherLevelException {

		// Exception Translation
		try {
			// Use lower-level abstraction to do our bidding
			throwException();
		} catch (LowerLevelException e) {
			throw new HigherLevelException();
		}

	}

	public static void throwException() throws LowerLevelException {
	}
}

class LowerLevelException extends Exception {

}

class HigherLevelException extends Exception {
	
}