package chapter04.item23.examples.hierarchy;

class Square extends Rectangle {

	Square(double side) {
		super(side, side);
	}
	// Note that the fields in the above hierarchy are accessed directly rather than
	// by accessor methods. This was done for brevity and would be a poor design if
	// the hierarchy were public (Item 16).
}
