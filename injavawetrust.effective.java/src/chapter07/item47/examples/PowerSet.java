package chapter07.item47.examples;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Set;

// Returns the power set of an input set as custom collection
public class PowerSet {

	public static final <E> Collection<Set<E>> of(Set<E> s) {

		List<E> src = new ArrayList<>(s);

		return new AbstractList<Set<E>>() {

			@Override
			public Set<E> get(int index) {
				Set<E> result = new HashSet<E>();
				for (int i = 0; index != 0; i++, index >>= 1)
					if ((index & 1) == 1)
						result.add(src.get(i));
				return result;
			}

			@Override
			public int size() {
				return 1 << src.size(); // 2 to power srcSize
			}

			@Override
			public boolean contains(Object o) {
				return o instanceof Set && src.containsAll((Set) o);
			}
		};
	}
}
