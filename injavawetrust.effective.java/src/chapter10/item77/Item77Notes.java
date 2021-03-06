package chapter10.item77;

public class Item77Notes {

	// #####
	// Item 77: Don’t ignore exceptions

	// While this advice may seem obvious, it is violated often enough that it bears
	// repeating. When the designers of an API declare a method to throw an
	// exception, they are trying to tell you something. Don’t ignore it! It is easy
	// to ignore exceptions by surrounding a method invocation with a try statement
	// whose catch block is empty:

	// Empty catch block ignores exception - Highly suspect!
//	  try {
//	      ...
//	  } catch (SomeException e) {
//	  }

	// An empty catch block defeats the purpose of exceptions, which is to force you
	// to handle exceptional conditions. Ignoring an exception is analogous to
	// ignoring a fire alarm—and turning it off so no one else gets a chance to see
	// if there’s a real fire. You may get away with it, or the results may be
	// disastrous. Whenever you see an empty catch block, alarm bells should go off
	// in your head.

	// There are situations where it is appropriate to ignore an exception. For
	// example, it might be appropriate when closing a FileInputStream. You haven’t
	// changed the state of the file, so there’s no need to perform any recovery
	// action, and you’ve already read the information that you need from the file,
	// so there’s no reason to abort the operation in progress. It may be wise to
	// log the exception, so that you can investigate the matter if these exceptions
	// happen often.

	// If you choose to ignore an exception, the catch block should contain a
	// comment explaining why it is appropriate to do so, and the variable should be
	// named ignored.

	// The advice in this item applies equally to checked and unchecked exceptions.
	// Whether an exception represents a predictable exceptional condition or a
	// programming error, ignoring it with an empty catch block will result in a
	// program that continues silently in the face of error. The program might then
	// fail at an arbitrary time in the future, at a point in the code that bears no
	// apparent relation to the source of the problem. Properly handling an
	// exception can avert failure entirely. Merely letting an exception propagate
	// outward can at least cause the program to fail swiftly, preserving
	// information to aid in debugging the failure.
}
