package chapter08.item55.examples;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

public class Test1 {

	// Returns maximum value in collection - throws exception if empty
	public static <E extends Comparable<E>> E max(Collection<E> c) {

		if (c.isEmpty())
			throw new IllegalArgumentException("Empty collection");

		E result = null;
		for (E e : c)
			if (result == null || e.compareTo(result) > 0)
				result = Objects.requireNonNull(e);
		return result;
	}

	// This method throws an IllegalArgumentException if the given collection is
	// empty. We mentioned in Item 30 that a better alternative would be to return
	// Optional<E>.

	public static <E extends Comparable<E>> Optional<E> maxV2(Collection<E> c) {
		if (c.isEmpty())
			return Optional.empty();
		E result = null;
		for (E e : c)
			if (result == null || e.compareTo(result) > 0)
				result = Objects.requireNonNull(e);
		return Optional.of(result);
	}

	/*
	 * As you can see, it is straightforward to return an optional. All you have to
	 * do is to create the optional with the appropriate static factory. In this
	 * program, we use two: Optional.empty() returns an empty optional, and
	 * Optional.of(value) returns an optional containing the given non-null value.
	 *
	 */
	
	// Returns max val in collection as Optional<E> - uses stream
	public static <E extends Comparable<E>>
	          Optional<E> maxV3(Collection<E> c) {
	      return c.stream().max(Comparator.naturalOrder());
	}
}
