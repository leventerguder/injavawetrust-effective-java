package chapter11.item81.examples;

import java.util.concurrent.*;

public class Test2 {

	// Concurrent canonicalizing map atop ConcurrentMap - not optimal
	private static final ConcurrentMap<String, String> map = new ConcurrentHashMap<>();

	// Concurrent canonicalizing map atop ConcurrentMap - faster!
	public static String intern(String s) {
		String result = map.get(s);
		if (result == null) {
			result = map.putIfAbsent(s, s);
			if (result == null)
				result = s;
		}

		return result;
	}
}