package chapter07.item48.examples;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Test01 {

	// Prime-counting stream pipeline - benefits from parallelization
	static long pi(long n) {
		return LongStream.rangeClosed(2, n).mapToObj(BigInteger::valueOf).filter(i -> i.isProbablePrime(50)).count();
	}

	// Prime-counting stream pipeline - parallel version
	static long piV2(long n) {
		return LongStream.rangeClosed(2, n).parallel().mapToObj(BigInteger::valueOf).filter(i -> i.isProbablePrime(50))
				.count();

	}

	public static void main(String[] args) {
		System.out.println(pi(10));
	}
}
