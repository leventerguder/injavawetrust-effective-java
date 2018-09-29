package chapter03.item14;

public class Item14Notes {

}

// #####
// Consider implementing Comparable
// compareTo method is not declared in Object

// Comparable#compareTo

// By implementing Comparable , yopu allow your class to interoperate with all of the many generic algorithms and collection
// implementations that depend on this interface.

// if you are writing a value class with an obvious natural ordering, such as alphabetical order , numerical order ,
// or chronological order , you should implement the Comparable interface.

// The general contract of the compareTo method is similar to that of equals :
// Compares this object with specified object for order.
// Returns a negative integer , zero , or a positive integer as this object is less than , equals to , or greater than specified object.

// the notation sgn(expression) designates the mathematical signum function , whic is defined to return -1 ,0 or 1
// according to whether the value of expression is negative zero or positive

// ### The implementor must ensure that sgn(x.compareTo(y)) == - sgn(y.compareTo(x)) for all x and y

// ### The implementor must also ensure that relatin is transitive :
// x.compareTo(y) > 0 && y.compareTo(z) >0 implies x.compareTo(z) > 0

// ### The implementor must ensure that x.compareTo(y) == 0 implies that sgn(x.compareTo(z)) == sgn (y.compareTo(z)) , for all z
//

// ### It is strongly recommended but not required that
// ( x.compareTo(y) == 0) == (x.equals(y)) 
// 
// 

// Occasionally you may see compareTO or compare methods that rely on the facet that the difference between two values is negative
// if the first value is less than the second , zero if the two values are equals , and positive if the first value is greater
//

// In summary , whenever you implement a value class that has a sensible ordering , you should have the class implement the Comparable interface
// so that its instances can be easily sorted , searched , and used in comparison-based collections.

// When comparing fields values in the implementations of the compareTo methods , avoid the use of < and > operators
// Instead , use static compare methods in the boxed primitive classes or the comparator construction methods in the Comparator interface

// Writing a compareTo method is similar to writing an euqlas method but there are a few key differences.
// a compareTo method , fields are compared for order rather than equality
//

// in Java 7 , static compare methods were added to all of Java's boxed primitive classes.
//
// Use of the relational operators < and > in compareTo methods is verbose and error-prone and no longer recommended.

// In Java 8 , the Comparator interface was outfitted with a set of comparator construction methods , which enable fluent construction of comparators.
//
// 