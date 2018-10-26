package chapter10.item69;

public class Item69Notes {

	// ####
	// Item 69: Use exceptions only for exceptional conditions

	// Because exceptions are designed for exceptional circumstances, there is
	// little incentive for JVM implementors to make them as fast as explicit tests.

	// Placing code inside a try-catch block inhibits certain optimizations that JVM
	// implementations might otherwise perform.

	// The standard idiom for looping through an array doesn’t necessarily result in
	// redundant checks. Many JVM implementations optimize them away.

	// The moral of this story is simple: Exceptions are, as their name implies, to
	// be used only for exceptional conditions; they should never be used for
	// ordinary control flow.

	// This principle also has implications for API design. A well-designed API must
	// not force its clients to use exceptions for ordinary control flow.

	// In summary, exceptions are designed for exceptional conditions. Don’t use
	// them for ordinary control flow, and don’t write APIs that force others to do
	// so.
}
