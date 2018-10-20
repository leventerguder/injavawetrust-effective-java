package chapter09.item61.examples;

public class Test4 {

	static Integer i;

	public static void main(String[] args) {
		if (i == 42)
			System.out.println("Unbelievable");
	}
	// It throws a NullPointerException when evaluating the expression i==42.

	// In nearly every case when you mix primitives and boxed primitives
	// in an operation, the boxed primitive is auto-unboxed.

	// If a null object reference is auto-unboxed, you get a NullPointerException.
}
