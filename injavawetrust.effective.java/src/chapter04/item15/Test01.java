package chapter04.item15;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {

		ThingSecurityHole.values[0] = new Thing("security-hole");

		Arrays.stream(ThingSecurityHole.values).forEach(System.out::println);

		// ThingSecurityHoleFixed.VALUES.add(new
		// Thing("java.lang.UnsupportedOperationException"));
		ThingSecurityHoleFixed.VALUES.get(0).setKey("eee"); // TODO

		ThingSecurityHoleFixedV2.values();

	}
}
