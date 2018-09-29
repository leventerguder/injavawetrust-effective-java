package chapter03.item14.examples;

import java.util.Comparator;

public class PhoneNumber implements Comparable<PhoneNumber> {

	short areaCode;
	short prefix;
	short lineNum;

	// Comparable with comparator construction methods
	private static final Comparator<PhoneNumber> COMPARATOR = Comparator.comparingInt((PhoneNumber pn) -> pn.areaCode)
			.thenComparingInt(pn -> pn.prefix).thenComparingInt(pn -> pn.lineNum);
	// Note that the lambda explicitly specifies the type of its input parameter (PhoneNumber pn)
	// 

	public PhoneNumber(short areaCode, short prefix, short lineNum) {
		super();
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.lineNum = lineNum;
	}
//
//	@Override
//	public int compareTo(PhoneNumber pn) {
//
//		int result = Short.compare(areaCode, pn.areaCode);
//		if (result == 0)
//			result = Short.compare(prefix, pn.prefix);
//		if (result == 0)
//			result = Short.compare(lineNum, pn.lineNum);
//		return result;
//
//	}

	@Override
	public int compareTo(PhoneNumber pn) {
		return COMPARATOR.compare(this, pn);
	}

	@Override
	public String toString() {
		return "PhoneNumber [areaCode=" + areaCode + ", prefix=" + prefix + ", lineNum=" + lineNum + "]";
	}

}