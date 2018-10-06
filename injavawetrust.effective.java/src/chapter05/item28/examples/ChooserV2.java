package chapter05.item28.examples;

import java.util.Collection;

public class ChooserV2<T> {

	private final T[] choiceArray;

	public ChooserV2(Collection<T> choices) {
		// choiceArray = choices.toArray();
		// Type mismatch: cannot convert from Object[] to T[]

		choiceArray = (T[]) choices.toArray();
		// Type safety: Unchecked cast from Object[] to T[]

		// The compiler is telling you tht it cant vouch for the safety of the cast at
		// runtime because the program wont know what type T represent.
		// remember element type information is erased from generic at runtime.

		// To eliminate the unchecked cast warning , use a list instead of an array.
		
	}
}

@FunctionalInterface
interface A {
	
	void aaa();
	
	boolean equals(Object o);
}