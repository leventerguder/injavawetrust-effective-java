package chapter03.item10.examples.violate.liskov.substitution;

public class Point {

	private final int x;
	private final int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// Broken - violates Liskov substitution principle
	// This has the effect of equating objects only if they have the same
	// implementation class. This may not seem so bad, but the consequences are
	// unacceptable: An instance of a subclass of Point is still a Point, and it
	// still needs to function as one, but it fails to do so if you take this
	// approach!

	@Override
	public boolean equals(Object o) {
		if (o == null || o.getClass() != getClass())
			return false;
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
