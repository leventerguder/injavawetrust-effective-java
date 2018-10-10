package chapter05.item31.examples;

import java.util.Collection;

public class Chooser<T> {

	// This constructor uses the collection choices only to produce values of type T
	// (and stores them for later use), so its declaration should use a wildcard
	// type that extends T.
	public Chooser(Collection<T> choices) {

	}
}
