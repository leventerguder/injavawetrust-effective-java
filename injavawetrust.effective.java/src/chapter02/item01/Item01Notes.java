package chapter02.item01;

import java.math.BigInteger;
import java.util.Random;

public class Item01Notes {

	// A class can provide a public static factory method , whic is simply a static
	// method that returns an instance of the class.

	public static Boolean valueOf(boolean b) {
		return b ? Boolean.TRUE : Boolean.FALSE;
	}

	// Note that a static factory method is not the same as the Factory Method
	// pattern from Design Patterns.

	// One advantage of static factory methods is that , unlike constructors, they
	// have names.



	public static void main(String[] args) {

		// A static factory with a well-chosen name is easier to use and the resulting
		// client code easier to read.
		
		// For example the constructor BigInteger(int , int , Random) , which returns a BigInteger that is probably prime
		// would have been better expressed as a static factory method named BigInteger.probablePrime
		BigInteger prime1 = new BigInteger(5, 25, new Random());
		System.out.println(prime1);
		
		BigInteger prime2 = BigInteger.probablePrime(5, new Random());
		System.out.println(prime2);
		
	}
}