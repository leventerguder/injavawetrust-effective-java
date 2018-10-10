package chapter05.item33.examples;

import java.util.HashMap;
import java.util.Map;

public class FavoritesV2 {

	private Map<Class<?>, Object> favorites = new HashMap<>();

	// Achieving runtime type safety with a dynamic cast
	public <T> void putFavorite(Class<T> type, T instance) {
		favorites.put(type, type.cast(instance));
	}

	public <T> T getFavorite(Class<T> type) {
		// The cast method is the dynamic analogue of Java’s cast operator.
		return type.cast(favorites.get(type));

	}

	// The type tokens used by Favorites are unbounded: getFavorite and put-Favorite
	// accept any Class object. Sometimes you may need to limit the types that can
	// be passed to a method. This can be achieved with a bounded type token, which=
	// is simply a type token that places a bound on what type can be represented,
	// using a bounded type parameter (Item 30) or a bounded wildcard (Item 31).
}
