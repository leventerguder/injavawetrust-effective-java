package chapter05.item31.examples;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {

		Stack<Number> numberStack = new Stack<>();
		Iterable<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

		// You will get error message because parameterized types are invariants
		// numberStack.pushAll(integers);
		// compile error , incompatible types:

		numberStack.pushAllV2(integers);

		Collection<Object> objects = List.of();
		// numberStack.popAll(objects); //
	}
}
