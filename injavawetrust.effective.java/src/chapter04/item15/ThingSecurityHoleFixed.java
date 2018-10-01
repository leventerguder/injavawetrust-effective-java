package chapter04.item15;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ThingSecurityHoleFixed {

	private static final Thing[] PRIVATE_VALUES = { new Thing("key1"), new Thing("key2"), new Thing("key3") };
	public static final List<Thing> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
}
