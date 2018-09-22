package chapter02.item06.examples;

import java.util.regex.Pattern;

public class RomanNumerals {

	//// Performance can be greatly improved!
	static boolean isRomanNumeralV1(String s) {
		return s.matches("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
	}
	/*
	 * The problem with this implementation is that it relies on the String.matches
	 * method. While String.matches is the easiest way to check if a string matches
	 * a regular expression, it’s not suitable for repeated use in
	 * performance-critical situations.
	 * 
	 */

	// // Reusing expensive object for improved performance
	private static final Pattern ROMAN = Pattern
			.compile("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

	static boolean isRomanNumeral(String s) {
		return ROMAN.matcher(s).matches();
	}
}