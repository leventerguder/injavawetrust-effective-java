package chapter03.item13;

public class Item13Notes {

}

// The Cloneable interface was intended as a mixing interface (Item 20) for class to advertise that
// they permit cloning

// So what does Cloneable do , given that it contains no methods ?
// It determines the behavior of Object's protected clone implementation.

// if a class implements Cloneable , Object's clone method returns a field-byfield copy of the object;
// otherwise it throws CloneNotSupportedException

// In practice , a class implementing Cloneable is expected to provide a properly functioning public clone method.

// The general contract for the clone method is weak ;
// Creates and returns a copy of this object. The precise meaning of "copy" may depend on the class of the object.
// The general intent is that for any object x , the expression x.clone() != x will be true 

// and expression
// x.clone().getClass() == x.getClass() will be true , this is not absolute requirement

// x.clone().equals(x) will be true ,this is not absolute requirement

// By convention, the object returned by this method should be obtained by calling super.clone. 
// If a class and all of its superclasses (except Object) obey this convention, it will be the case that
// x.clone().getClass() == x.getClass()

// By convention, the returned object should be independent of the object being cloned. 
// To achieve this independence, it may be necessary to modify one or more fields of the object returned by super.clone before returning it.

// This mechanism is vaguely similar to constructor chaining, except that it isn’t enforced: 
// if a class’s clone method returns an instance that is not obtained by calling super.clone but by calling a constructor, 
// the compiler won’t complain, but if a subclass of that class calls super.clone, the resulting object will have the wrong class, 
// preventing the subclass from clone method from working properly.

// Suppose you want to implement Cloneable in a class whose superclass provides a well-behaved clone method. 
// First call super.clone. The object you get back will be a fully functional replica of the original.