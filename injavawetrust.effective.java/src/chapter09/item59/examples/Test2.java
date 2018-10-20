package chapter09.item59.examples;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Test2 {

	// Printing the contents of a URL with transferTo, added in Java 9
	public static void main(String[] args) throws MalformedURLException, IOException {

		try (InputStream in = new URL("http://www.injavawetrust.com/").openStream()) {
			in.transferTo(System.out);
		}

	}
}
