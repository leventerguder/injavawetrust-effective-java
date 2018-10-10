package chapter05.item33.examples;

import java.util.Map;
import java.util.Objects;
import java.util.HashMap;

// Typesafe heterogeneous container pattern - API
public class Favorites {

	// You might think that you couldn’t put anything into this Map because of the
	// unbounded wildcard type, but the truth is quite the opposite. The thing to
	// notice is that the wildcard type is nested: it’s not the type of the map
	// that’s a wildcard type but the type of its key. This means that every key can
	// have a different parameterized type: one can be Class<String>, the next
	// Class<Integer>, and so on.
	// That’s where the heterogeneity comes from.

	private Map<Class<?>, Object> favorites = new HashMap<>();

	public <T> void putFavorite(Class<T> type, T instance) {
		favorites.put(Objects.requireNonNull(type), instance);
	}

	public <T> T getFavorite(Class<T> type) {
		// The cast method is the dynamic analogue of Java’s cast operator.
		return type.cast(favorites.get(type));

	}
}
