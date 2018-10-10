package chapter05.item31.examples;

import java.util.Set;

public class UnionSetTest {

	public static void main(String[] args) {
		Set<Integer> integers = Set.of(1, 3, 5);
		Set<Double> doubles = Set.of(2.0, 4.0, 6.0);
		//
		// Set<Number> numbers1 = UnionSet.union(integers, doubles); // compile error
		Set<Number> numbers2 = UnionSet.unionV2(integers, doubles);

		// Explicit type parameter - required prior to Java 8
		Set<Number> numbers3 = UnionSet.<Number>unionV2(integers, doubles);
	}
}
