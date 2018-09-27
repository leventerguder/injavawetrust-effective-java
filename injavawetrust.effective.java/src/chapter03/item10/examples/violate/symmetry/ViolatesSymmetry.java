package chapter03.item10.examples.violate.symmetry;

import java.util.ArrayList;
import java.util.List;

public class ViolatesSymmetry {

	public static void main(String[] args) {

		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		String str = "polish";

		System.out.println(cis.equals(str)); // true
		System.out.println(str.equals(cis)); // false

		List<CaseInsensitiveString> list = new ArrayList<>();
		list.add(cis);

		System.out.println(list.contains(cis));

		// Once you have violated the equals contract , you simply dont know how other
		// objects will behave when confronted with your object.
	}
}

class CaseInsensitiveString {
	private final String s;

	public CaseInsensitiveString(String s) {
		super();
		this.s = s;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
		if (obj instanceof String) // one - way interoperability.
			return s.equalsIgnoreCase((String) obj);
		return false;
	}

}