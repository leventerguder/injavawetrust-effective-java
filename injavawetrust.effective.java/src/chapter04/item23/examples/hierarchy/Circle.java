package chapter04.item23.examples.hierarchy;

class Circle extends Figure {

	final double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * (radius * radius);
	}

}
