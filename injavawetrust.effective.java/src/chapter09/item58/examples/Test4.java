package chapter09.item58.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

enum FaceV2 {
	ONE, TWO, THREE, FOUR, FIVE, SIX
}

//Same bug, different symptom!
public class Test4 {

	static Collection<Suit> suits = Arrays.asList(Suit.values());
	static Collection<Rank> ranks = Arrays.asList(Rank.values());

	public static void main(String[] args) {

		// Fixed, but ugly - you can do better!
		List<Card> deck = new ArrayList<>();
		for (Iterator<Suit> i = suits.iterator(); i.hasNext();) {
			Suit suit = i.next();
			for (Iterator<Rank> j = ranks.iterator(); j.hasNext();)
				deck.add(new Card(suit, j.next()));
		}

		// Preferred idiom for nested iteration on collections and arrays
		for (Suit suit : suits)
			for (Rank rank : ranks)
				deck.add(new Card(suit, rank));

	}

}
