package chapter03.item10;

public class Item10Notes {

}

// Chapter 3 : Methods Common to All Objects

// #####
// Obey the general contract when overriding equals

// Overridigin the equals method seems simple , but there are many ways to get it wrong and consequences can be dire.
// The easiest way to avoid problems is not to override equals method , 
// in which case each instance of the class is equals only to itself.

// #####
// Each instance of the class is inheretenly unique.
// This is true for classes such as Thread that represent active entitites rahter than values.

// #####
// There is no need for the class to provide a "logical equality" test.
// For example , java.util.regex.Pattern could have overridden equals to check whether two Pattern instances represented exactly the same regular expression.
// but the designers did'nt think that clients would need or want this functionality.
// Under these circumstances , the equals implementation inherited from Objects is ideal.

// #####
// A superclass has already overridden equals , and the superclass behavior is appropriate for this class.
// For example , most Set implementations inherit their equals implementation from AbstractSet , 
// List implementations from AbstractList , 
// Map implementations from AbstractMap

// #####
// The class is private or package-private, and you are certain that its equals method will never be invoked.
// If you are extremely risk-averse , you can override the equals method to ensure that it isnt invoked accidentally.

// So when is it appropriate to override equals ?
// It is when a class has a notion of logical equality that differs from mere object identit and a superclass has not already overridden equals.
// This is generally the case for value classes.
// A programmer who compares references to value objects using the equals method expects to find out whether they are logically equivalent
// not whether they refer to the same object.

// not only is overriding the equals method necessary to satisfy programmer expectations, it enables instance to serve as map keys or set elements
// with predicatable , desirable behavior.

// A value class is simply a class that represents a value, such as Integer or String.

// The equals method implements an equivalence relation.

// ## Reflexive : For any non-null reference value x 
// x.equals(x) must return true

// ## Symmetric : For any non-null reference values x and y 
// x.equals(y) must return true if and only if y.equals(x) returns true

// ## Transitive : For any non-null reference values x,y,z
// if x.equals(y) returns true and y.equals(z) returns true , then x.equals(z) musrt return true

// ## Consistent : For any non-null reference values x and y , multiple invocations of x.equals(y) must consistently return true or consistently return false

// ## For any null reference value x , x.equals(null) must return false
