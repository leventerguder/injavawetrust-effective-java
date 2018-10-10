package chapter06.item34.examples;

public class Test03Operation {

	public static void main(String[] args) {
		double x = 3.2;
		double y = 2.4;
		for (Operation op : Operation.values())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}
}
