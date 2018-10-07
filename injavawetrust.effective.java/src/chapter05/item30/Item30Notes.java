package chapter05.item30;

public class Item30Notes {

	// ITEM 30 : Favor generic methods

	// Just as classes can be generic , so can methods
	// Static utility methods that operate on parameterized types are usually
	// generic.

	// On occasion , you will need to create an object that is immutable but
	// applicable to many different types.
	// because generics are implemented by erasure , you can use a single object for
	// all required type parameterizations but you need to write a static factory
	// method to repeatedly dole out object for each requested type parameterization
	// This pattern called the generic singleton factory, is used for function
	// objects such as
	// Collections.reverseOrder , Collections.emptySet

	// Suppose that you want to write an identity function dispenser.
	// The libraries provide Function.identity , so there 's no reason to write your
	// own , but it is instructive.

	// If Java's generics were reified , you woul need one identity function per
	// type , but since they are erased a generic singleton will suffice

	// It is permissible , though relatively rare, for a type parameter to be
	// bounded by some expression involving that type parameter itself
	// This is what's known as a recursive type bound

	// A common use of recursive type bounds is in connection with the Comparable
	// interface

	// public interface Comparable<T> {
	// public int compareTo(T o);
	// }

	// Many methods take a collection of elements implementin Comparable to sort it
	// search within it calculate its minimum or maxium , and the like.
	// To do these things , it is required that every element in the collection be
	// comparable to every other element in it
	// in other words , that the elements of the list be mutually comparable.
	
	
	
	
	// In summary, generic methods , like generic types are safer and easier to use
	// than methods requiring their clients to put explicit casts
	// on input parameters and return values
	// Like types, you should make sure that your methods can be used without casts
	// , which often means making them generic.
	// And like types , you should generify existing methods whose use requires
	// casts.
	// This makes life eair for new users without breaking existing clients (Item
	// 26)

}
