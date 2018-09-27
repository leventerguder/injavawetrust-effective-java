package chapter03.item11.examples.better;

public class PhoneNumber {

	int areaCode;
	int prefix;
	int lineNum;

	// Typical hashCode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaCode;
		result = prime * result + lineNum;
		result = prime * result + prefix;
		return result;
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