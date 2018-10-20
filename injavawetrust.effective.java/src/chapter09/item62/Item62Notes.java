package chapter09.item62;

public class Item62Notes {

	// #####
	// Item 62: Avoid strings where other types are more appropriate

	/*
	 * Strings are designed to represent text, and they do a fine job of it. Because
	 * strings are so common and so well supported by the language, there is a
	 * natural tendency to use strings for purposes other than those for which they
	 * were designed. This item discusses a few things that you shouldn’t do with
	 * strings.
	 */

	// ####
	// Strings are poor substitutes for other value types.
	// Strings are poor substitutes for enum types.
	// Strings are poor substitutes for aggregate types.
	// Strings are poor substitutes for capabilities.

	/*
	 * To summarize, avoid the natural tendency to represent objects as strings when
	 * better data types exist or can be written. Used inappropriately, strings are
	 * more cumbersome, less flexible, slower, and more error-prone than other
	 * types. Types for which strings are commonly misused include primitive types,
	 * enums, and aggregate types.
	 */
}
