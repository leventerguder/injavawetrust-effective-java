package chapter07.item46.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import java.util.Scanner;

public class Test01 {

	// // Uses the streams API but not the paradigm--Don't do this!
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("test.txt");
		pw.println("e1");
		pw.println("e1");
		pw.println("e2");
		pw.println("e2");
		pw.println("e2");
		pw.println("e3");
		pw.println("e4");
		pw.close();
		
		File file = new File("test.txt");
		
		Map<String, Long> freq = new HashMap<>();
		try (Stream<String> words = new Scanner(file).tokens()) {
			words.forEach(word -> {
				freq.merge(word.toLowerCase(), 1L, Long::sum);
			});
		}
		
		System.out.println(freq);
	}
}
