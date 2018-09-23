package chapter02.item08;

public class Item08Notes {

}

// #####
// Avoid finalizers and cleaners

// Finalizers are unpredictable , often dangerous and generally unnecessary.
// Their use can cause erratic behavior , poor performance , and portability problems.
// You should avoid them.
// As of Java9 , finalizers have been deprecated.
// Java 9 replacement for finalizers is cleaners. 

// Cleaners are less dangerous than finalizers , but still unpredictable , slow , and generally unnecessary.

// In Java, the garbage collector reclaims the storage associagted with an object when it becomes unreachable,
// requiring no special effort on the part of the programmer.

// There is no guarantee , they will be executed promptly , it can take arbitrarily 
// long between the time that an object becomes unreachable and the time its finalizer or cleaner runs.
// This means that you should never do anything time-critical in a finalizer or cleaner.

// Cleaners still run in the background , under the control of the garbage collector
// so there can be no guarantee of prompt cleaning.

// You should never depend on a finalizer or cleaner to update persistent state.

// Dont be seduced by the methods System.gc and System.runFinalization
// They may increase the odds of finalizers or cleaners getting executed , but they dont guarantee it.

// There is a severe performance penalty for using finalizers and cleaners.
// Finalizers have a serious security problem : they open your class up to finializer attacks.

// Throwing an exception from a constructor should be suffient to prevent an object from coming into existence ;
// in the presence of finalizers it is not.

// To protect nonfinal classes from finalizer attacks , write a final finalize method that does nothing.

// Just have your class implement AutoCloseable ! 
// and require its clients to invoke the close method on each instance when it is no longer needed.
// Typically using try-with-resources to ensure termination even in the face of exceptions.

// So what , if anything, are cleaners and finalizer good for ?
// They have perhaps two legitimate uses. 
// One is to act as a safety net in case the owner of a resource neglects to call its close method. 
// While there is no guarantee that the cleaner or finalizer will run promptly , 
// it is better to free the resource late than never if the client fails to do so.

// Some Java library classes such as FileINputStream FileOutputStream , ThreadPoolExecutor , java.sql.Connection
// have finalizers that serve as safety nets.
//

// A second legitimate use of cleaners concerns objects with native pers.
// A native peer is a native (non-java) object to which a normal object delegates via native methods.
// because a native peer is not a normal object , the garbage collectors doesnt know about it and cant reclaim it when its Java peer is reclaimed.
//

// In summary , dont use cleaners or in releases prior to Java 9 , finalizers,
// except as a safety net or to terminate noncritical native resouces.
// Even then , beware the indeterminacy and performance consequences.