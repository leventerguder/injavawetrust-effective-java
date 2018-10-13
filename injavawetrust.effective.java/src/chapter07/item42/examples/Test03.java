package chapter07.item42.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static java.util.Comparator.comparingInt;

public class Test03 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("prefer", "lambdas", "to", "anonymous", "classes");
		Collections.sort(words, comparingInt(String::length));
		System.out.println(words);
	}
}
