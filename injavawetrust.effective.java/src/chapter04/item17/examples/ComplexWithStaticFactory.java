package chapter04.item17.examples;

// immutable class with static factories instead of constructors
public class ComplexWithStaticFactory {

	private final double re;
	private final double im;

	private ComplexWithStaticFactory(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}

	public static ComplexWithStaticFactory valueOf(double re, double im) {
		return new ComplexWithStaticFactory(re, im);
	}

	public double realPart() {
		return re;
	}

	public double imaginaryPart() {
		return im;
	}

	public ComplexWithStaticFactory plus(ComplexWithStaticFactory c) {
		return new ComplexWithStaticFactory(re + c.re, im + c.im);
	}

	public ComplexWithStaticFactory minus(ComplexWithStaticFactory c) {
		return new ComplexWithStaticFactory(re - c.re, im - c.im);
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
		ComplexWithStaticFactory c = (ComplexWithStaticFactory) obj;
		return Double.compare(c.re, re) == 0 && Double.compare(c.im, im) == 0;
	}

}
