package chapter04.item17.examples;

// immutable complex number class
public final class Complex {

	private final double re;
	private final double im;

	public Complex(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}

	public double realPart() {
		return re;
	}

	public double imaginaryPart() {
		return im;
	}

	public Complex plus(Complex c) {
		return new Complex(re + c.re, im + c.im);
	}

	public Complex minus(Complex c) {
		return new Complex(re - c.re, im - c.im);
	}

	@Override
	public int hashCode() {
		return 31 * Double.hashCode(re) + Double.hashCode(im);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Complex))
			return false;
		Complex c = (Complex) obj;
		return Double.compare(c.re, re) == 0 && Double.compare(c.im, im) == 0;
	}

}
