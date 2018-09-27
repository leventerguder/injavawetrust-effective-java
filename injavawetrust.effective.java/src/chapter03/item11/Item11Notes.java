package chapter03.item11;

public class Item11Notes {

}

// #####
// Always override hashCode when you override equals

// You must override hashCode in every class that overrides equals
// If you fail to do so , your class will violate the general contract for hashCode
// which will prevent it from unfunctioning properly in collections such as HashMap and HashSet

// When the hashCode method is invoked on an object repeatedly during an execution of an application
// it must consistently return the same value , provided no information used in equals comparisons is modified.

// if two objects are equal according to equals (Object) method
// then calling hashCode on the two objects must produce the same integer result.

// if two objects are unequal according to the equals (Object) method ,
// it is not required that calling hashCode on each of the objects must produce distinct results.

// The key provision that is violated when you fail to override hashCode

// A good hash function tends to produce unequal hash codes for unequal instances.

// Here is a simple recipe :

// 1 - Declare an int variable named result , and initialize it to the hash code c for the first significant field in your object
// as computed in step 2.a

// 2 - For every remaining signifcant field f in your object do the following:
// -- a - Compute an int hash code c for the field
///      i - if the field is of a primitive tye , compute Type.hashCode(f) , where Type is the boxed primitive class corresponding to f's type
//      ii - if the field is an object reference and this class's equals method compares the field by recursively invoking equals , recursively invoke hashCode on the field.
// if a more complex comparison is required , compute a "canonical represenattion"for this field and invoke hashCode on the canonical representation.
// If the value of the field is null, use 0 (or some other constant, but 0 is traditional).
//      iii. If the field is an array, treat it as if each significant element were a separate field. 
// That is, compute a hash code for each significant element by applying these rules recursively,
// and combine the values per step 2.b. If the array has no significant elements, use a constant, preferably not 0. 
// If all elements are significant, use Arrays.hashCode.
// 
//-- b. Combine the hash code c computed in step 2.a into result as follows: result = 31 * result + c;
// 3. Return result.

// When you are finished writing the hashCode method, ask yourself whether equal instances have equal hash codes. 
// Write unit tests to verify your intuition (unless you used AutoValue to generate your equals and hashCode methods, in which case you can safely omit these tests). 
// If equal instances have unequal hash codes, figure out why and fix the problem.

// TODO 
// If you have a bona fide need for hash functions less likely to produce collisions, see Guava’s com.google.common.hash.Hashing

// The Objects class has a static method that takes an arbitrary number of objects and returns a hash code for them. 
// This method, named hash, lets you write one-line hashCode methods whose quality is comparable to those written according to the recipe in this item. 
// Unfortunately, they run more slowly because they entail array creation to pass a variable number of arguments, as well as boxing and unboxing 
// if any of the arguments are of primitive type. This style of hash function is recommended for use only in situations where performance is not critical.

// If a class is immutable and the cost of computing the hash code is significant, 
// you might consider caching the hash code in the object rather than recalculating it each time it is requested.

// #####
// Do not be tempted to exclude significant fields from the hash code computation to improve performance. 
// While the resulting hash function may run faster , its poor quality may degrade hash tables' performance to the point where they become unusable.
// In particular , the hash function may be confronted with a large collection of instances that differ mainly in regions you have chosen to ignore.
// if this happens the hash function will map all these instances to a few hash codes , and programs that should run in linear time will instead run in quadratic time
//

//#####
// Dont provide a detailed specification for the value returned by hashCode , so clients cant reasonably depend on it : this give you the flexibility to change it.

// Many classes in the Java libraries , such as String and Integer , specify the exact value returned by their hashCode method as a function of the instance value.
// This is not a good idea but a mistake that we are forced to live with : It impedes the ability to improve the hash function in future releases. 

// In summary, you must override hashCode every time you override equals, or your program will not run correctly. 
// Your hashCode method must obey the general contract specified in Object and must do a reasonable job assigning unequal hash codes to unequal instances. 
// This is easy to achieve, if slightly tedious, using the recipe on page 51. 
// As mentioned in Item 10, the AutoValue framework provides a fine alternative to writing equals and hashCode methods manually, 
// and IDEs also provide some of this functionality.
