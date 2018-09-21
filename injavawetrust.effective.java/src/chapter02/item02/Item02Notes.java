package chapter02.item02;

public class Item02Notes {

}

// Static factories and constructors share a limitation : 
// they do not scale well to large numbers of optional parameters.

// The telescoping constructor pattern works , but it is hard to write client
// code when there are many parameters , and harder still to read it.

// if the client accidentally reverses two such parameters , the compiler wont complain, but the program
// will misbehave at runtime (Item 51)

// Java Beans pattern, in which you call a parameterless constructor to create the object and then call setter methods
// to set each required parameter and each optional parameter of interest

// Construction is split across multiple calls , a JavaBean may be in an inconsistent state partway through its construction.

// A related disadvantage is that the JavaBeans pattern precludeds the possibility of making a class immutable(Item 17)
// and requires added effort on the part of the programmer to ensure thread safety.

// Instead of making the desired object directly , the client calls a constructor (or a static factory) with all of the required parameters and gets a builder object.
// Then the client calls setter-like methods on the builder object to set each optional parameter of interest.
// Finally the client calss a parameterless build method to generate the object which is typically immutable.

// The builder pattern is well suited class hierarchies

// Pizza.builder is a generic type with a recursive type parameter.

// Use a parallel hierarchy of builders, each nested in the corresponding class.
// Abstract classes have abstract builders; concrete classes have concrete builders

// hierarchical builders

// A minor advantage of builders over constructors is that builders can have multiple 
// varargs parameters because each parameter is specified in its own method.

// builder pattern has disadvantages as well.
// in order to create an object , you must first create its builder.

// Builder pattern is more verbose than the telescoping contructor pattern
// so it should be used onl if there are enough parameters to make it worthwhile
// say four or more.

// In summary , the Builder Pattern is a good choice when designin classes
// whose constructors or static factories would have more than a ahndful of parameters
// especially if many of the parameters are optional or of identical type.

// Client code is much easier to read and write with builders than with telescoping
// constructors and builders are much safer than javabeans