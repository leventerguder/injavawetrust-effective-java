package chapter04.item18;

public class Item18Notes {

	// #####
	// Item 18 : Favor composition over inheritance

	// Inheritance is a powerful way to achieve code reuse , but it is not always
	// the best tool for the job.
	// Used inappropriately, it leads to fragile software.

	// It is safe to use inheritance within a package , where the subclass and the
	// superclass implementations are under the control of the same programmers.

	// It is also safe to use inheritance when extending classes specifically
	// designed and documented for extension (Item 19)
	
	
	// Inheriting from ordinary concrete classes across package boundaries , however, is dangerous.
	
	// #### Unlike method invocation , inheritance violates encapsulation
	// In other words , a subclass depends on the implementation details of its superclass for its proper function.
	// 
	//

}