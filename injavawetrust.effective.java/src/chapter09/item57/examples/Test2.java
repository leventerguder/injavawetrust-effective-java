package chapter09.item57.examples;

import java.util.Iterator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * To see why these for loops are preferable to a while loop, consider the
		 * following code fragment, which contains two while loops and one bug:
		 */

		List<String> list = List.of("e1", "e2", "e3");
		List<String> list2 = List.of("e4", "e5", "e6");

		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			doSomething(i.next());
		}

		Iterator<String> i2 = list2.iterator();
		while (i.hasNext()) { // BUG!!!
			doSomething(i2.next());
		}

		/*
		 * The second loop contains a copy-and-paste error: it initializes a new loop
		 * variable, i2, but uses the old one, i, which is, unfortunately, still in
		 * scope. The resulting code compiles without error and runs without throwing an
		 * exception, but it does the wrong thing.
		 */
		
	}

	public static void doSomething(String s) {
	}
}
