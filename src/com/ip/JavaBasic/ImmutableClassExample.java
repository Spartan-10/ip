package com.ip.JavaBasic;

/*
 * Immutable class --> Once an Object is created, we cannot change its content.
 * Ex: All wrapper classes and String class
 * 
 * Rules to create Immutable class
 * 1. The class must be declared as final (so that child classes can't be created)
 * 2. Data Members in the class must be declared as final (so that we can't change the value of it after object creation)
 * 3. A parameterized constructor
 * 4. Getter method for all the variables in it.
 * 5. No Setters(To not have option to change the value of the instance variable)
 */

public final class ImmutableClassExample {

	final String panCardNumber;
	
	public ImmutableClassExample(String panCardNumber) {
		this.panCardNumber= panCardNumber;
	}
	
	public String getPanCardNumber() {
		return panCardNumber;
	}
}
