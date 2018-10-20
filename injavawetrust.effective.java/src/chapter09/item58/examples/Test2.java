package chapter09.item58.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

enum Suit {
	CLUB, DIAMOND, HEART, SPADE
}

enum Rank {
	ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

class Card {

	private Suit suit;
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

}

/*
 * The advantages of the for-each loop over the traditional for loop are even
 * greater when it comes to nested iteration. Here is a common mistake that
 * people make when doing nested iteration:
 */
public class Test2 {

	static Collection<Suit> suits = Arrays.asList(Suit.values());
	static Collection<Rank> ranks = Arrays.asList(Rank.values());

	public static void main(String[] args) {
		List<Card> deck = new ArrayList<>();
		for (Iterator<Suit> i = suits.iterator(); i.hasNext();)
			for (Iterator<Rank> j = ranks.iterator(); j.hasNext();)
				deck.add(new Card(i.next(), j.next()));

		/*
		 * The problem is that the next method is called too many times on the iterator
		 * for the outer collection (suits). It should be called from the outer loop so
		 * that it is called once per suit, but instead it is called from the inner
		 * loop, so it is called once per card. After you run out of suits, the loop
		 * throws a NoSuchElementException
		 */
	}
}
