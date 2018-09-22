package chapter02.item05;

public class Item05Notes {

}

// ####
// Prefer dependency injection to hardwriring resources

// Many classes depend on one or more underlying resources.

// Neither of these approaches is satisfactory , because they assume that there is only one dictionary worth using.
// In practice , each language has its own dictionary , and special dictionaries are used for special vocabularies.

// Static utility classes and singletons are inappropriate for classes whose behavior is parameterized by an underlying resource.

// What is required is the ability to support multiple instances of the class (in our example SpellChecker) 
// each of which uses the resource desired by the client(in our example , the dictionary)

// A simple pattern that satisfies this requirements is to pass the resource into constructor when creating a new instance.
// This is one form of dependency injection.
// The dictionary is a dependency of the spell checker and is injected into the spell checker when it is created.