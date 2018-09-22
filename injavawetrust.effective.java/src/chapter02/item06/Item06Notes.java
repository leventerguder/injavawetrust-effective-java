package chapter02.item06;

public class Item06Notes {

}

//####
// Avoid creating unnecessary objects

// It is often appropriate to reuse a single object instead of creating a new functionally equivalent object each time it is needed.
// Reuse can be both faster and more stylish.
// An object can be reused if it is immutable.

// You can often avoid creating unnecessary objects by using static factory
// methods in preference to constructors on immutable classes that provide both.

// The factory method Boolean.valueOf(String) is preferable to constructor Boolean(String) 
// which is deprecated in Java9.
// The constructor must create a new object each time it is called
// while the factory method is never required to do so and wont in practice.


// Another way to create unnecessary objects is autoboxing, which allows the programmer to mix primitive and boxed primitive types
// boxing and unboxing automatically as needed.
//
// Autoboxing blurs but does not erase the distinction between primitive and boxed primitive types.

// prefer primitives to boxed primitives , and watch out for unintentional autoboxing!

// Creatning objects unnecessarily merely affects style and performance!