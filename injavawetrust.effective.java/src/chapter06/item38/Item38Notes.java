package chapter06.item38;

public class Item38Notes {

	// #### Item 38: Emulate extensible enums with interfaces

	// there is at least one compelling use case for extensible enumerated types,
	// which is operation codes, also known as opcodes.

	// An opcode is an enumerated type whose elements represent operations on some
	// machine, such as the Operation type in Item 34, which represents the
	// functions on a simple calculator

	// The basic idea is to take advantage of the fact that enum types can implement
	// arbitrary interfaces by defining an interface for the opcode type and an enum
	// that is the standard implementation of the interface.

	// A minor disadvantage of the use of interfaces to emulate extensible enums is
	// that implementations cannot be inherited from one enum type to another.

	// The pattern described in this item is used in the Java libraries. For
	// example, the java.nio.file.LinkOption enum type implements the CopyOption and
	// OpenOption interfaces.

	// In summary, while you cannot write an extensible enum type, you can emulate
	// it by writing an interface to accompany a basic enum type that implements the
	// interface. This allows clients to write their own enums (or other types) that
	// implement the interface. Instances of these types can then be used wherever
	// instances of the basic enum type can be used, assuming APIs are written in
	// terms of the interface.
}
