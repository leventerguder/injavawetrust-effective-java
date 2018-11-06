package chapter12.item85.examples;

import static chapter12.item85.examples.Util.*;

import java.util.HashSet;
import java.util.Set;

// Deserialization bomb - deserializing this stream takes forever
public class Test1 {
	public static void main(String[] args) throws Exception {
		System.out.println(bomb().length);
		deserialize(bomb());
	}

	// you can easily mount a denial-of-service attack by
	// causing the deserialization of a short stream that requires a long time to
	// deserialize. Such streams are known as deserialization bombs

	static byte[] bomb() {
		Set<Object> root = new HashSet<>();
		Set<Object> s1 = root;
		Set<Object> s2 = new HashSet<>();
		for (int i = 0; i < 100; i++) {
			Set<Object> t1 = new HashSet<>();
			Set<Object> t2 = new HashSet<>();
			t1.add("foo"); // make it not equal to t2
			s1.add(t1);
			s1.add(t2);
			s2.add(t1);
			s2.add(t2);
			s1 = t1;
			s2 = t2;
		}
		return serialize(root);

		// The object graph consists of 201 HashSet instances, each of which contains 3
		// or fewer object references. The entire stream is 5,744 bytes long, yet the
		// sun would burn out long before you could deserialize it

		// The problem is that deserializing a HashSet instance requires computing the
		// hash codes of its elements. The 2 elements of the root hash set are
		// themselves hash sets containing 2 hash-set elements, each of which contains 2
		// hash-set elements, and so on, 100 levels deep. Therefore, deserializing the
		// set causes the hashCode method to be invoked over 2100 times.
	}
}