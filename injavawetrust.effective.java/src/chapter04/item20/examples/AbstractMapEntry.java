package chapter04.item20.examples;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public abstract class AbstractMapEntry<K, V> implements Entry<K, V> {

	@Override
	public V setValue(V value) {
		throw new UnsupportedOperationException();
	}

	// Implements the general contract of Map.Entry.equals
	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Map.Entry))
			return false;
		Map.Entry<?, ?> e = (Map.Entry) o;
		return Objects.equals(e.getKey(), getKey()) && Objects.equals(e.getValue(), getValue());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
	}

	@Override
	public String toString() {
		return getKey() + "=" + getValue();
	}
}
