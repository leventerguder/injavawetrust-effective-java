package chapter02.item05.examples;

// Inappropriate use of static utility - inflexible & untestable
public class SpellChecker {

	private static final Lexicon dictionary = new Lexicon();

	private SpellChecker() {
	}
	// noninstantiable

	public static boolean isValid(String word) {
		//
		//
		return true;
	}

}

class Lexicon {

}

// Inappropriate use of singleton - inflexible & untestable
class SpellChecker2 {

	private final Lexicon dictionary = new Lexicon();

	public static SpellChecker2 INSTANCE = new SpellChecker2();

	private SpellChecker2() {
	}

	public static boolean isValid(String word) {
		//
		//
		return true;
	}
}