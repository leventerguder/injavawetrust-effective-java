package chapter04.item18.examples.forwarding;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Reusable forwarding class
public class ForwardingSet<E> implements Set<E> {

	private final Set<E> s;

	public ForwardingSet(Set<E> s) {
		super();
		this.s = s;
	}

	@Override
	public int size() {
		return s.size();
	}

	@Override
	public boolean isEmpty() {
		return s.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return s.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		return s.iterator();
	}

	@Override
	public Object[] toArray() {
		return s.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return s.toArray(a);
	}

	@Override
	public boolean add(E e) {
		return s.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return s.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return s.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return s.addAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return s.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return s.removeAll(c);
	}

	@Override
	public void clear() {
		s.clear();
	}

}
