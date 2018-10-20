package chapter09.item59;

public class Item59Notes {

	// Item 59 : Know and use the libraries

	/*
	 * By using a standard library, you take advantage of the knowledge of the
	 * experts who wrote it and the experience of those who used it before you.
	 */

	/*
	 * As of Java 7, you should no longer use Random. For most uses, the random
	 * number generator of choice is now ThreadLocalRandom.
	 */

	/*
	 * A second advantage of using the libraries is that you don’t have to waste
	 * your time writing ad hoc solutions to problems that are only marginally
	 * related to your work.
	 */

	/*
	 * A third advantage of using standard libraries is that their performance tends
	 * to improve over time, with no effort on your part.
	 */

	/*
	 * A fourth advantage of using libraries is that they tend to gain functionality
	 * over time. If a library is missing something, the developer community will
	 * make it known, and the missing functionality may get added in a subsequent
	 * release.
	 */

	/*
	 * A final advantage of using the standard libraries is that you place your code
	 * in the mainstream. Such code is more easily readable, maintainable, and
	 * reusable by the multitude of developers.
	 */

	/*
	 * Numerous features are added to the libraries in every major release, and it
	 * pays to keep abreast of these additions
	 */

	/*
	 * The libraries are too big to study all the documentation [Java9-api], but
	 * every programmer should be familiar with the basics of java.lang, java.util,
	 * and java.io, and their subpackages.
	 */

	/*
	 * Several libraries bear special mention. The collections framework and the
	 * streams library (Items 45–48) should be part of every programmer’s basic
	 * toolkit, as should parts of the concurrency utilities in java.util.concurrent
	 */

	/*
	 * If you can’t find what you need in Java platform libraries, your next choice
	 * should be to look in high-quality third-party libraries, such as Google’s
	 * excellent, open source Guava library
	 */

	/*
	 * To summarize, don’t reinvent the wheel. If you need to do something that
	 * seems like it should be reasonably common, there may already be a facility in
	 * the libraries that does what you want. If there is, use it; if you don’t
	 * know, check. Generally speaking, library code is likely to be better than
	 * code that you’d write yourself and is likely to improve over time. This is no
	 * reflection on your abilities as a programmer. Economies of scale dictate that
	 * library code receives far more attention than most developers could afford to
	 * devote to the same functionality.
	 */
}
