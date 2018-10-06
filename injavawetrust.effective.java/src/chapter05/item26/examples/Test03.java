package chapter05.item26.examples;

import java.util.List;
import java.util.ArrayList;

public class Test03 {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>();
		unsafeAdd(strings, Integer.valueOf(42));

		String s = strings.get(0);
	}

	// This program compiles , but because it uses the raw type List , you get a
	// warning
	// If you run the program you get a ClassCastException when the program tries to
	// cast the result of the invocation strings.get(0)
	// which is a Integer to a String
	public static void unsafeAdd(List list, Object o) {
		list.add(o);
	}
	
	public static void safeAdd(List<String> list, String o) {
		list.add(o);
	}
}
