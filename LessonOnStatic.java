package com.java.faisal;

//Related to STATIC: In File Object but outside the Main Class, which we will access 
class Increment {
	
	//=========  Element-1: Variable Section
	static int count = 0; 						// Remove the keyword 'static' and see the difference in program output
	
	//=========  Element-2: Method Section
	public int doIncrement() {					// Related to STATIC, Example-1
		return ++count;
	}

	//=========  Element-3: Constructor Section
	public Increment() {
		super();								// invokes the super class method
	}
	
	//Remove this comment and see what is happening
	/*@Override
	public String toString() {
		return ("Hello World!");
	}*/
}

public class LessonOnStatic {
	
	//Related to Example-2
	static void staticMethod(String first_name, String last_name){	//Accepting two PARAMETERS
		System.out.println("Static Method Example > First Name: " + first_name + ", Last Name: " + last_name);
	}
	
	/*void testMethod(String first_name, String last_name){
		System.out.println("Static Method Example > First Name: " + first_name + ", Last Name: " + last_name);
	}*/
	
	//Related to Example-3	
	static String country_name;
	static String country_population;
	
	static{
		country_name = "USA";
		country_population = "316.1 million (2013)";
	}
	
	//Notice How these static block can override the previous static block info
	static{
		country_name = "BANGLADESH";
		country_population = "156.6 million (2013)";
	}
	
	//Related to Example-4 (Always 'nested' Object/Class can have this static keyword)
	static class staticClass{
		static String str="String inside Static Class";
	}

	@SuppressWarnings("static-access") //Why using this Tag?
	public static void main(String[] args) {

		// ======================== STATIC ========================

		// Example-1 (a.1): Static Variable- All instances or Objects of the
		// same class share a single copy of Static Variable(s).
		// So if any one do any change to that variable, other instance call
		// will reflect that change.

		Increment object1 = new Increment(); // First Instance Call
		System.out.println("object1 Value: " + object1.doIncrement());

		Increment object2 = new Increment(); // Second Instance Call
		System.out.println("object2 Value: " + object2.doIncrement());
		
		// Example-1 (a.2): Static Variable- All instances or Objects of the
		// same class share a single copy of Static Variable(s).
		// So will display the same value of your defined static 'count'
		// variable.
		System.out.println("Object 1 Hash value is: " + object1);
		System.out.println("static 'Count' variable value for object1: "
				+ object1.count);

		System.out.println("Object 2 Hash value is: " + object2);
		System.out.println("static 'Count' variable value for object2: "
				+ object2.count);

		System.out.println("-----------------------------------");

		//Example-2: Static method concept
		staticMethod("David", "Willson"); //Passing ARGUMENTS
		//testMethod("David_test", "Willson");
			
		System.out.println("-----------------------------------");
		
		//Example-3: Static Block concept
		System.out.println("Country Name: " + country_name + ", Country Population: " + country_population);
		
		System.out.println("-----------------------------------");
		
		//Example-4: Static class concept (key word is 'nested' class)
		System.out.println("TEST STATIC CLASS: " + staticClass.str);

	}
}
