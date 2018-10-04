package chapter04.item20.examples;

import java.util.List;
import java.util.AbstractList;
import java.util.Objects;

public interface Test02 {

	// When you consider all that a List implementation does for you, this example
	// is an impressive demonstration of the power of skeletal implementations.
	// Incidentally, this example is an Adapter [Gamma95] that allows an int array
	// to be viewed as a list of Integer instances.

	// The beauty of skeletal implementation classes is that they provide all of the
	// implementation assistance of abstract classes without imposing the severe
	// constraints that abstract classes impose when they serve as type definitions.
	static List<Integer> intArrayAsList(int[] a) {
		Objects.requireNonNull(a);
		return new AbstractList<Integer>() {
			@Override
			public Integer get(int i) {
				return a[i]; // Autoboxing (Item 6)
			}

			@Override
			public Integer set(int i, Integer val) {
				int oldVal = a[i];
				a[i] = val; // Auto-unboxing
				return oldVal; // Autoboxing
			}

			@Override
			public int size() {
				return a.length;
			}
		};
	}
}
