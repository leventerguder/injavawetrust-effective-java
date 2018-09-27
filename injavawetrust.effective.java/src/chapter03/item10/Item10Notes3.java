package chapter03.item10;

public class Item10Notes3 {

}

// Here is a recipe for a high-quality equals method

// 1 - Use the == operator to check if the argument is a reference to this object.
// if so , return true. This is just a performance optimization but one that is worth doing if the comparison is potentially expensive

// 2 - Use the instanceof operator to check if the argument has the correct type.
// if not return false
//

// 3 - Cast the argument to the correct type.
//

// 4 - For each "significant" field in the class , check if that field of the argument matches the corresponding field of this object.

// for primitive fields whose type is not float or double , use the == operator for comparison
// for object reference fields call the equals method recursively.

// for float and double use;
// Float.compare(float,float)
// Double.compare(double,double)

// You could Float#equals and Double#equals method , would entail autoboxing on every comparison
// which would have poor performance.

// For array fields , apply these guidelines to each element.
// if every element in an array field is significant, use of the Arrays.equals method.

// For best performance , you should first compare fields that are more likely to differ, less expensive to compare , or , ideally both.

// When you are finished writing your equals method, ask yourself three questions ;

// Is it symmetric ? Is it transitive ? Is it consistent ?

// Here are a few final caveats :

// Always override hashCode when you override equals(Item 11)
// Dont try to be too clever.
// if you simply test fields for equality , it is not hard to adhere to the equals contract.

// Dont substitute another type for Object in the equals declaration
// It is not uncommon for a programmer to write an equals method that looks like this and then spend hours puzzling over
// why it doesnt work properly

// Broken - parameter type must be Object!
// public boolean equals(MyClass o) {
//	
// }


// This problem is that this method does not override Object#equals whose argument is of type Object , but overloaded it instead.

// Consistent use of the Override annotation , as illustrated throughout this item , will prevent you from makin this mistake (Item 40)
// This equals emthod wont compile , and the error message will tell you exactly what is wrong :

// Still broken , but wont compile
//@Override 
//public boolean equals(MyClass o) {
//	
//}


// TODO 
// Google's open source AutoValue framework , which automatically generates these methods for you
// triggered by a single annotation on the class.

// IDEs , too, have facilities to generate equals and hashode methods but the resulting source code is more verbose and less readable
// than code that uses AutoValue


// In Summary ,
// dont override the equals method unless you have to :
// in many cases the implementation inherited from Object does exactly what you want.
// if you do override equals make sure to compare all of the class's significant fields and to compare them in a manner
// that preserves all five provisions of the equals contract.
