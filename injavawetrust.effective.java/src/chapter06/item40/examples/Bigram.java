package chapter06.item40.examples;

import java.util.Set;
import java.util.HashSet;

// Can you spot the bug ?
public class Bigram {
	private final char first;
	private final char second;

	public Bigram(char first, char second) {
		this.first = first;
		this.second = second;
	}

	public boolean equals(Bigram b) {
		return b.first == first && b.second == second;
	}

	public int hashCode() {
		return 31 * first + second;
	}

	// Clearly, the author of the Bigram class intended to override the equals
	// method (Item 10) and even remembered to override hashCode in tandem
	// (Item 11). Unfortunately, our hapless programmer failed to override equals,
	// overloading it instead (Item 52).

	public static void main(String[] args) {
		Set<Bigram> s = new HashSet<>();
		for (int i = 0; i < 10; i++)
			for (char ch = 'a'; ch <= 'z'; ch++)
				s.add(new Bigram(ch, ch));
		System.out.println(s.size());
	}
}