package chapter04.item19.examples;

public class Test01 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.overrideMe();
	}
}
// You might expect this program to print out the instant twice , but it prints out null the first time
// because overrideMe is invoked by the Super constructor before the Sub constructor has a chance to initialize the instant field.
