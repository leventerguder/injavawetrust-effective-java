package chapter09.item61.examples;

public class Test5 {

	// Hideously slow program! Can you spot the object creation?
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}

	/*
	 * This program is much slower than it should be because it accidentally
	 * declares a local variable (sum) to be of the boxed primitive type Long
	 * instead of the primitive type long. The program compiles without error or
	 * warning, and the variable is repeatedly boxed and unboxed, causing the
	 * observed performance degradation.
	 */
}
