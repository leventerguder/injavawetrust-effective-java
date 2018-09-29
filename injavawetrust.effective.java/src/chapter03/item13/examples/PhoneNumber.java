package chapter03.item13.examples;

public class PhoneNumber implements Cloneable {

	int areaCode;
	int prefix;
	int lineNum;

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		super();
		System.out.println("Contructor...");
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.lineNum = lineNum;
	}

	@Override
	public String toString() {
		return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	// Covariant return
	// An overriding method's return type can be a subclass of the overridden
	// method's return type.
	@Override
	protected PhoneNumber clone() {
		try {
			return (PhoneNumber) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

}