package chapter07.item45.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

//Iterative Cartesian product computation
public class Test03 {

	public static void main(String[] args) {

	}

	private static List<Card> newDeck() {
		List<Card> result = new ArrayList<>();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values())
				result.add(new Card(suit, rank));
		}

		return result;
	}

	// Stream-based Cartesian product computation
	private static List<Card> newDeckV2() {
		return Stream.of(Suit.values())
				.flatMap(suit -> Stream.of(Rank.values())
				.map(rank -> new Card(suit, rank)))
				.collect(toList());
	}
}
