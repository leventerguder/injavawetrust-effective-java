package chapter08.item53.examples;

public class Test1 {
	// Simple use of varargs
	static int sum(int... args) {
		int sum = 0;
		for (int arg : args)
			sum += arg;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sum(1, 4, 6, 7, 10));
	}
}
