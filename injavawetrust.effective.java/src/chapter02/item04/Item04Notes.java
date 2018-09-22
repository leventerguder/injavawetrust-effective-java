package chapter02.item04;

public class Item04Notes {

}
// ##### 
// Enforce nonintantiability with a private constructor

// you will want to write a class that is just a grouping of static methods and static fields.
// java.lang.Math , java.util.Arrays , they can also be used to group static methods.

// Such utility classes were not designed to be instantiated : an instance would be nonsensical.

// Attempting to enforce noninstantiability by making a class abstract does not work. The class can be subclassed
// and the subclass instantiated.
// Furthermore , it misleads the user into thinking the class was designed for inheritance.

// A class can be made noninstantiable by including a private constructor.