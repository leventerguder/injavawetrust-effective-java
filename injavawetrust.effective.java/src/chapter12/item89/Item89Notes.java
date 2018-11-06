package chapter12.item89;

public class Item89Notes {

	// #####
	// Item 89: For instance control, prefer enum types to readResolve

	// if you depend on readResolve for instance control, all instance fields with
	// object reference types must be declared transient.

	// Otherwise, it is possible for a determined attacker to secure a reference to
	// the deserialized object before its readResolve method is run, using a
	// technique that is somewhat similar to the MutablePeriod attack in Item 88.

	// The attack is a bit complicated, but the underlying idea is simple. If a
	// singleton contains a nontransient object reference field, the contents of
	// this field will be deserialized before the singleton’s readResolve method is
	// run.

	// The accessibility of readResolve is significant. If you place a readResolve
	// method on a final class, it should be private. If you place a readResolve
	// method on a nonfinal class, you must carefully consider its accessibility. If
	// it is private, it will not apply to any subclasses. If it is package-private,
	// it will apply only to subclasses in the same package. If it is protected or
	// public, it will apply to all subclasses that do not override it. If a
	// readResolve method is protected or public and a subclass does not override
	// it, deserializing a subclass instance will produce a superclass instance,
	// which is likely to cause a ClassCastException.

	// To summarize, use enum types to enforce instance control invariants wherever
	// possible. If this is not possible and you need a class to be both
	// serializable and instance-controlled, you must provide a readResolve method
	// and ensure that all of the class’s instance fields are either primitive or
	// transient.

}
