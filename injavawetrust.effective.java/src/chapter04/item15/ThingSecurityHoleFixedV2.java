package chapter04.item15;

public class ThingSecurityHoleFixedV2 {

	private static final Thing[] PRIVATE_VALUES = { new Thing("key1"), new Thing("key2"), new Thing("key3") };

	public static final Thing[] values() {
		return PRIVATE_VALUES.clone();
	}
}
