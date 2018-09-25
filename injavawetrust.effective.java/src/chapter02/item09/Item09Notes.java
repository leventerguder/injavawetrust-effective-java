package chapter02.item09;

public class Item09Notes {

}
// #####
// Prefer try-with-resources to try-finally

// Java libraries include many resources that must be closed manually by invoking  a close method.
// InputStream , OutputStream , java.sql.Connection.
// Closing resources is often overlooked by clients, with predictably dire performance consequences

// try-finally statement was the best way to guarantee that a resource would be closed properly 
// , even in the face of an exception or return

// a resource must implement the AutoCloseable interface, 
// which consists of a single void-returning close method 

// Npt only are the try-with resources versions shorter and more readable than the originals
// but they provide far better diagnostics.

// Consider the firstLineOfFile method. If exceptions are thrown by both the readLine call and the (invisible) close, 
// the latter exception is suppressed in favor of the former. 

// These suppressed exceptions are not merely discarded ; 
// they are printed in the stack trace with a notation saying that they were suppressed. 
// You can also access them programmatically with the getSuppressed method, which was added to Throwable in Java 7.


// Always use try-with-resources in preference to try-finally when working with resources that must be closed.
// The resulting code is shorter and clearer , and the exceptions that is generates are more useful.
// The try-with-resources statement makes it easy to write correct code using resources that must be closed
// which was practically impossible using try-finally.