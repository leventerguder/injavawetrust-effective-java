package chapter03.item11.examples;

import java.util.HashMap;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {

		PhoneNumber phoneNumber = new PhoneNumber(707, 867, 5309);

		Map<PhoneNumber, String> map = new HashMap<>();
		map.put(phoneNumber, "Levent");
		//

		System.out.println(map.get(new PhoneNumber(707, 867, 5309)));

		// Notice that two PhoneNumber instances are involved: one is used for insertion
		// into the HashMap, and a second, equal instance is used for (attempted)
		// retrieval. The PhoneNumber class’s failure to override hashCode causes the
		// two equal instances to have unequal hash codes, in violation of the hashCode
		// contract.

		// Therefore, the get method is likely to look for the phone number in a
		// different hash bucket from the one in which it was stored by the put method.
		// Even if the two instances happen to hash to the same bucket, the get method
		// will almost certainly return null, because HashMap has an optimization that
		// caches the hash code associated with each entry and doesn’t bother checking
		// for object equality if the hash codes don’t match.
	}
}

class PhoneNumber {

	int areaCode;
	int prefix;
	int lineNum;

	// The worst possible legal hashCode implementation - never use!

	// It’s legal because it ensures that equal objects have the same hash code.
	// It’s atrocious because it ensures that every object has the same hash code.
	// Therefore, every object hashes to the same bucket, and hash tables degenerate
	// to linked lists. Programs that should run in linear time instead run in
	// quadratic time. For large hash tables, this is the difference between working
	// and not working.

	@Override
	public int hashCode() {
		return 42;
	}

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		super();
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.lineNum = lineNum;
	}

}