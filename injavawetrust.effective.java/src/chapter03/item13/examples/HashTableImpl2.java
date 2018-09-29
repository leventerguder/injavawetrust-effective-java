package chapter03.item13.examples;

// Recursive clone method for class with complex mutable state
public class HashTableImpl2 implements Cloneable {

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

		// recursively copy the linked list headed by this Entry
		Entry deepCopy() {
			return new Entry(key, value, next == null ? null : next.deepCopy());
		}
	}

	@Override
	protected HashTableImpl2 clone() {
		try {
			HashTableImpl2 result = (HashTableImpl2) super.clone();
			result.buckets = new Entry[buckets.length];
			for (int i = 0; i < buckets.length; i++)
				result.buckets[i] = buckets[i].deepCopy();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	// The clone method allocates a new buckets array of the proper size and
	// iterates over the original buckets array
	// deep-copying each nonempty bucket.
	// The deepCopy method on Entry invokes itself recursively to copy entire linked
	// list headed by the entry.
	// This technique is cute and works fine if the buckets arent too long.
	// it the list is long , this could easily cause a stack overflow.
	// To prevent this from happening , you can replace the recursion in deepCopy with iteration.

}
