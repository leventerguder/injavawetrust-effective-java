package chapter05.item28.examples;

public class Test01 {

	public static void main(String[] args) {

		// Fails at runtime
		Object[] objectArray = new Long[1];
		objectArray[0] = "I dont fit in"; // Throws java.lang.ArrayStoreException: java.lang.String
	}
}
