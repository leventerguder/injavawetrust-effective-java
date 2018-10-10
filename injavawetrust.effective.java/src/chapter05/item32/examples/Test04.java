package chapter05.item32.examples;

import java.util.List;
import java.util.ArrayList;

public class Test04 {

	// An alternative to using the SafeVarargs annotation is to take the advice of
	// Item 28 and replace the varargs parameter (which is an array in disguise)
	// with a List parameter.

	// List as a typesafe alternative to a generic varargs parameter
	static <T> List<T> flatten(List<List<? extends T>> lists) {
		List<T> result = new ArrayList<>();
		for (List<? extends T> list : lists)
			result.addAll(list);
		return result;
	}

	// The advantage of this approach is that the compiler can prove that the method
	// is typesafe.
	// You don’t have to vouch for its safety with a SafeVarargs annotation, and you
	// don’t have worry that you might have erred in determining that it was safe.

	// The main disadvantage is that the client code is a bit more verbose and may
	// be a bit slower.
	
	
}
