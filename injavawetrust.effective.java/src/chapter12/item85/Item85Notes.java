package chapter12.item85;

public class Item85Notes {

	// Chapter 12
	// THIS chapter concerns object serialization, which is Java’s framework for
	// encoding objects as byte streams (serializing) and reconstructing objects
	// from their encodings (deserializing). Once an object has been serialized, its
	// encoding can be sent from one VM to another or stored on disk for later
	// deserialization. This chapter focuses on the dangers of serialization and how
	// to minimize them.

	// #####
	// Item 85: Prefer alternatives to Java serialization

	// When serialization was added to Java in 1997, it was known to be somewhat
	// risky.

	// A fundamental problem with serialization is that its attack surface is too
	// big to protect, and constantly growing: Object graphs are deserialized by
	// invoking the readObject method on an ObjectInputStream
	// This method is essentially a magic constructor that can be made to
	// instantiate objects of almost any type on the class path, so long as the type
	// implements the Serializable interface.

	// The attack surface includes classes in the Java platform libraries, in third-
	// party libraries such as Apache Commons Collections, and in the application
	// itself.

	// To quote Robert Seacord, technical manager of the CERT Coordination Center:
	// Java deserialization is a clear and present danger as it is widely used both
	// directly by applications and indirectly by Java subsystems such as RMI
	// (Remote Method Invocation), JMX (Java Management Extension), and JMS (Java
	// Messaging System). Deserialization of untrusted streams can result in remote
	// code execution (RCE), denial-of-service (DoS), and a range of other exploits.
	// Applications can be vulnerable to these attacks even if they did nothing
	// wrong. [Seacord17]

	// The best way to avoid serialization exploits is never to deserialize
	// anything.

	// There is no reason to use Java serialization in any new system you write.

	// There are other mechanisms for translating between objects and byte sequences
	// that avoid many of the dangers of Java serialization, while offering numerous
	// advantages, such as cross-platform support, high performance, a large
	// ecosystem of tools, and a broad community of expertise. In this book, we
	// refer to these mechanisms as cross-platform structured-data representations.

	// The leading cross-platform structured data representations are JSON [JSON]
	// and Protocol Buffers, also known as protobuf [Protobuf]. JSON was designed by
	// Douglas Crockford for browser-server communication, and protocol buffers were
	// designed by Google for storing and interchanging structured data among its
	// servers. Even though these representations are sometimes called
	// language-neutral, JSON was originally developed for JavaScript and protobuf
	// for C++; both representations retain vestiges of their origins.

	// If you can’t avoid Java serialization entirely, perhaps because you’re
	// working in the context of a legacy system that requires it, your next best
	// alternative is to never deserialize untrusted data

	// If you can’t avoid serialization and you aren’t absolutely certain of the
	// safety of the data you’re deserializing, use the object deserialization
	// filtering added in Java 9 and backported to earlier releases
	// (java.io.ObjectInputFilter).

	// Unfortunately, serialization is still pervasive in the Java ecosystem. If you
	// are maintaining a system that is based on Java serialization, seriously
	// consider migrating to a cross-platform structured-data representation, even
	// though this may be a time-consuming endeavor. Realistically, you may still
	// find yourself having to write or maintain a serializable class. It requires
	// great care to write a serializable class that is correct, safe, and
	// efficient. The remainder of this chapter provides advice on when and how to
	// do this.

	// In summary, serialization is dangerous and should be avoided. If you are
	// designing a system from scratch, use a cross-platform structured-data
	// representation such as JSON or protobuf instead. Do not deserialize untrusted
	// data. If you must do so, use object deserialization filtering, but be aware
	// that it is not guaranteed to thwart all attacks. Avoid writing serializable
	// classes. If you must do so, exercise great caution.
}
