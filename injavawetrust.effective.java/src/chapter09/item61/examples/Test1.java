package chapter09.item61.examples;

import java.util.Comparator;

public class Test1 {
	// Broken comparator - can you spot the flaw?
	static Comparator<Integer> naturalOrder = (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

	public static void main(String[] args) {
		int value = naturalOrder.compare(new Integer(42), new Integer(42));
		System.out.println(value);

		/*
		 * Both Integer instances represent the same value (42), so the value of this
		 * expression should be 0, but it’s 1, which indicates that the first Integer
		 * value is greater than the second!
		 */
		
		// expression i==j, which performs an identity comparison on the two object references
		
		// Applying the == operator to boxed primitives is almost always wrong.
	}
}
