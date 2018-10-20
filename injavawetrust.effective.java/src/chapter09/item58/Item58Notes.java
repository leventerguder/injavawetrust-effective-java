package chapter09.item58;

public class Item58Notes {

	// #####
	// Item 58 : Prefer for-each loops to traditional for loops

	/*
	 * As discussed in Item 45, some tasks are best accomplished with streams,
	 * others with iteration.
	 */

	/*
	 * The for-each loop (officially known as the “enhanced for statement”) solves
	 * all of these problems. It gets rid of the clutter and the opportunity for
	 * error by hiding the iterator or index variable
	 */

	/*
	 * There is no performance penalty for using foreach loops, even for arrays:
	 */

	/*
	 * Unfortunately, there are three common situations where you can’t use foreach:
	 */

	/*
	 * Destructive filtering : If you need to traverse a collection removing
	 * selected elements, then you need to use an explicit iterator so that you can
	 * call its remove method. You can often avoid explicit traversal by using
	 * Collection’s removeIf method, added in Java 8.
	 */

	/*
	 * Transforming : If you need to traverse a list or array and replace some or
	 * all of the values of its elements, then you need the list iterator or array
	 * index in order to replace the value of an element.
	 */

	/*
	 * Parallel iteration : If you need to traverse multiple collections in
	 * parallel, then you need explicit control over the iterator or index variable
	 * so that all iterators or index variables can be advanced in lockstep (as
	 * demonstrated unintentionally in the buggy card and dice examples above).
	 */

	// If you find yourself in any of these situations, use an ordinary for loop and
	// be wary of the traps mentioned in this item.

	/*
	 * In summary, the for-each loop provides compelling advantages over the
	 * traditional for loop in clarity, flexibility, and bug prevention, with no
	 * performance penalty. Use for-each loops in preference to for loops wherever
	 * you can.
	 */
}
