package chapter09.item61.examples;

import java.util.Comparator;

public class Test2 {

	static Comparator<Integer> naturalOrder = (iBoxed, jBoxed) -> {
		int i = iBoxed, j = jBoxed; // Auto-unboxing
		return i < j ? -1 : (i == j ? 0 : 1);
	};


	public static void main(String[] args) {
		int value = naturalOrder.compare(new Integer(42), new Integer(42));
		System.out.println(value);
	}

}
