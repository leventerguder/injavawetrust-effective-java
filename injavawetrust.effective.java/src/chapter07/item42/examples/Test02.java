package chapter07.item42.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {

		// Lambda expression as function object /// replaces anonymous class
		List<String> words = Arrays.asList("prefer", "lambdas", "to", "anonymous", "classes");
		Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// The compiler deduces these types from context, using a
		// process known as type inference

		// In some cases, the compiler won’t be able to
		// determine the types, and you’ll have to specify them

		// Omit the types of all lambda parameters unless their presence makes your
		// program clearer.
	}
}
