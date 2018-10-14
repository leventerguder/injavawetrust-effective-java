package chapter07.item44;

public class Item44Notes {

	// Item 44 : Favor the use of standard functional interfaces

	// java.util.function package provides a large collection of standard
	// functional interfaces for your use.

	// If one of the standard functional interfaces does the job, you should
	// generally use it in preference to a purpose-built functional interface.

	// There are forty-three interfaces in java.util.Function.

	// The Predicate interface represents a function that takes an argument and
	// returns a boolean.

	// The Function interface represents a function whose argument and return types
	// differ.

	// The Supplier interface represents a function that takes no arguments and
	// returns (or “supplies”) a value.

	// Consumer represents a function that takes an argument and returns nothing,
	// essentially consuming its argument

	// Predicate<T> boolean test(T t)
	// Function<T,R> R apply(T t)
	// Supplier<T> T get()
	// Consumer<T> void accept(T t)
	// UnaryOperator<T> T apply(T t)
	// BinaryOperator<T> T apply(T t1 , T t2)

	// There are also three variants of each of the six basic interfaces to operate
	// on the primitive types int, long, and double.

	// IntPredicate boolean test(int value)
	// LongPredicate boolean test(long value)
	// DoublePredicate boolean test(double value)

	// IntBinaryOperator int applyAsInt(int left , int right)
	// LongBinaryOperator long applyAsLong(long left, long right)
	// DoubleBinaryOperator double applyAsDouble(double left , double right)

	// There are nine additional variants of the Function interface, for use when
	// the result type is primitive.

	// if the both the source and result types are primitive , prefix Function with
	// SrcToResult,
	// for example LongToIntFunction

	// LongToIntFunction int applyAsInt(long value)
	// LongToDoubleFunction double applyAsDouble(long value)
	// IntToLongFunction
	// IntToDoubleFunction
	// DoubleToIntFunction
	// DoubleToLongFunction

	// There are two-argument versions of the three basic functional interfaces for
	// which it makes sense to have them:

	// BiPredicate<T,U>
	// BiFunction<T,U,R>
	// BiConsumer<T,U>

	// There are also BiFunction variants returning the three relevant primitive
	// types:
	// ToIntBiFunction<T,U> int applyAsInt(T t, U u)
	// ToLongBiFunction<T,U> long applyAsLong(T t, U u)
	// ToDoubleBiFunction<T,U> double applyAsDouble(T t, U u)

	// There are two-argument variants of Consumer that take one object reference
	// and one primitive type:

	// ObjDoubleConsumer<T> void accept(T t, double value)
	// ObjIntConsumer<T> void accept(T t, int value)
	// ObjLongConsumer<T> void accept(T t, long value)

	// there is the BooleanSupplier interface, a variant of
	// Supplier that returns boolean values.

	// Don’t be tempted to use basic functional interfaces with
	// boxed primitives instead of primitive functional interfaces.

	// While it works, it violates the advice of Item 61, “prefer primitive types to
	// boxed primitives.” The performance consequences of using boxed primitives for
	// bulk operations can be deadly.
	
	// Always annotate your functional interfaces with the
	// @FunctionalInterface annotation
	
	// In summary, now that Java has lambdas, it is imperative that you design
	// your APIs with lambdas in mind. Accept functional interface types on input
	// and return them on output. It is generally best to use the standard interfaces
	// provided in java.util.function.Function, but keep your eyes open
	// for the relatively rare cases where you would be better off writing your own
	// functional interface.
}
