package chapter09.item63.examples;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	// Inappropriate use of string concatenation - Performs poorly!
	private List<String> numItems = Arrays.asList("e", "e2", "e3", "e4");

	public String statement() {
		String result = "";
		for (int i = 0; i < numItems(); i++)

			result += lineForItem(i); // String concatenation
		return result;
	}

	private int numItems() {
		return numItems.size();
	}

	private String lineForItem(int i) {
		return numItems.get(i);
	}
}
