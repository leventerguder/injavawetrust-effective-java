package chapter09.item62.examples;

//Broken - inappropriate use of string as capability!
/*
 * The problem with this approach is that the string keys represent a shared
 * global namespace for thread-local variables. In order for the approach to
 * work, the client-provided string keys have to be unique: if two clients
 * independently decide to use the same name for their thread-local variable,
 * they unintentionally share a single variable, which will generally cause both
 * clients to fail. Also, the security is poor. A malicious client could
 * intentionally use the same string key as another client to gain illicit
 * access to the other client’s data.
 */
public class ThreadLocalV1 {
	private ThreadLocalV1() {
	}
	// Noninstantiable

	// Sets the current thread's value for the named variable.

	public static void set(String key, Object value) {
	}

	// Returns the current thread's value for the named variable.
	public static Object get(String key) {
		return null;
	}
}