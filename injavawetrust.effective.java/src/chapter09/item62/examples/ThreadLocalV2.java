package chapter09.item62.examples;

public class ThreadLocalV2 {
	private ThreadLocalV2() {
	}

	public static class Key { // (Capability)
		Key() {
		}
	}

	// Generates a unique, unforgeable key
	public static Key getKey() {
		return new Key();
	}

	public static void set(Key key, Object value) {
	}

	public static Object get(Key key) {
		return null;
	}
}