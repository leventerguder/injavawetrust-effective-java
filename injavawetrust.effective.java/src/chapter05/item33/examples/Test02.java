package chapter05.item33.examples;

import java.util.Arrays;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		// The second limitation of the Favorites class is that it cannot be used on a
		// non-reifiable type (Item 28).

		// In other words, you can store your favorite
		// String or String[], but not your favorite List<String>. 
		
		// If you try to store  your favorite List<String>, your program won’t compile. 
		// The reason is that you can’t get a Class object for List<String>. 
		
		// The class literal  List<String>.class is a syntax error, and it’s a good thing, too.
		// List<String> and List<Integer> share a single Class object, which is List.class. 
		// It would wreak havoc with the internals of a Favorites object if
		// the "type literals List<String>.class and List<Integer>.class were legal and
		// returned the same object reference. There is no entirely satisfactory
		// workaround for this limitation.

		FavoritesV2 f = new FavoritesV2();
		f.putFavorite(String.class, "Java");
		f.putFavorite(String[].class, new String[] { "key1", "key2" });
		//f.putFavorite(List<String>.class, Arrays.asList("key1","key2")); //compile error

		f.putFavorite(List.class, Arrays.asList("key1","key2"));
	}
}
