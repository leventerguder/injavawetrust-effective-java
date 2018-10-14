package chapter07.item46.examples;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.maxBy;
import static java.util.Comparator.comparing;

public class Test04 {

	public static void main(String[] args) {

		Stream<Album> albums = Stream.of();

		Map<Artist, Album> topHits = albums.collect(toMap(Album::getArtist, Function.identity()));
	}
}
