package chapter04.item23.examples.hierarchy;

class Rectangle extends Figure {

	final double length;
	final double width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

}
