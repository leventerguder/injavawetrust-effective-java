package chapter09.item58.examples;

import java.util.Iterator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List<String> list = List.of("e1", "e2", "e3");

		// Not the best way to iterate over a collection !
		for (Iterator<String> i = list.iterator(); i.hasNext();) {
			String s = i.next();
			// do something...
		}

		int[] array = { 11, 22, 33, 44, 55 };
		for (int i = 0; i < array.length; i++) {
			// do something...
		}

		// These idioms are better than while loops (Item 57), but they aren’t perfect
		// The iterator and the index variables are both just clutter

		// The preferred idiom for iterating over collections and arrays
		for (String s : list) {
			/*
			 * When you see the colon (:), read it as “in.” Thus, the loop above reads as
			 * “for each element e in elements.”
			 * 
			 */
		}
	}
}
