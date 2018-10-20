package chapter09.item57.examples;

public class Test4 {

	public static void main(String[] args) {

		for (int i = 0, n = expensiveComputation(); i < n; i++) {
			// Do something...
		}

		/*
		 * The important thing to notice about this idiom is that it has two loop
		 * variables, i and n, both of which have exactly the right scope
		 * 
		 * The second variable, n, is used to store the limit of the first, thus
		 * avoiding the cost of a redundant computation in every iteration.
		 */

		/*
		 * As a rule, you should use this idiom if the loop test involves a method
		 * invocation that is guaranteed to return the same result on each iteration.
		 */
	}

	public static int expensiveComputation() {
		return 1;
	}
}
