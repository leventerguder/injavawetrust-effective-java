package chapter07.item45.examples;

public class Test01 {

	public static void main(String[] args) {
		"Hello world!".chars().forEach(System.out::print);

		// It is admittedly confusing that a method
		// named chars returns a stream of int values. You could fix the program by
		// using a cast to force the invocation of the correct overloading:
		
		System.out.println();
		
		"Hello world!".chars().forEach(x -> System.out.print((char) x));
		
		// but ideally you should refrain from using streams to process char values
		
	}
}
