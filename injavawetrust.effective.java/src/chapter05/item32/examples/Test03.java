package chapter05.item32.examples;

import java.util.List;
import java.util.ArrayList;

public class Test03 {

	// Safe method with a generic varargs parameter
	@SafeVarargs
	static <T> List<T> flatten(List<? extends T>... lists) {
		List<T> result = new ArrayList<>();
		for (List<? extends T> list : lists)
			result.addAll(list);
		return result;
	}
}
