package chapter03.item13.examples;

public class HashTableImpl implements Cloneable {

	private Entry[] buckets;

	private static class Entry {
		final Object key;
		Object value;
		Entry next;

		public Entry(Object key, Object value, Entry next) {
			super();
			this.key = key;
			this.value = value;
			this.next = next;
		}

	}

	// Broken clone method - results in shared mutable state!
	// the clone has its own bucket array , this array references the same linked lists as the original,
	// which can easily cause nondeterministic behavior in both the clone and the original.
	// to fix problem you will have to copy the linked list that comprises each bucket.
	@Override
	protected HashTableImpl clone() {
		try {
			HashTableImpl result = (HashTableImpl) super.clone();
			result.buckets = buckets.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

}
