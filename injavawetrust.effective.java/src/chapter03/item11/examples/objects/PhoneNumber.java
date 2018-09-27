package chapter03.item11.examples.objects;

import java.util.Objects;

public class PhoneNumber {

	int areaCode;
	int prefix;
	int lineNum;

	// One-line hashCode method - mediocre performance
	@Override
	public int hashCode() {
		return Objects.hash(lineNum, prefix, areaCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		if (areaCode != other.areaCode)
			return false;
		if (lineNum != other.lineNum)
			return false;
		if (prefix != other.prefix)
			return false;
		return true;
	}

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		super();
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.lineNum = lineNum;
	}

}