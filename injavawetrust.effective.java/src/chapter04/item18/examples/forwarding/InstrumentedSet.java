package chapter04.item18.examples.forwarding;

import java.util.Collection;
import java.util.Set;

public class InstrumentedSet<E> extends ForwardingSet<E> {

	// The design of the InstrumentedSet class is enabled by the existence of the
	// Set interface , which captures the functionality of the HashSet class.
	// Besides being robust , this design is extremely flexible.
	// In essence , the class transforms one Set into another, adding the
	// instumentation functionality.

	// InstrumentedSet class is known as a wrapper class because each
	// InstrumentedSet instance contains ("wraps") another Set instance.
	// TODO
	// This is also known as the Decorator Pattern , because the InstrumentedSet
	// class "decorates" a set by adding instrumentation.
	//
	// The disadvantages of wrapper classes are fer.
	// One caveat is that wrapper calsses are not suited for use in callback
	// frameworks , wherein objects pass self-references to other objects for
	// subsequent invocations("callbacks")
	// Because a wrapped object doesnt know of its wrapper it passes a reference to
	// itself(this)
	// and callbacks elude the wrapper. This is known as the SELF problem.

	// It's tedious to write forwarding methods , but you ave to write the reusable
	// forwarding class for each interface only once , and forwarding classs may be
	// provided for you.
	
	
	private int addCount = 0;

	public InstrumentedSet(Set<E> s) {
		super(s);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}
}
