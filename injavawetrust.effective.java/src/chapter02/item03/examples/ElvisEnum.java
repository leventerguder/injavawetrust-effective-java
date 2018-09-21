package chapter02.item03.examples;

public enum ElvisEnum {
	ISTANCE;
}

// It is more concise , provides the serialization machinery for free , and provides an 
// ironclad guarantee against multiple instantiation, even in the face of sophisticated serialization or reflection attacks.

// single element enum type is often the best way to implement a singleton.