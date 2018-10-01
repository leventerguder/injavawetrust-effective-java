package chapter04.item18.examples.forwarding;

import java.util.Collection;
import java.util.Set;

// The desing of the InstrumentedSet class is enabled by the existence of the Set interface,
// which captures the functionality of the HashSet class.
//
// Besides being robust , this design is extremely flexible.

// InstrumentedSet class is known as a wrapper class because each InstrumentedSet instance contains ("wraps") another Set instance.
// This is also known as the Decorator Pattern , because the InstrumentedSet class "decorates" a set by adding instrumentation.
//

public class InstrumentedSet<E> extends ForwardingSet<E> {

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
