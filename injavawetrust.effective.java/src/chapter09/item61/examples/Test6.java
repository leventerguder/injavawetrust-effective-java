package chapter09.item61.examples;

public class Test6 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		long sum = 0L; // Long -> long
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);

		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}
}
