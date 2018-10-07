package chapter05.item30.examples;

import java.util.function.UnaryOperator;

public class Test02 {

	private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

	@SuppressWarnings("unchecked")
	public static <T> UnaryOperator<T> identityFunction() {
		return (UnaryOperator<T>) IDENTITY_FN;
	}

	public static void main(String[] args) {
		String[] strings = { "jute", "hemp" };

		UnaryOperator<String> sameString = identityFunction();
		for(String s : strings)
			System.out.println(sameString.apply(s));
	}
}
