package chapter09.item61.examples;

public class Test3 {

	static int i;

	public static void main(String[] args) {
		if (i == 42)
			System.out.println("Fixing nullpointerexception");

		// Fixing the problem is as simple as declaring i to be an int instead of an
		// Integer
	}
}
