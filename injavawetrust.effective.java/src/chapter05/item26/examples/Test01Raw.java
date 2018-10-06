package chapter05.item26.examples;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class Test01Raw {

	public static void main(String[] args) {

		final Collection stamps = new ArrayList();

		Stamp stamp1 = new Stamp();
		Stamp stamp2 = new Stamp();

		stamps.add(stamp1);
		stamps.add(stamp2);

		// Erroneus insertion of coin into stam collection

		Coin coin1 = new Coin();
		stamps.add(coin1);

		// Raw iterator type - dont do this!

		for (Iterator i = stamps.iterator(); i.hasNext();) {
			Stamp stamp = (Stamp) i.next(); // Throws java.lang.ClassCastException:
			stamp.cancel();
		}
	}
}
