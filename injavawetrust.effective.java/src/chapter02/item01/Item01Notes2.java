package chapter02.item01;


public class Item01Notes2 {

}

// The main limitation of providing only static factory methods is that classes without public or protected constructors cannot be subclassed.
// It is impossible to subclass any of the conveninence implementation classes in the Collections Framework.
// Arguably this can be a blessing in disguise because it encourages programmers to use composition instead of inheritance and is required for immutable types.

// A second shortcoming of static factory methods is that they are hard for programmers to find.

// Here are some  common names for static factory methods.

// from 
// A type-conversion method that takes a single parameter and returns a corresponding instance of this type , 

// Date d = Date.from(instant)

// of
// An aggregation method that takes multiple parameters and returns an instance of this type that incorporates them, for example
// Set<Rank> faceCards = Enumset.of(JACK, QUEEN, KING);

// valueOf
// A more verbose alternative to from and of

// BigInteger.valueOf

// instance or getInstance
// StackWalker luke = StackWalker.getInstance(options); 

// create or newInstance
// Object newArray = Array.newInstance(componentType, length)

// getType
// Like getInstance, but used if the factory method is in a different class
// Type is the type of obejct returned by the factory method

// FileStore fs = FileStore.getFileStore(path);

// newType
// Like newinstance but used if the factory method is in different class.
// Type is the of object returned by the factory method.

// BufferedReader br = Files.newBufferedReader(path);

// type
// A concise alternative to getType and newType
// List<Complaint> litany = Collections.list(legacyLitany);

// In summary , static factory methods and public constructors both have their uses , and it pays to understand their relative merits.
// Often static factories are prefeable, so avoid the reflex to provide public constructors without first considering static factories.