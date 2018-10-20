package chapter09.item57.examples;

import java.util.Iterator;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * To see why these for loops are preferable to a while loop, consider the
		 * following code fragment, which contains two while loops and one bug:
		 */

		List<String> list = List.of("e1", "e2", "e3");
		List<String> list2 = List.of("e4", "e5", "e6");

		for (Iterator<String> i = list.iterator(); i.hasNext();) {
			String s = i.next();
		}

		/*
		 * If a similar copy-and-paste error were made in conjunction with either of the
		 * for loops (for-each or traditional), the resulting code wouldn’t even
		 * compile. The element (or iterator) variable from the first loop would not be
		 * in scope in the second loop
		 */
		// Compile-time error - cannot find symbol i
//		for (Iterator<String> i2 = list2.iterator(); i.hasNext();) {
//			String s = i2.next();
//		}

	}

	public static void doSomething(String s) {
	}
}
