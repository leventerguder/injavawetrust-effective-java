package chapter03.item13.examples;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class Test04 {

	public static void main(String[] args) {

		Set<String> hset = new HashSet<>();
		hset.add("key1");
		hset.add("key2");

		// conversion contructor
		TreeSet<String> tset = new TreeSet<>(hset);
		System.out.println(tset);
	}
}
