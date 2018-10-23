package chapter09.item63;

public class Item63Notes {

	// #####
	// Item 63 : Beware the performance of string concatenation

	// The string concatenation operator (+) is a convenient way to combine a few
	// strings into one.

	/*
	 * Using the string concatenation operator repeatedly to concatenate n strings
	 * requires time quadratic in n. This is an unfortunate consequence of the fact
	 * that strings are immutable (Item 17). When two strings are concatenated, the
	 * contents of both are copied.
	 */

	/*
	 * To achieve acceptable performance, use a StringBuilder in place of a String
	 * to store the statement under construction
	 */

	/*
	 * The moral is simple: Don’t use the string concatenation operator to combine
	 * more than a few strings unless performance is irrelevant. Use StringBuilder’s
	 * append method instead. Alternatively, use a character array, or process the
	 * strings one at a time instead of combining them.
	 */
}
