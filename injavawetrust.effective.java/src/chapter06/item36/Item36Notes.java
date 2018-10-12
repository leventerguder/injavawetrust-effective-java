package chapter06.item36;

public class Item36Notes {

	// ##### Item 36 : Use EnumSet instead of bit fields.

	// If the elements of an enumerated type are used primarily in sets, it is
	// traditional to use the int enum pattern (Item 34), assigning a different
	// power of 2 to each constant

	// The bit field representation also lets you perform set operations such as
	// union and intersection efficiently using bitwise arithmetic. But bit fields
	// have all the disadvantages of int enum constants and more

	// The java.util package provides the EnumSet class to efficiently represent
	// sets of values drawn from a single enum type.

	// This class implements the Set interface, providing all of the richness, type
	// safety, and interoperability you get with any other Set implementation.

	// each EnumSet is represented as a bit vector.

	// In summary, just because an enumerated type will be used in sets, there is no
	// reason to represent it with bit fields.
}
