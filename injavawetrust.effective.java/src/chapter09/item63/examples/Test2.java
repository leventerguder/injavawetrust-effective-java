package chapter09.item63.examples;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	private static final int LINE_WIDTH = 10;
	private List<String> numItems = Arrays.asList("e", "e2", "e3", "e4");

	public String statement() {
		StringBuilder b = new StringBuilder(numItems() * LINE_WIDTH);
		for (int i = 0; i < numItems(); i++)
			b.append(lineForItem(i));
		return b.toString();
	}

	private int numItems() {
		return numItems.size();
	}

	private String lineForItem(int i) {
		return numItems.get(i);
	}
}
