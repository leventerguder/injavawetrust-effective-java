package chapter12.item87.examples;

import java.io.Serializable;

// Awful candidate for default serialized form
public final class StringList implements Serializable {
	private int size = 0;
	private Entry head = null;

	private static class Entry implements Serializable {
		String data;
		Entry next;
		Entry previous;
	}

	// Logically speaking, this class represents a sequence of strings. Physically,
	// it represents the sequence as a doubly linked list. If you accept the default
	// serialized form, the serialized form will painstakingly mirror every entry in
	// the linked list and all the links between the entries, in both directions.
}
