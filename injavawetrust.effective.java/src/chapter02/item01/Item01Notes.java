package chapter02.item01;

import java.math.BigInteger;
import java.util.Random;

public class Item01Notes {

	// ##### ITEM - 1  #####
	// Consider static factory methods instead of constructors.

	// A class can provide a public static factory method , which is simply a static
	// method that returns an instance of the class.

	public static Boolean valueOf(boolean b) {
		return b ? Boolean.TRUE : Boolean.FALSE;
	}

	// Note that a static factory method is not the same as the Factory Method
	// pattern from Design Patterns.

	// #####
	// One advantage of static factory methods is that , unlike constructors,
	// they have names.
	// #####

	// A static factory with a well-chosen name is easier to use and the resulting
	// client code easier to read.

	// For example the constructor BigInteger(int , int , Random) , which returns a
	// BigInteger that is probably prime would have been better expressed as a
	// static factory method named BigInteger.probablePrime

	public static void main(String[] args) {
		BigInteger prime1 = new BigInteger(5, 25, new Random());
		System.out.println(prime1);

		BigInteger prime2 = BigInteger.probablePrime(5, new Random());
		System.out.println(prime2);

		
		//
		
	}

	// A class can have only a single constructor with a given signature.
	// The user of such an API wil never be able to remember which constructor is
	// which and will end up calling the wrong one by mistake.

	// In cases where a class seems to require multiple constructors with the same
	// signature , replace the constructors with static factory methods and
	// carefully chosen names to highlight their differences.

	// #####
	// A second advantage of static factory methods is that , unlike
	// constructors , they are not required to create a new object each time they
	// are invoked. This allows immutable classes.
	// #####

	// Boolean.valueOf(boolean) method illustrates this technique : it never creates
	// an object.
	// It can greatly improve performance if equivalent objects are requested often
	// , especially if they are expensive to create.

	// There are several reasons to write instance-controlled classes. Instance
	// control allows a class to guarantee that it is a singleton.
	// or noninstantiable , also it allows an immutable value class make the
	// guarantee that no two equal instances exist.
	// a.equals(b) if and only if a==b this is the basis of the Flyweight pattern.
	// Enum types provide this guarantee.

	// #####
	// A third advantage of static factory methods is that , unlike constructors
	// they can return an object of any subtype of their return type.
	// #####

	// One application of this flexibility is that an API can return objects without
	// making their classes public.

	// #####
	// A fourth advantage of static factories is that the class of the returned
	// object can vary from call to call as a function of the input parameters.
	// #####

	// EnumSet class has no public constructors only static factories
	// RegularEnumSet , JumboEnumSet
	// The existence of these two implementation classes is invisible to clients.
	
	// #####
	// A fifth advantage of static factories is that the class of the returned object need not exist when the class containing the method is written
	// #####
	
	// Such flexible static factory methods form the basis of service provider frameworks,like JDBC
	// Dependency injection frameworks can be viewed as powerful service provider.
}