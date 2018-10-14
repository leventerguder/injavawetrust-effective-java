package chapter07.item45.examples;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Test02 {

	/*
	 * For example, let’s write a program to print the first twenty Mersenne primes.
	 * To refresh your memory, a Mersenne number is a number of the form 2p − 1. If
	 * p is prime, the corresponding Mersenne number may be prime; if so, it’s a
	 * Mersenne prime.
	 */

	private static final BigInteger ONE = new BigInteger("1");

	public static void main(String[] args) {
		primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE)).filter(mersenne -> mersenne.isProbablePrime(50))
				.limit(20).forEach(System.out::println);
	}

	private static final BigInteger TWO = new BigInteger("2");

	static Stream<BigInteger> primes() {
		return Stream.iterate(TWO, BigInteger::nextProbablePrime);
	}
}
