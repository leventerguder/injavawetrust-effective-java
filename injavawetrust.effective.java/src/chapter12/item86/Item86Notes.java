package chapter12.item86;

public class Item86Notes {

	// #####
	// Item 86: Implement Serializable with great caution

	// ## A major cost of implementing Serializable is that it decreases the
	// flexibility to change a class’s implementation once it has been released.

	// When a class implements Serializable, its byte-stream encoding (or serialized
	// form) becomes part of its exported API.
	// Once you distribute a class widely, you are generally required to support the
	// serialized form forever, just as you are required to support all other parts
	// of the exported API.

	// A simple example of the constraints on evolution imposed by serializability
	// concerns stream unique identifiers, more commonly known as serial version
	// UIDs. Every serializable class has a unique identification number associated
	// with it. If you do not specify this number by declaring a static final long
	// field named serialVersionUID, the system automatically generates it at
	// runtime by applying a cryptographic hash function (SHA-1) to the structure of
	// the class.

	// ## A second cost of implementing Serializable is that it increases the
	// likelihood of bugs and security holes (Item 85).
	// Normally, objects are created with constructors; serialization is an
	// extralinguistic mechanism for creating objects
	// Relying on the default deserialization mechanism can easily leave objects
	// open to invariant corruption and illegal access (Item 88).

	// ## A third cost of implementing Serializable is that it increases the testing
	// burden associated with releasing a new version of a class.

	// When a serializable class is revised, it is important to check that it is
	// possible to serialize an instance in the new release and deserialize it in
	// old releases, and vice versa.

	// ## Implementing Serializable is not a decision to be undertaken lightly.

	// ## Classes designed for inheritance (Item 19) should rarely implement
	// Serializable, and interfaces should rarely extend it.

	// Violating this rule places a substantial burden on anyone who extends the
	// class or implements the interface. There are times when it is appropriate to
	// violate the rule.

	// If you implement a class with instance fields that is both serializable and
	// extendable, there are several risks to be aware of. If there are any
	// invariants on the instance field values, it is critical to prevent subclasses
	// from overriding the finalize method, which the class can do by overriding
	// finalize and declaring it final. Otherwise, the class will be susceptible to
	// finalizer attacks (Item 8).

	// ## Inner classes (Item 24) should not implement Serializable.

	// To summarize, the ease of implementing Serializable is specious. Unless a
	// class is to be used only in a protected environment where versions will never
	// have to interoperate and servers will never be exposed to untrusted data,
	// implementing Serializable is a serious commitment that should be made with
	// great care. Extra caution is warranted if a class permits inheritance.
}
