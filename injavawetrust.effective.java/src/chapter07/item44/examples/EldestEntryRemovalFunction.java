package chapter07.item44.examples;

import java.util.Map;

// Unnecessary functional interface ; use a standard one instead
@FunctionalInterface
public interface EldestEntryRemovalFunction<K, V> {
	boolean remove(Map<K, V> map, Map.Entry<K, V> eldest);

	// This interface would work fine, but you shouldn’t use it, because you don’t
	// need to declare a new interface for this purpose. The
	// java.util.function package provides a large collection of standard
	// functional interfaces for your use.

	// If one of the standard functional
	// interfaces does the job, you should generally use it in preference to a
	// purpose-built functional interface.
}
