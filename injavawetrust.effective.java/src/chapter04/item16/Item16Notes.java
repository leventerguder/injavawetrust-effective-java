package chapter04.item16;

public class Item16Notes {

	// #####
	// In public classes, use accessor methods , not public fields
	//
	// if a class is accessible outside its package , provide accessor methods to
	// preserve the flexibility to change the class's internal representation.

	// However , if a class is package-private or is a private nested class ,
	// there is nothing inherently wrong with exposing its data fields.

	// Several classes in the Java platform libraries violate the advice that public
	// classes should not expose fields directly.

	// java.awt.Point
	// java.awt.Dimension

	// While it is never a good idea for a public class to expose fields directly ,
	// it is less harmful if the fields are immutable.
	//
	// You cant change the representation of such a class without changin its API
	// and you cant take auxiliary actions when a field is read , buy tou can
	// enforce invariants.
}
