package chapter10.item71;

public class Item71Notes {

	// #####
	// Item 71: Avoid unnecessary use of checked exceptions

	// Many Java programmers dislike checked exceptions, but used properly, they can
	// improve APIs and programs. Unlike return codes and unchecked exceptions, they
	// force programmers to deal with problems, enhancing reliability.

	// If a method throws checked exceptions, the code that invokes it must handle
	// them in one or more catch blocks, or declare that it throws them and let them
	// propagate outward

	// The additional burden on the programmer caused by a checked exception is
	// substantially higher if it is the sole checked exception thrown by a method.

	// The easiest way to eliminate a checked exception is to return an optional of
	// the desired result type (Item 55).

	// Instead of throwing a checked exception, the method simply returns an empty
	// optional. The disadvantage of this technique is that the method can’t return
	// any additional information detailing its inability to perform the desired
	// computation.
	// Exceptions, by contrast, have descriptive types, and can export methods to
	// provide additional information (Item 70).

	// You can also turn a checked exception into an unchecked exception by breaking
	// the method that throws the exception into two methods, the first of which
	// returns a boolean indicating whether the exception would be thrown. This API
	// refactoring transforms the calling sequence from this:

	// Invocation with checked exception
	// try {
	// obj.action(args);
	// } catch (TheCheckedException e) {
	// ... // Handle exceptional condition
	// }

	// Invocation with state-testing method and unchecked exception
	// if (obj.actionPermitted(args)) {
	// obj.action(args);
	// } else {
	// ... // Handle exceptional condition
	// }

	// This refactoring is not always appropriate, but where it is, it can make an
	// API more pleasant to use

	// If you suspect that the trivial calling sequence will be the norm, then the
	// API refactoring may be appropriate
	// The resulting API is essentially the state- testing method API in Item 69 and
	// the same caveats apply: if an object is to be accessed concurrently without
	// external synchronization or it is subject to externally induced state
	// transitions, this refactoring is inappropriate because the object’s state may
	// change between the calls to actionPermitted and action.

	// If a separate actionPermitted method would duplicate the work of the action
	// method, the refactoring may be ruled out on performance grounds.

	// In summary, when used sparingly, checked exceptions can increase the
	// reliability of programs; when overused, they make APIs painful to use. If
	// callers won’t be able to recover from failures, throw unchecked exceptions.
	// If recovery may be possible and you want to force callers to handle
	// exceptional conditions, first consider returning an optional. Only if this
	// would provide insufficient information in the case of failure should you
	// throw a checked exception.
}
