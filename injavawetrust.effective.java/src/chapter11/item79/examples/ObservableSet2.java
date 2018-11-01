package chapter11.item79.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.List;

public class ObservableSet2<E> extends ForwardingSet<E> {

	public ObservableSet2(Set<E> set) {
		super(set);
	}

	private final List<SetObserver2<E>> observers = new ArrayList<>();

	public void addObserver(SetObserver2<E> observer) {
		synchronized (observers) {
			observers.add(observer);
		}
	}

	public boolean removeObserver(SetObserver2<E> observer) {
		synchronized (observers) {
			return observers.remove(observer);
		}
	}

//	private void notifyElementAdded(E element) {
//		synchronized (observers) {
//			for (SetObserver2<E> observer : observers)
//				observer.added(this, element);
//		}
//	}

	// Alien method moved outside of synchronized block - open calls
	// with this change, both of the previous examples run without exception or
	// deadlock (Test3.java)
	private void notifyElementAdded(E element) {
		List<SetObserver2<E>> snapshot = null;
		synchronized (observers) {
			snapshot = new ArrayList<>(observers);
		}
		for (SetObserver2<E> observer : snapshot)
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
