package chapter07.item46.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.Comparator.comparing;

//Proper use of streams to initialize a frequency table
public class Test02 {

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

		Map<String, Long> freq;
		try (Stream<String> words = new Scanner(file).tokens()) {
			freq = words.collect(groupingBy(String::toLowerCase, counting()));

		}

		System.out.println(freq);

		// Pipeline to get a top-ten list of words from a frequency table
		List<String> topTen = freq.keySet().stream().sorted(comparing(freq::get).reversed()).limit(10)
				.collect(toList());

		System.out.println(topTen);

		
	}

}
