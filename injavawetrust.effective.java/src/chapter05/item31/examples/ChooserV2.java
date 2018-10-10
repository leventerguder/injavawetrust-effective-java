package chapter05.item31.examples;

import java.util.Collection;

public class ChooserV2<T> {
	
	// Wildcard type for parameter that serves as an T producer
	public ChooserV2(Collection<? extends T> choices) {

	}
}
