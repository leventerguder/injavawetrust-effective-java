package chapter11.item79.examples;

@FunctionalInterface
public interface SetObserver2<E> { 
	
	void added(ObservableSet2<E> set, E element);
}