package chapter09.item57.examples;

import java.util.Iterator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List<String> list = List.of("e1", "e2", "e3");
		// Preferred idiom for iterating over a collection or array
		for (String s : list) {

		}

		/*
		 * If you need access to the iterator, perhaps to call its remove method, the
		 * preferred idiom uses a traditional for loop in place of the for-each loop:
		 */

		// Idiom for iterating when you need the iterator
		for (Iterator<String> i = list.iterator(); i.hasNext();) {
			String s = i.next();
		}
	}
}
