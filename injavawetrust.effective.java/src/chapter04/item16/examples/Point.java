package chapter04.item16.examples;

// Degenerate classes like this should not be public !
public class Point {

	public double x;
	public double y;

	// The data fields of such classes are accessed directly , these classes do not
	// offer the benefits of encapsulation (Item15)

	// You cant change the representation without changing the API , you cant
	// enforce invariants, and you cant take auxiliary action when a field is
	// accessed.
}

// Encapsulation of data by accessor methods (getters) and mutators (setters)
class PointEncapsulation {
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}