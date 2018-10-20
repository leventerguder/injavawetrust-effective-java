package chapter09.item57;

public class Item57Notes {

	// #####
	// Chapter 9 General Programming
	/*
	 * THIS chapter is devoted to the nuts and bolts of the language. It discusses
	 * local variables, control structures, libraries, data types, and two
	 * extralinguistic facilities: reflection and native methods. Finally, it
	 * discusses optimization and naming conventions.
	 */

	// #####
	// Item 57 : Minimize the scope of local variables
	/*
	 * This item is similar in nature to Item 15, “Minimize the accessibility of
	 * classes and members.” By minimizing the scope of local variables, you
	 * increase the readability and maintainability of your code and reduce the
	 * likelihood of error.
	 */

	/*
	 * The most powerful technique for minimizing the scope of a local variable is
	 * to declare it where it is first used.
	 */

	/*
	 * If a variable is declared before it is used, it’s just clutter—
	 */

	/*
	 * Nearly every local variable declaration should contain an initializer.
	 */

	/*
	 * If you don’t yet have enough information to initialize a variable sensibly,
	 * you should postpone the declaration until you do. One exception to this rule
	 * concerns try-catch statements.
	 */

	/*
	 * Loops present a special opportunity to minimize the scope of variables. The
	 * for loop, in both its traditional and for-each forms, allows you to declare
	 * loop variables, limiting their scope to the exact region where they’re
	 * needed.
	 * 
	 * Therefore, prefer for loops to while loops, assuming the contents of the loop
	 * variable aren’t needed after the loop terminates.
	 */

	/*
	 * The for loop has one more advantage over the while loop: it is shorter, which
	 * enhances readability.
	 */
	
	/*
	 * A final technique to minimize the scope of local variables is to keep methods
	 * small and focused. If you combine two activities in the same method, local
	 * variables relevant to one activity may be in the scope of the code performing
	 * the other activity. To prevent this from happening, simply separate the
	 * method into two: one for each activity.
	 */

}
