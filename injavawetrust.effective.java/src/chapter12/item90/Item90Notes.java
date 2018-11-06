package chapter12.item90;

import java.util.EnumSet;

public class Item90Notes {

	// #####
	// Item 90: Consider serialization proxies instead of serialized instances

	// As mentioned in Items 85 and 86 and discussed throughout this chapter, the
	// decision to implement Serializable increases the likelihood of bugs and
	// security problems as it allows instances to be created using an
	// extralinguistic mechanism in place of ordinary constructors. There is,
	// however, a technique that greatly reduces these risks. This technique is
	// known as the serialization proxy pattern.

	// The serialization proxy pattern is reasonably straightforward. First, design
	// a private static nested class that concisely represents the logical state of
	// an instance of the enclosing class. This nested class is known as the
	// serialization proxy of the enclosing class. It should have a single
	// constructor, whose parameter type is the enclosing class. This constructor
	// merely copies the data from its argument: it need not do any consistency
	// checking or defensive copying. By design, the default serialized form of the
	// serialization proxy is the perfect serialized form of the enclosing class.
	// Both the enclosing class and its serialization proxy must be declared to
	// implement Serializable.

	// Like the defensive copying approach (page 357), the serialization proxy
	// approach stops the bogus byte-stream attack (page 354) and the internal field
	// theft attack (page 356) dead in their tracks. Unlike the two previous
	// approaches, this one allows the fields of Period to be final, which is
	// required in order for the Period class to be truly immutable (Item 17).
	//

	// Consider the case of EnumSet (Item 36). This class has no public
	// constructors, only static factories. From the client’s perspective, they
	// return EnumSet instances, but in the current OpenJDK implementation, they
	// return one of two subclasses, depending on the size of the underlying enum
	// type. If the underlying enum type has sixty-four or fewer elements, the
	// static factories return a RegularEnumSet; otherwise, they return a
	// JumboEnumSet.

	// EnumSet's serialization proxy
	// private static class SerializationProxy <E extends Enum<E>>
	// implements java.io.Serializable
	// {
	// /**
	// * The element type of this enum set.
	// *
	// * @serial
	// */
	// private final Class<E> elementType;
	//
	// /**
	// * The elements contained in this enum set.
	// *
	// * @serial
	// */
	// private final Enum[] elements;
	//
	// SerializationProxy(EnumSet<E> set) {
	// elementType = set.elementType;
	// elements = set.toArray(ZERO_LENGTH_ENUM_ARRAY);
	// }
	//
	// private Object readResolve() {
	// EnumSet<E> result = EnumSet.noneOf(elementType);
	// for (Enum e : elements)
	// result.add((E)e);
	// return result;
	// }
	//
	// private static final long serialVersionUID = 362491234563181265L;
	// }

	// The serialization proxy pattern has two limitations. It is not compatible
	// with classes that are extendable by their users (Item 19). Also, it is not
	// compatible with some classes whose object graphs contain circularities: if
	// you attempt to invoke a method on such an object from within its
	// serialization proxy’s readResolve method, you’ll get a ClassCastException
	// because you don’t have the object yet, only its serialization proxy.

	// Finally, the added power and safety of the serialization proxy pattern are
	// not free.
	// more expensive to serialize and deserialize Period instances with
	// serialization proxies than it is with defensive copying.

	// In summary, consider the serialization proxy pattern whenever you find
	// yourself having to write a readObject or writeObject method on a class that
	// is not extendable by its clients. This pattern is perhaps the easiest way to
	// robustly serialize objects with nontrivial invariants.
}
