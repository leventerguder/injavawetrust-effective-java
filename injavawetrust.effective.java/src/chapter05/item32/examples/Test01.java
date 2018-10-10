package chapter05.item32.examples;

import java.util.Arrays;
import java.util.List;

public class Test01 {

	// Mixing generics and varargs can violate type safety!
	static void dangerous(List<String>... stringLists) {
		List<Integer> intList = List.of(42);
		Object[] objects = stringLists;
		objects[0] = intList; // Heap pollution
		String s = stringLists[0].get(0); // ClassCastException
		
		// it is unsafe to store a value in a generic varargs array parameter.
	}

	public static void main(String[] args) {
		dangerous(Arrays.asList("k1", "k2", "k3"));
	}
}
