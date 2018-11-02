package chapter12.item87.examples;

import java.io.Serializable;

// Good candidate for default serialized form
public class Name implements Serializable {
	/**
	 * Last name. Must be non-null.
	 * 
	 * @serial
	 */
	private final String lastName;

	/**
	 * First name. Must be non-null.
	 * 
	 * @serial
	 */
	private final String firstName;
	/**
	 * Middle name, or null if there is none.
	 * 
	 * @serial
	 */

	private final String middleName;

	public Name(String lastName, String firstName, String middleName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

}
