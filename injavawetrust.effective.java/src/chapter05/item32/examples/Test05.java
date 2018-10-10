package chapter05.item32.examples;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Test05 {

	static <T> List<T> pickTwo(T a, T b, T c) {
		switch (ThreadLocalRandom.current().nextInt(3)) {
		case 0:
			return List.of(a, b);
		case 1:
			return List.of(a, c);
		case 2:
			return List.of(b, c);
		}
		throw new AssertionError();
	}

	// The resulting code is typesafe because it uses only generics, and not arrays.
	public static void main(String[] args) {
		List<String> attributes = pickTwo("Good", "Fast", "Cheap");
		System.out.println(attributes);
	}
}
