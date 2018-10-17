package chapter07.item47.examples;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Returns a stream of all the sublists of its input list
public class SubLists {
	public static <E> Stream<List<E>> of(List<E> list) {
		return Stream.concat(Stream.of(Collections.emptyList()), prefixes(list).flatMap(SubLists::suffixes));
	}

	private static <E> Stream<List<E>> prefixes(List<E> list) {
		return IntStream.rangeClosed(1, list.size()).mapToObj(end -> list.subList(0, end));
	}

	private static <E> Stream<List<E>> suffixes(List<E> list) {
		return IntStream.range(0, list.size()).mapToObj(start -> list.subList(start, list.size()));
	}

	// Note that the Stream.concat method is used to add the empty list into the
	// returned stream. Also note that the flatMap method (Item 45) is used to
	// generate a single stream consisting of all the suffixes of all the prefixes.

	// Returns a stream of all the sublists of its input list
	public static <E> Stream<List<E>> ofV2(List<E> list) {
		return IntStream.range(0, list.size()).mapToObj(
				start -> IntStream.rangeClosed(start + 1, list.size()).mapToObj(end -> list.subList(start, end)))
				.flatMap(x -> x);
	}

}