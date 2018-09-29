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

// immutable classes should never provide a clone method because it would merely encourage wasteful copying.

// protected native Object clone() throws CloneNotSupportedException;
// CloneNotSupportedException is checked exception . 
// PhoneNumber implements Cloneable , we know the call to super.clone will succeed.
// CloneNotSupportedException should have been unchecked.

// In effect , the clone method functions as a constructor ;
// you must ensure that it does no harm to the original object and that it properly establishes invariants on the clone.

// Like a constructor , a clone method must never invoke an overridable method on the clone under construction (Item 19)
// if clone invokes a method that is overridden in a subclass , this method will execute before the subclass has had a chance 
// to fix its state in the clone , quite possibly leading to corruption in the clone and the original.

// Object's clone method is declared to throw CloneNotSupportedException , but overriding methods need not
// public clone methods should omit the throws clause , as methods that dont throw checked exceptions are easier to use (Item 71)

// You have two choices when designing a class for inheritance (Item 19) , but whichever one you choose , the class should not implement Cloneable
// You may choose to mimic the behavior of Object by implementing a properly functioning protected clone method that is declared to throw
// CloneNotSupportedException

// if you write a thread-safe class that implements Cloneable , remember that its clone method must be properly synchronized
// just like any other method (Item 78)

// To recap , all classes that implement Cloneable should override clone with a public method whose return type is the class itself.
// This method should first call super.clone, then fix any fields that need fixing.
// Typically , this means copying any mutable objects that comprise the internal "deep structure" of the object and replacing the clone's references
// to these objects with references to their copies.

// While these internal copies can usually be made by calling clone recursively , this is not always the best approach.

// Is all this complexity really necessary ?
// Rarely.

// A better approach to object copying is to provide a copy constructor or copy factory.
// A copy constructor is simply a constructor that takes a single argument whose type is the class containing the constructor
//  
// The copy constructor approach and its static factory variant have many advantages over Cloneable/clone
// They dont rely on a risk-prone extralinguistic object creation mechanism ; they dont demand unenforceable adherence to thinly documented conventions
// they dont conflict with the proper use of final fields , they dont throw unnecessary checked exceptions , and they dont require casts


// All general purpose collection implementations provide a constructo whose argument is of type Collection or Map
// Interface-based copy constructors and factories , more properly known as conversion constructors and conversion factories 
// allow the client to accept the implementation type of the original.

// You have a HashSet ,and you want to copy it as TreeSet , 
// The clone method cant offer this functionality but it is easy with conversion contructor new TreeSet<>(s)


// Given all problems associated  with Cloneable , new interfaces should not extend it 
// and new extendable classes should not implement it
//
// As a rule , copy functionality is best provided by constructors or factories
// A notable exception to this rule is arrays , which are best copied with clone method.