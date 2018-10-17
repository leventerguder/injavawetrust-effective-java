package chapter08.item52.examples;

import java.util.*;

public class SetList {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		List<Integer> list = new ArrayList<>();

		for (int i = -3; i < 3; i++) {
			set.add(i);
			list.add(i);
		}

		System.out.println(set);
		System.out.println(list);

		for (int i = 0; i < 3; i++) {
			set.remove(i);
			list.remove(i);
		}

		System.out.println(set + " " + list);

		/*
		 * The call to set.remove(i) selects the overloading remove(E), where E is the
		 * element type of the set (Integer), and autoboxes i from int to Integer. This
		 * is the behavior you’d expect, so the program ends up removing the positive
		 * values from the set. The call to list.remove(i), on the other hand, selects
		 * the overloading remove(int i), which removes the element at the specified
		 * position in the list. If you start with the list [-3, -2, -1, 0, 1, 2] and
		 * remove the zeroth element, then the first, and then the second, you’re left
		 * with [-2, 0, 2], and the mystery is solved.
		 * 
		 */
		
	}
}
