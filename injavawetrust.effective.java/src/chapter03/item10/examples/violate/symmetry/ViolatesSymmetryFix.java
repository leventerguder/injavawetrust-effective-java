package chapter03.item10.examples.violate.symmetry;

public class ViolatesSymmetryFix {

	public static void main(String[] args) {
		CaseInsensitiveStringFix cis = new CaseInsensitiveStringFix("Polish");
		String str = "polish";

		System.out.println(cis.equals(str)); // false
		System.out.println(str.equals(cis)); // false

	}
}

class CaseInsensitiveStringFix {
	private final String s;

	public CaseInsensitiveStringFix(String s) {
		super();
		this.s = s;
	}

	// To eliminate the problem , merely remove the ill-conceived attempt to interoperate with String from the equals method.
	@Override
	public boolean equals(Object obj) {
		return obj instanceof CaseInsensitiveStringFix && ((CaseInsensitiveStringFix) obj).s.equalsIgnoreCase(s);
	}

}