package chapter12.item88;

public class Item88Notes {

	// #####
	// Item 88: Write readObject methods defensively

	// Item 50 contains an immutable date-range class with mutable private Date
	// fields. The class goes to great lengths to preserve its invariants and
	// immutability by defensively copying Date objects in its constructor and
	// accessors.

	// When an object is deserialized, it is critical to defensively copy any field
	// containing an object reference that a client must not possess

	// Therefore, every serializable immutable class containing private mutable
	// components must defensively copy these components in its readObject method.

	// There is one other similarity between readObject methods and constructors
	// that applies to nonfinal serializable classes. Like a constructor, a
	// readObject method must not invoke an overridable method, either directly or
	// indirectly (Item 19).

	// To summarize, anytime you write a readObject method, adopt the mind-set that
	// you are writing a public constructor that must produce a valid instance
	// regardless of what byte stream it is given. Do not assume that the byte
	// stream represents an actual serialized instance. While the examples in this
	// item concern a class that uses the default serialized form, all of the issues
	// that were raised apply equally to classes with custom serialized forms. Here,
	// in summary form, are the guidelines for writing a readObject method:

	// - For classes with object reference fields that must remain private,
	// defensively copy each object in such a field. Mutable components of immutable
	// classes fall into this category.

	// - Check any invariants and throw an InvalidObjectException if a check fails.
	// The checks should follow any defensive copying.

	// - If an entire object graph must be validated after it is deserialized, use
	// the ObjectInputValidation interface

	// - Do not invoke any overridable methods in the class, directly or indirectly.
}
