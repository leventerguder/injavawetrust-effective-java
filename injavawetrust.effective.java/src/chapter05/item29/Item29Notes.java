package chapter05.item29;

import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Delayed;

public class Item29Notes {

	// #####
	// Item 29 : Favor generic types
	// It is generally not too difficult to parameterize your declarations and make
	// use of the generic types and methods provided by JDK

	// Both techniques for eliminating the generic array creation have their
	// adherents.

	// The first is more readable : the array is declared to be of type E[]
	// clearly indicating that it contains only E instances

	// It is also more concise : in a typical generic class , you read from the
	// array at many points in the code
	// The first technique requires only a single cast (where the array is created)
	// while the second requires a separate cast each time array element is read.

	// Thus , the first technique is preferable and more commonly used in practice

	// There are some generic types that restrict the permissible values of their
	// type parameters.
	// For example , consider java.util.concurrent.DelayQueue

	// In summary , generic types are safer and easier to use than types that
	// require
	// casts in client code.
	//
	// When you design new types , make sure that they can be used without such
	// casts.
	// This will often mean making the types generic.
	// if you have any existing types that should be generic but arent generify
	// them.

}
