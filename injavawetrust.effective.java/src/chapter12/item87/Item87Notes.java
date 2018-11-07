package chapter12.item87;

public class Item87Notes {

	// #####
	// Item 87: Consider using a custom serialized form

	/*
	 * if the class implements Serializable and uses the default serialized form,
	 * you’ll never be able to escape completely from the throwaway implementation.
	 * It will dictate the serialized form forever. This is not just a theoretical
	 * problem. It happened to several classes in the Java libraries, including
	 * BigInteger
	 */

	// ## Do not accept the default serialized form without first considering
	// whether it is appropriate.
	// Generally speaking, you should accept the default serialized form only if it
	// is largely identical to the encoding that you would choose if you were
	// designing a custom serialized form.

	// Accepting the default serialized form should be a conscious decision that
	// this encoding is reasonable from the standpoint of flexibility, performance,
	// and correctness.

	// ## The default serialized form is likely to be appropriate if an object’s
	// physical representation is identical to its logical content.

	// ## Even if you decide that the default serialized form is appropriate, you
	// often must provide a readObject method to ensure invariants and security.

	// ## Using the default serialized form when an object’s physical representation
	// differs substantially from its logical data content has four disadvantages:

	// - It permanently ties the exported API to the current internal
	// representation.
	// - It can consume excessive space.
	/*
	 * the serialized form(StringList.java) unnecessarily represents each entry in
	 * the linked list and all the links. These entries and links are mere
	 * implementation details, not worthy of inclusion in the serialized form.
	 * Because the serialized form is excessively large, writing it to disk or
	 * sending it across the network will be excessively slow.
	 */
	// - It can consume excessive time
	/*
	 * The serialization logic has no knowledge of the topology of the object graph,
	 * so it must go through an expensive graph traversal. In the example
	 * (StringList.java), it would be sufficient simply to follow the next
	 * references.
	 */
	// - It can cause stack overflows.

	// accepting the default serialized form for a hash table would constitute a
	// serious bug. Serializing and deserializing the hash table could yield an
	// object whose invariants were seriously corrupt.

	// Whether or not you accept the default serialized form, every instance field
	// that isn’t labeled transient will be serialized when the defaultWriteObject
	// method is invoked.

	// ## Before deciding to make a field nontransient, convince yourself that its
	// value is part of the logical state of the object.
	// If you use a custom serialized form, most or all of the instance fields
	// should be labeled transient, as in the StringListV2.java

	// If you are using the default serialized form and you have labeled one or more
	// fields transient, remember that these fields will be initialized to their
	// default values when an instance is deserialized: null for object reference
	// fields, zero for numeric primitive fields, and false for boolean fields [JLS,
	// 4.12.5].

	// If you put synchronization in the writeObject method, you must ensure that it
	// adheres to the same lock-ordering constraints as other activities, or you
	// risk a resource-ordering deadlock [Goetz06, 10.1.5].

	/*
	 * If these values are unacceptable for any transient fields, you must provide a
	 * readObject method that invokes the defaultReadObject method and then restores
	 * transient fields to acceptable values (Item 88).
	 */

	/*
	 * ### Whether or not you use the default serialized form, you must impose any
	 * synchronization on object serialization that you would impose on any other
	 * method that reads the entire state of the object
	 */

	/*
	 * if you have a thread-safe object (Item 82) that achieves its thread safety by
	 * synchronizing every method and you elect to use the default serialized form,
	 * use the following write-Object method
	 */

	// Regardless of what serialized form you choose, declare an explicit serial
	// version UID in every serializable class you write. This eliminates the serial
	// version UID as a potential source of incompatibility (Item 86). There is also
	// a small performance benefit. If no serial version UID is provided, an
	// expensive computation is performed to generate one at runtime.

	// If you ever want to make a new version of a class that is incompatible with
	// existing versions, merely change the value in the serial version UID
	// declaration. This will cause attempts to deserialize serialized instances of
	// previous versions to throw an InvalidClassException. Do not change the serial
	// version UID unless you want to break compatibility with all existing
	// serialized instances of a class.

	// To summarize, if you have decided that a class should be serializable (Item
	// 86), think hard about what the serialized form should be. Use the default
	// serialized form only if it is a reasonable description of the logical state
	// of the object; otherwise design a custom serialized form that aptly describes
	// the object. You should allocate as much time to designing the serialized form
	// of a class as you allocate to designing an exported method (Item 51). Just as
	// you can’t eliminate exported methods from future versions, you can’t
	// eliminate fields from the serialized form; they must be preserved forever to
	// ensure serialization compatibility. Choosing the wrong serialized form can
	// have a permanent, negative impact on the complexity and performance of a
	// class.
}
