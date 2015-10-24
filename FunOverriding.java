package com.java.overloadride;

/*
OVERRIDING: Means having two methods with the same method name and parameters (means same method signatures)

Scenario: Think, one of the methods is in the PARENT Class and the other is in the CHILD Class. Overriding allows a Child class to provide
a specific implementation of a method that is already provided from its Parent CLass by EXTENDING.

*/

// Parent Object
class VehicleParent{
	
	String color = "Blue";
	
	void run(){
		System.out.println("====> I am Parent Vehicle");
	}
}

// Child Object
public class FunOverriding extends VehicleParent{
	
	// Compile-time reminder that the intention of the method is to override a parent method
	void run(){
		System.out.println("I am a car, Chile Vehicle");
		// super.run();	
		// This is a new Java keyword 'SUPER' (Which is referring to Parent's element(s))
	}
	
	public static void main(String[] args) {
				
		// Example: Basic Overriding
		VehicleParent myObject_1 = new VehicleParent();
		myObject_1.run(); 	// Notice which method is executing here
		
		System.out.println("----------------------------------------------");
		
		VehicleParent myObject_2 = new FunOverriding();	
		myObject_2.run(); 	// Now which run() will be executed?
		System.out.println("Color is: " + myObject_2.color);
	}
}

// Tip(s): To make any name UPPERCASE, press Ctrl + Shift + X, and for lowercase, press Ctrl + Shift + Y
