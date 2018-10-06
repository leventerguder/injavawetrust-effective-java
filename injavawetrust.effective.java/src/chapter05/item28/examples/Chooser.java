package chapter05.item28.examples;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Chooser - a class badly in need of generics!
public class Chooser {

	private final Object[] choiceArray;

	public Chooser(Collection choices) {
		choiceArray = choices.toArray();
	}
	
	public Object choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceArray[rnd.nextInt(choiceArray.length)];
	}
}
