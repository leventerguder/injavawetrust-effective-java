package chapter03.item10.examples.favor.composition;

import java.awt.Color;
import java.util.Objects;

public class ColorPoint {

	private final Point point;
	private final Color color;

	public ColorPoint(Point point, Color color) {
		super();
		this.point = point;
		this.color = Objects.requireNonNull(color);
	}

	public Point asPoint() {
		return point;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ColorPoint)) {
			return false;
		}
		ColorPoint cp = (ColorPoint) obj;
		return cp.point.equals(point) && cp.color.equals(color);
	}

}
