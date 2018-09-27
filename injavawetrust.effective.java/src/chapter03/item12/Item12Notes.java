package chapter03.item12;

public class Item12Notes {
	// While Object provides an implemntation of the toString method , the string
	// that it returns is generally not what the user of your class wants to see
	//
	// The general contract for toString says that the returned string shodul be "a
	// concise but informative representation that is easy for a person to read"

	// providing a good toString implementation makes your class much more pleasant
	// to use and makes systems using the class easier to debug.

	// The toString method is automatically invoked when an object is passed to
	// println , printf , the string concanetaion operator
	// or assert , or is printed by a debugger.

	// When practical , the toString method should return all of the interesting
	// information contained in the object.

	// Whether or not you decide to specify the format , you should clearly document
	// your intentions.
	// If you specify the format you should do so precisely.

	// Whether or not you specify the format , provide programmatic access to the
	// information contained in the value
	// returned by toString

	// TODO
	// Google's open source AutoValue facility , discussed in Item 10 , will generate a toString method for you
	// as will most IDEs.
	
	// To recap , override Object's toString implementation in every instantiable
	// class you write , unless a superclass has already done so.
	// It makes classes much more pleasant to use and aids in debugging.
	// The toString method should return a concise , useful description of the
	// object , in an aesthetically pleasing format.
}
