package chapter07.item42.examples;

import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparingInt;

public class Test04 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("prefer", "lambdas", "to", "anonymous", "classes");
		words.sort(comparingInt(String::length));
		System.out.println(words);
	}
}
