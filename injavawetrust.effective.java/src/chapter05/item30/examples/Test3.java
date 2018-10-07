package chapter05.item30.examples;

import java.util.Collection;
import java.util.Objects;

public class Test3 {

	// Using a recursive type bound to express mutual comparability
	// The type bound <E extends Comparable<E>> may be read as "any type E that can
	// be compared to itself"
	// which corresponds more or less precisely to the notion of mutual
	// comparability.

	// Returns max value in a collection - uses recursive type bound
	public static <E extends Comparable<E>> E max(Collection<E> c) {

		if (c.isEmpty())
			throw new IllegalArgumentException("Empty collection");
		E result = null;
		for (E e : c)
			if (result == null || e.compareTo(result) > 0)
				result = Objects.requireNonNull(e);
		return result;
	}
}
