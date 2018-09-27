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
// The general intent is that for any object x ,
// the expression x.clone() != x will be true 
// and expression
// x.clone().getClass() == x.getClass() will be true
// x.clone().equals(x) will be true