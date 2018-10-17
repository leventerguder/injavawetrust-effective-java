package chapter07.item47.examples;

import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {

		// Wont compile , due to limitations on Java's type inference
		// The target type of this expression must be a functional interface
//		for( ProcessHandle ph : ProcessHandle.allProcesses() ::iterator) {
//			
//		}

		// Hideous workaround to iterate over a stream
		for (ProcessHandle ph : (Iterable<ProcessHandle>) ProcessHandle.allProcesses()::iterator) {

		}

		// This client code works, but it is too noisy and opaque to use in practice
		// A better workaround is to use an adapter method.

		// With this adapter, you can iterate over any stream with a for-each statement:
		for (ProcessHandle ph : iterableOf(ProcessHandle.allProcesses())) {

		}
	}

	// Adapter from Stream<E> to Iterable<E>
	public static <E> Iterable<E> iterableOf(Stream<E> stream) {
		return stream::iterator;
	}
}
