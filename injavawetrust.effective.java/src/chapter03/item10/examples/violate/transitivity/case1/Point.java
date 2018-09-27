package chapter03.item10.examples.violate.transitivity.case1;

public class Point {

	private final int x;
	private final int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point))
			return false;
		Point p = (Point) obj;
		return p.x == x && p.y == y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
