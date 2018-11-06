package chapter12.item89.examples;

import java.util.*;



//Broken singleton - has nontransient object reference field!

public enum Elvis {
	INSTANCE;
	private String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };

	public void printFavorites() {
		System.out.println(Arrays.toString(favoriteSongs));
	}

	// As noted in Item 3, this class would no longer be a singleton if the words
	// implements Serializable were added to its declaration. It doesn’t matter
	// whether the class uses the default serialized form or a custom serialized
	// form (Item 87), nor does it matter whether the class provides an explicit
	// readObject method (Item 88). Any readObject method, whether explicit or
	// default, returns a newly created instance, which will not be the same
	// instance that was created at class initialization time.

	// If the Elvis class is made to implement Serializable, the following
	// read-Resolve method suffices to guarantee the singleton property:

	// readResolve for instance control - you can do better!
	private Object readResolve() {
		// Return the one true Elvis and let the garbage collector
		// take care of the Elvis impersonator.
		return INSTANCE;
	}
}