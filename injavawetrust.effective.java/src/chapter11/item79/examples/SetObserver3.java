package chapter11.item79.examples;

@FunctionalInterface
public interface SetObserver3<E> { 
	
	void added(ObservableSet3<E> set, E element);
}