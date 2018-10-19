package chapter08.item54;

public class Item54Notes {

	// #####
	// Item 54: Return empty collections or arrays, not nulls

	// Returns null to indicate an empty collection. Don't do this!

	// In the unlikely event that you have evidence suggesting that allocating empty
	// collections is harming performance, you can avoid the allocations by
	// returning the same immutable empty collection repeatedly, as immutable
	// objects may be shared freely (Item 17).

	/*
	 * Here is the code to do it, using the Collections.emptyList method. If you
	 * were returning a set, you’d use Collections.emptySet; if you were returning a
	 * map, you’d use Collections.emptyMap.
	 */

	// The situation for arrays is identical to that for collections. Never return
	// null instead of a zero-length array. Normally, you should simply return an
	// array of the correct length, which may be zero.

	// Don’t do this - preallocating the array harms performance!

	// In summary, never return null in place of an empty array or collection. It
	// makes your API more difficult to use and more prone to error, and it has no
	// performance advantages.
}
