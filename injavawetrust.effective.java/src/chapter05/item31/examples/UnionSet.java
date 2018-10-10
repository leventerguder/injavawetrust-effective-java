package chapter05.item31.examples;

import java.util.HashSet;
import java.util.Set;

public class UnionSet {

	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

	// Both parameters, s1 and s2, are E producers, so the PECS mnemonic tells us
	// that the declaration should be as follows:

	public static <E> Set<E> unionV2(Set<? extends E> s1, Set<? extends E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

	// Note that the return type is still Set<E>. Do not use bounded wildcard types
	// as return types.

}
