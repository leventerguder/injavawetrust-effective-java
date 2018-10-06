package chapter05.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Item27Notes {

	// #####
	// Item 27 : Eliminate unchecked warnings
	// When you program with generics , you will sess many compiler warnings :

	// - unchecked cast warnings
	// - unchecked methodinvocation warnings
	// - unchecked parameterized vararg type warnings
	// - unchecked conversion warnings

	// Set<String> uncheckedConversion = new HashSet();
	// unchecked conversion

	// You dont actually have to specify the type parameter , merely to indicate
	// that its present with the diamond operator (<>)
	// introduced in Java 7. The compiler will then infer the correct actual type
	// parameter

	//
	// Set<String> goodSet = new HashSet<>();

	// ### Eliminate every unchecked warning that you can/
	// if you eliminate all warnings , you are assured that your code is typesafe
	// which is a very good thing.
	// It means that you wont get a ClassCastException at runtime.

	// if you cant eliminate a warning , but you can prove that the code that
	// provoked the warning is typesafe , then (and only then)
	// suppress the warning with an @SuppressWarnings annotation.

	// Always use the SuppressWarnings annotation on the smallest scope possible.
	// Never use SuppressWarnings on an entire class.

	// java.util.ArrayList
//    @Override
//    @SuppressWarnings("unchecked")
//    public <T> T[] toArray(T[] a) {
//        int size = size();
//        if (a.length < size)
//            return Arrays.copyOf(this.a, size,
//                                 (Class<? extends T[]>) a.getClass());
//        System.arraycopy(this.a, 0, a, 0, size);
//        if (a.length > size)
//            a[size] = null;
//        return a;
//    }

	// Every time you use a @SuppressWarnings("unchecked") annotation , add a
	// comment saying why it is safe to do so.
	// This will help others understand the code and more importantly it will
	// decrease the odds that someone will modify the code so as to make the
	// computation unsafe.

	// In summary , unchecked warnings are important.
	// Dong ignore them. EVery unchecked warning represent the potential for a
	// ClassCastException at runtime.
	// Do your best to eliminate these warnings.
	// if you cant eliminate an unchecked warning and you can prove that the code
	// that provoked it is typesafe , suppress the warning with
	// @SuppressWarnings("unchecked") annotation in the narrowest possible scope.
	// Record the rationale for your decision to suppress the warning in a comment.

}
