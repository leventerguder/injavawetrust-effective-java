package chapter08.item55.examples;

import java.util.Optional;
import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {

		// When programming with streams, it is not uncommon to find yourself with a
		// Stream<Optional<T>> and to require a Stream<T> containing all the elements in
		// the nonempty optionals in order to proceed. If you’re using Java 8, here’s
		// how to bridge the gap:
		
		Stream.of(Optional.empty(), Optional.empty(), Optional.of(100)).filter(Optional::isPresent).map(Optional::get);
	}
}
