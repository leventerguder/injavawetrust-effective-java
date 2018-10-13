package chapter06.item39.examples;

import java.util.List;
import java.util.ArrayList;

public class Sample3 {

	// Code containing an annotation with an array parameter
	@ExceptionTestV2({ IndexOutOfBoundsException.class, NullPointerException.class })
	public static void doublyBad() {
		List<String> list = new ArrayList<>();
		// The spec permits this method to throw either
		// IndexOutOfBoundsException or NullPointerException
		list.addAll(5, null);
	}

}
