package chapter09.item59.examples;

import java.util.Random;

public class Test1 {

	/*
	 * Suppose you want to generate random integers between zero and some upper
	 * bound. Faced with this common task, many programmers would write a little
	 * method that looks something like this:
	 */

	// Common but deeply flawed!
	static Random rnd = new Random();

	static int random(int n) {
		return Math.abs(rnd.nextInt()) % n;
	}
	/*
	 * This method may look good, but it has three flaws. The first is that if n is
	 * a small power of two, the sequence of random numbers will repeat itself after
	 * a fairly short period. The second flaw is that if n is not a power of two,
	 * some numbers will, on average, be returned more frequently than others. If n
	 * is large, this effect can be quite pronounced. This is powerfully
	 * demonstrated by the following program, which generates a million random
	 * numbers in a carefully chosen range and then prints out how many of the
	 * numbers fell in the lower half of the range:
	 * 
	 */

	/*
	 * The third flaw in the random method is that it can, on rare occasions, fail
	 * catastrophically, returning a number outside the specified range. This is so
	 * because the method attempts to map the value returned by rnd.nextInt() to a
	 * non-negative int by calling Math.abs. If nextInt() returns Integer.MIN_VALUE,
	 * Math.abs will also return Integer.MIN_VALUE, and the remainder operator (%)
	 * will return a negative number, assuming n is not a power of two. This will
	 * almost certainly cause your program to fail, and the failure may be difficult
	 * to reproduce.
	 */
	public static void main(String[] args) {
		int n = 2 * (Integer.MAX_VALUE / 3);
		int low = 0;
		for (int i = 0; i < 1000000; i++)
			if (random(n) < n / 2)
				low++;
		System.out.println(low);
	}

}
