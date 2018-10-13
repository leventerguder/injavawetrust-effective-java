package chapter07.item43.examples;

import java.util.HashMap;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(10, 100);

		int key = 10;
		map.merge(key, 200, (count, incr) -> count + incr);

		System.out.println(map);

		/*
		 * Note that this code uses the merge method, which was added to the Map
		 * interface in Java 8. If no mapping is present for the given key, the method
		 * simply inserts the given value; if a mapping is already present, merge
		 * applies the given function to the current value and the given value and
		 * overwrites the current value with the result. This code represents a typical
		 * use case for the merge method.
		 */

		/*
		 * The code reads nicely, but there’s still some boilerplate. The parameters
		 * count and incr don’t add much value, and they take up a fair amount of space.
		 * Really, all the lambda tells you is that the function returns the sum of its
		 * two arguments.
		 */
		map.merge(key, 300, Integer::sum);

		System.out.println(map);
	}
}
