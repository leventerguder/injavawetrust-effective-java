package chapter11.item79.examples;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class ObservableSet3<E> extends ForwardingSet<E> {

	public ObservableSet3(Set<E> set) {
		super(set);
	}

	// In fact, there’s a better way to move the alien method invocations out of the
	// synchronized block. The libraries provide a concurrent collection (Item 81)
	// known as CopyOnWriteArrayList that is tailor-made for this purpose.

	// private final List<SetObserver3<E>> observers = new ArrayList<>();

	// Thread-safe observable set with CopyOnWriteArrayList
	private final List<SetObserver3<E>> observers = new CopyOnWriteArrayList<>();

	public void addObserver(SetObserver3<E> observer) {
		observers.add(observer);
	}

	public boolean removeObserver(SetObserver3<E> observer) {
		return observers.remove(observer);
	}

	private void notifyElementAdded(E element) {
		for (SetObserver3<E> observer : observers)
			observer.added(this, element);
	}

	@Override
	public boolean add(E element) {
		boolean added = super.add(element);
		if (added)
			notifyElementAdded(element);
		return added;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean result = false;
		for (E element : c)
			result |= add(element); // Calls notifyElementAdded
		return result;
	}

}
