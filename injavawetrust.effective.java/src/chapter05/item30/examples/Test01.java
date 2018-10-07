package chapter05.item30.examples;

import java.util.HashSet;
import java.util.Set;

public class Test01 {

	// Uses raw types - unacceptable (Item 26)
	public static Set union(Set s1, Set s2) {
		Set result = new HashSet(s1);
		result.addAll(s2);
		return result;
	}

	// The type parameter list, which declares the type parameters, goes between a
	// method's modifiers and its return type

	// Generic method
	public static <E> Set<E> unionV2(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}
	
	// A limitation of the unionV2 method is that the types of all three sets have to be exactly the same.
	// You can make the method more flexible by using bounded wildcard types (Item 31)

	public static void main(String[] args) {

		Set<String> guys = Set.of("Tom", "Dick", "Harry");
		Set<String> guys2 = Set.of("Larry", "Moe", "Curly");
		
		Set<String> united1 = union(guys, guys2);
		System.out.println(united1);
		
		Set<String> united2 = unionV2(guys, guys2);
		System.out.println(united2);
				
	}

}
