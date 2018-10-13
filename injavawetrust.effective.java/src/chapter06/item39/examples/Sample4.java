package chapter06.item39.examples;

import java.util.List;
import java.util.ArrayList;

public class Sample4 {

	/// Code containing a repeated annotation
	@ExceptionTestV3(IndexOutOfBoundsException.class)
	@ExceptionTestV3(NullPointerException.class)
	public static void doublyBad() {
		List<String> list = new ArrayList<>();
		// The spec permits this method to throw either
		// IndexOutOfBoundsException or NullPointerException
		list.addAll(5, null);
	}

}


// But isAnnotationPresent makes it explicit that
// repeated annotations are not of the annotation type, but of the containing
// annotation type