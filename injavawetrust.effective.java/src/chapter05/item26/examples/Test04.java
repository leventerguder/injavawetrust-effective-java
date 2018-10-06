package chapter05.item26.examples;

import java.util.Set;

public class Test04 {

	// Use of raw type for unknown element type - dont do this.

	// This method works but it uses raw types , which are dangerous.
	// The safe alternative is to use unbounded wildcard types.
	// if you want to use a generic type but you dont know or care what the actual
	// type parameter is you can use a question mark instead
	static int numElementsInCommon(Set s1, Set s2) {
		int result = 0;
		for (Object o1 : s1)
			if (s2.contains(o1))
				result++;
		return result;
	}

	// Uses unbounded wildcard type - typesafe and flexible
	static int numElementsInCommonAny(Set<?> s1, Set<?> s2) {
		int result = 0;
		for (Object o1 : s1)
			if (s2.contains(o1))
				result++;
		return result;
	}

	// What is the difference between the unbounded wildcard type Set<?> and the raw
	// type Set ?
	// wildcard type is safe and the raw type isnt.
	// you can put any element into a collection with a raw type , easily corrupting
	// the collection's type invariant

	// You cant put any element (other than null) into a Collection<?>
}
