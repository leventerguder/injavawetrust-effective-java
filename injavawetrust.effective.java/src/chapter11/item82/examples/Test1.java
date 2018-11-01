package chapter11.item82.examples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());
		Set<String> set = map.keySet(); // Needn't be in synchronized block

		synchronized (map) {
			for(String key : set) {
				//
			}
		}
	}
}
