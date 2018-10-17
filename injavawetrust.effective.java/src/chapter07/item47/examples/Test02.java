package chapter07.item47.examples;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Test02 {

	// Adapter from Iterable<E> to Stream<E>
	public static <E> Stream<E> streamOf(Iterable<E> iterable) {
		return StreamSupport.stream(iterable.spliterator(), false);
	}
}
