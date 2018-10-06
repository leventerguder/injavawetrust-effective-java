package chapter05.item28.examples;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;;

// List - based Chooser -typesafe 
public class ChooserV3<T> {

	private final List<T> choiceList;

	public ChooserV3(Collection<T> choices) {
		choiceList = new ArrayList<>(choices);
	}

	public T chose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceList.get(rnd.nextInt(choiceList.size()));
	}

}
