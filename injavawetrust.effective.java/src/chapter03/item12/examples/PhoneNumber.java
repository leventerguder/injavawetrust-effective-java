package chapter03.item12.examples;

public class PhoneNumber {

	int areaCode;
	int prefix;
	int lineNum;

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		super();
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.lineNum = lineNum;
	}

	@Override
	public String toString() {
		return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
	}

}