package chapter05.item33.examples;

public class Test01 {

	public static void main(String[] args) {
		Favorites f = new Favorites();
		f.putFavorite(String.class, "Java");
		f.putFavorite(Integer.class, 0xcafebabe);
		f.putFavorite(Class.class, Favorites.class);
		String favoriteString = f.getFavorite(String.class);
		int favoriteInteger = f.getFavorite(Integer.class);
		Class<?> favoriteClass = f.getFavorite(Class.class);
		//
		System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());

		// A Favorites instance is typesafe: it will never return an Integer when you
		// ask it for a String.

		// It is also heterogeneous: unlike an ordinary map, all the keys are of
		// different types. Therefore, we call Favorites a typesafe heterogeneous
		// container.
	}
}
