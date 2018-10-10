package chapter05.item31.examples;

import java.util.Collection;

public class StackV2<E> {

	// PECS stands for producer-extends, consumer-super.

	// pushAll’s src parameter produces E instances for use by the Stack, so the
	// appropriate type for src is Iterable<? extends E>;
	public void pushAll(Iterable<? extends E> src) {

	}

	// popAll’s dst parameter consumes E instances from the Stack, so the
	// appropriate type for dst is Collection<? super E>.
	public void popAll(Collection<? super E> dst) {
	}
}
