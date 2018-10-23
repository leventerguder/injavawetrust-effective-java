package chapter09.item65;

public class Item65Notes {

	// #####
	// Item 65: Prefer interfaces to reflection

	/*
	 * The core reflection facility, java.lang.reflect, offers programmatic access
	 * to arbitrary classes. Given a Class object, you can obtain Constructor,
	 * Method, and Field instances representing the constructors, methods, and
	 * fields of the class represented by the Class instance.
	 */

	/*
	 * Moreover, Constructor, Method, and Field instances let you manipulate their
	 * underlying counterparts reflectively: you can construct instances, invoke
	 * methods, and access fields of the underlying class by invoking methods on the
	 * Constructor, Method, and Field instances.
	 */

	/*
	 * You lose all the benefits of compile-time type checking, including exception
	 * checking. If a program attempts to invoke a nonexistent or inaccessible
	 * method reflectively, it will fail at runtime unless you’ve taken special
	 * precautions
	 */

	/*
	 * The code required to perform reflective access is clumsy and verbose. It is
	 * tedious to write and difficult to read.
	 */

	/*
	 * Performance suffers. Reflective method invocation is much slower than normal
	 * method invocation.
	 * 
	 */

	/*
	 * There are a few sophisticated applications that require reflection. Examples
	 * include code analysis tools and dependency injection frameworks.
	 */

	/*
	 * You can obtain many of the benefits of reflection while incurring few of its
	 * costs by using it only in a very limited form.
	 */

	/*
	 * In summary, reflection is a powerful facility that is required for certain
	 * sophisticated system programming tasks, but it has many disadvantages. If you
	 * are writing a program that has to work with classes unknown at compile time,
	 * you should, if at all possible, use reflection only to instantiate objects,
	 * and access the objects using some interface or superclass that is known at
	 * compile time
	 * 
	 */
}
