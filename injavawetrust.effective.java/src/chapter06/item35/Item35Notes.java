package chapter06.item35;

public class Item35Notes {

	// ##### Item 35 : Use instance fields instead of ordinals
	//
	// Many enums are naturally associated with a single int value. All enums
	// have an ordinal method, which returns the numerical position of each
	// enum constant in its type. You may be tempted to derive an associated int
	// value from the ordinal:

	// Never derive a value associated with an enum from its ordinal; store it in an
	// instance field instead:

	// The Enum specification has this to say about ordinal: “Most
	// programmers will have no use for this method. It is designed for use by
	// general-purpose enum-based data structures such as EnumSet and
	// EnumMap.” Unless you are writing code with this character, you are best off
	// avoiding the ordinal method entirely.
}
