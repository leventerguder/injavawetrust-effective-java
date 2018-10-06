package chapter05.item26.examples;

import java.util.ArrayList;
import java.util.Collection;

public class Test02Generic {

	public static void main(String[] args) {

		final Collection<Stamp> stamps = new ArrayList<>();

		Stamp stamp1 = new Stamp();
		Stamp stamp2 = new Stamp();

		stamps.add(stamp1);
		stamps.add(stamp2);

		Coin coin1 = new Coin();
		//stamps.add(coin1); // Compile error
	}
}
