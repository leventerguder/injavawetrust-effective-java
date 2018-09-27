package chapter03.item10;

public class Item10Notes2 {

}

// Reflexivity
// It is hard to imagine violating this one unintentionally.
// Fir you were to violate it and then add an instance of your class to a collection,
// the contains method migh well say that the collection didnt contain the instance you added.

// Symmetry
// The second requirement says that any two objects must agree on whether they are equal.
// Unlike the first requirement , it is not hard to imagine violating this one unintentionally.

// Transitivity
// The third requirement of the equals contract says that if one object is equal to a second and the second object is equal to a third
// then first object must be equal to the third.
//

//
// While there is no satisfactory way to extend and instantiable class and add a value component ,
// there is a fine workaround : Favor composition over inheritance.

// There are some classes in the Java platform libraries that do extend an instantiable class and add a value component
// For example java.sql.Timestamp extends java.util.Date and adds a nanoseconds field.

// The equals implementation for Timestamp does violate symmetry and can cause erratic behavior if Timestamp and Date objects are 
// used in the same collection or are otherwise intermixed.

// Note that you can add a value component to a subclass of an abstract class without violating the equals contract.
// This is important for the sort of class hierarchies that you get by following the advice in Item 23
// "Prefer class hierarchies to tagged classes"

// Consistency
// The fourth requirement of the equals contract says that if two objects are equal,
// they must remain equal for all time unless one (or both) of them is modified
// 
// whether or not a class is immutable , do not write an equals method that depends on unreliable resources.

// java.net.URL's equals method relies on comparison of the IP addresses of the hosts associated with the URLs
// Translating a hostname to an IP address can require network access , and it isnt guaranteed to yield the same results over time.

// This can cause the URL equals method to violate the equals contract and has caused problems in practice.
// The behavior of URL's equals method was a big mistake and should not be emulated.

// To avoid this sort of problem , equals methods should perform only deterministic computations on memory-resident objects.

// Non-nullity
// It says that all objects must be unequal to null.
// it isnt hard to imagine accidentally throwing a NullPointerException.
// The general contract prohibits this.

// Many classes have equals methods that guard against it with an explicit test for null

/// public boolean equals (Object o) {
//   if(o == null)
//	   return false;
//}

// This test is unnecessary. To test its argument for equality , the equals method must first cast its argument to an appropriate type 
// so its accessors can be invoked or its fields accessed.
// before doing the cast the method must use the instance of operator to check that its argument is of the correct type

class MyType {
	public boolean equals(Object o) {
		if (!(o instanceof MyType))
			return false;
		MyType mt = (MyType)o;
		//
		//
		return true;
	}
}

// if this type check were missing and the equals method were paased an argument of the wrong type , 
// the equals method would throw a ClassCastException , which violates the equals contract.
// the type check will return false if null is passed in , so you dont need an explicit null check.
