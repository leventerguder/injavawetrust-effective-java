package chapter06.item40;

public class Item40Notes {

	// #####
	// Item 40 : Consistently use the Override annotation

	// The Java libraries contain several annotation types. For the typical
	// programmer, the most important of these is @Override.

	// Therefore, you should use the Override annotation on every method
	// declaration that you believe to override a superclass declaration.

	// There is one minor exception to this rule. If you are writing a class that is
	// not labeled abstract and you believe that it overrides an abstract method in
	// its superclass, you needn’t bother putting the Override annotation on that
	// method.

	// The Override annotation may be used on method declarations that
	// override declarations from interfaces as well as classes.

	// In summary, the compiler can protect you from a great many errors if you
	// use the Override annotation on every method declaration that you believe
	// to override a supertype declaration, with one exception. In concrete classes,
	// you need not annotate methods that you believe to override abstract method
	// declarations (though it is not harmful to do so).
}
