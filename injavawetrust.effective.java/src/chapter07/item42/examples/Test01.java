package chapter07.item42.examples;

import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("prefer", "lambdas", "to", "anonymous", "classes");

		// Anonymous class instance as a function object obsolete!
		Collections.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		System.out.println(words);
	}
}
