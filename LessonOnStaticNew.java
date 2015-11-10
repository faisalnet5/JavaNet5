package com.personal.javanet5;

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
	
	//Related to Example-2 (Total 3 Concepts)
	
	//Concept-(a): ACCESSING FROM STATIC -> TO STATIC 		  | OK
	static void staticMethod(String first_name, String last_name){	//Accepting two PARAMETERS
		System.out.println("Static Method Example > First Name: " + first_name + ", Last Name: " + last_name);
	}
	
	//Concept-(b): ACCESSING FROM NON-STATIC -> TO STATIC 	| OK
	void testMethodTwo(){
		staticMethod("Pola", "Jhones");
	}
	
	//Concept-(c): ACCESSING FROM STATIC -> TO NON-STATIC 	| NOT OK
	/*void testMethodOne(String first_name, String last_name){
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
	static class StaticClass{
		static String str="String inside Static Class";
	}

	@SuppressWarnings("static-access") //Why using this Tag?
	public static void main(String[] args) {

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
		System.out.println("\nObject 1 Hash value is: " + object1);
		System.out.println("static 'Count' variable value for object1: "
				+ object1.count);

		System.out.println("Object 2 Hash value is: " + object2);
		System.out.println("static 'Count' variable value for object2: "
				+ object2.count);
		
		/*
		As you can see that we are accessing Static element 'count' of Increment Object via creating instance (using 'new' keyword)
		Which is a VERY BAD PROGRAMMING PRACTICE but we are doing here just to proof that our two instances of Increment Object, 
		'object1' and 'object2' are different but they are carrying over any change(s) made on out targeted Static element 'count'
		
		BEST PRACTICE: Normally any object's Static element (whether that Object resides in the 'same package, same file' or 'same package, different 
		file' or 'different package, different file') we can access directly by using Class/Object name with DOT (.) operator as follows:
		*/
		System.out.println("\n> Accessing STATIC element of Increment Object: " + Increment.count);

		System.out.println("-----------------------------------");

		//Example-2: Static method (Total 3 Concepts) | Same applies to Variables
		
		//Concept-(a): ACCESSING FROM STATIC -> TO STATIC 		  | OK
		staticMethod("David", "Willson");  //Passing ARGUMENTS
		
		//Concept-(b): ACCESSING FROM NON-STATIC -> TO STATIC 	| OK
		LessonOnStatic object3 = new LessonOnStatic();	//We are doing this just to invoke/call 'testMethodTwo' method
		object3.testMethodTwo();
		
		//Concept-(c): ACCESSING FROM STATIC -> TO NON-STATIC 	| NOT OK
		//testMethodOne("David_test", "Wilson");
		
		/*
		 NOTE: 
		  		Concept-(a): ACCESSING FROM STATIC -> TO STATIC 		  | OK
		  		Concept-(b): ACCESSING FROM NON-STATIC -> TO STATIC 	| OK
		 		Concept-(c): ACCESSING FROM STATIC -> TO NON-STATIC 	  | NOT OK
		 */
			
		System.out.println("-----------------------------------");
		
		//Example-3: Static Block concept
		System.out.println("Country Name: " + country_name + ", Country Population: " + country_population);
		
		System.out.println("-----------------------------------");
		
		//Example-4: Static class concept (key word is 'nested' class). We can access 'nested' class's Static element(s) as follows
		System.out.println("TEST STATIC CLASS: " + StaticClass.str);

	}
}
