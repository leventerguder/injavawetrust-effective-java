package chapter09.item60.examples;

public class Test1 {

	public static void main(String[] args) {
		System.out.println(1.03 - 0.42);
		System.out.println(1.00 - 9 * 0.10);

		// 0.6100000000000001
		// 0.09999999999999998
		// You might think that the problem could be solved merely by rounding
		// results prior to printing, but unfortunately this does not always work.
	}
}
