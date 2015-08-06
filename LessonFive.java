package com.personal.javanet5;

//JavaNet5-LessonFive: Variables- Static & Final

//Related to STATIC: In File Object but outside the Main Class, which we will access 
class Increment{
	static int count = 0; //Remove the keyword 'static' and see the difference in program output
	
	//Related to STATIC, Example-1
	public int doIncrement(){
		return ++count;
	}
}

//Related to FINAL: In File Object but outside the Main Class, which we will access 
class FinalDetails{
	
	//Related to FINAL: Example-1
	final int number =250; //Remove the keyword 'final' and see the difference
	
	public void finalVariable(){
		//Try to assign number variable value = 300 
		//number = 300; 
		System.out.println("> finalVariable() got executed!");
	}
	
	//Related to FINAL: Example-2: Defining method 'finalMethod' as final, which we will try to override later
	
	final void finalMethod(){
		System.out.println("> finalMethod() got executed! Didn't Override");
	}
	
	//Related to Extra-1 (Blank/Uninitialized Final variable)
	final int myNumber;	//Defining one Blank/Uninitialized Final variable
	
	FinalDetails(){
		myNumber = 300;
		System.out.println("Newly initialized Final variable 'myNumber' is: " + myNumber);
	}
	
	//Related to Extra-2 (Final Parameter)
	int finalParameter(int n){  //Add 'final' in front of your method parameter and see what happen
		n = n + 2;
		return n*n*n;
	}
}

//Related to FINAL: In File Object but outside the Main Class, which we will access 
final class OneFinalClass{	//Can you Inherit/Extends this Final Class from Main?
	public void printLine(){
		System.out.println("Can you 'Extends' me ;) ");
	}
}

public class LessonFive extends FinalDetails{     //Related to FINAL, Example-3: Add 'extends OneFinalClass'
	
	//Related to Example-2: Object inside the same Class (also called extended object), which is STATIC and we will access 
	//						that in Main method
	public static void staticMethod(String first_name, String last_name){	//Accepting two PARAMETERS
		System.out.println("Static Method Example > First Name: " + first_name + ", Last Name: " + last_name);
	}
	
	//Related to Example-3: Static Class
	static class staticClass{
		static String str="String inside Static Class";
	}
	
	//Related to Example-4: Static Block (A class can have multiple Static Block, which will be executed in the same sequence 
	//						in which they have been written into the program)
	static String country_name;
	static String country_population;
	
	static{
		country_name = "USA";
		country_population = "316.1 million (2013)";
	}
	
	static{
		country_name = "BANGLADESH";
		country_population = "156.6 million (2013)";
	}
	
	//Related to FINAL: Example-2, Trying to override different object's final method in this current object/class
	//Note: If in other class (outside your main Class) 'finalMethod' method is defined as FINAL then remove the following
	//      comment out and see what kind of error you are getting.
	
	/*
	void finalMethod(){		//Comment out this part and see what exception you get!
		System.out.println("Trying to Override finalMethod()");
	}
	*/
	
	@SuppressWarnings("static-access") //Why using this Tag?
	public static void main(String[] args) {
		
	//Note: STATIC and FINAL keywords are in Java to restrict the user. They both work in many different contexts such as 
	// 		'variable', 'method', 'class' and 'static block'
		
//=============================================  STATIC  ====================================================
		
		//Example-1 (a.1): Static Variable- All instances or Objects of the same class share a single copy of Static Variable(s).
		//				   So if any one do any change to that variable, other instance call will reflect that change.
		
		Increment object1 = new Increment();	//First Instance Call
		System.out.println("object1 Value: " + object1.doIncrement());
		
		Increment object2 = new Increment();	//Second Instance Call
		System.out.println("object2 Value: " + object2.doIncrement());
		
		//Example-1 (a.2): Static Variable- All instances or Objects of the same class share a single copy of Static Variable(s).
		//				   So will display the same value of your defined static 'count' variable.
		System.out.println("Object 1 Hash value is: " + object1);
		System.out.println("static 'Count' variable value for object1: " + object1.count);
		
		System.out.println("Object 2 Hash value is: " + object2);
		System.out.println("static 'Count' variable value for object2: " + object2.count);
		
		//Example-2: Static Method- Normally we need an instance object to access any method or variable inside or outside the 
		//			 class. However, in order to access 'static method' we don't need any instance object :)		
		staticMethod("David", "Willson"); //Passing ARGUMENTS
		
		//Note: Try to do the same with NON-STATIC Method
		
		//Example-3: Static Class- A Class can be made STATIC only if it is a Nested Class. And Nested Static Class can be 
		//			 accessed without having an object of outer Class
		System.out.println("TEST STATIC CLASS: " + staticClass.str);
		
		//Example-4: Static Block- Static Block is mostly used for changing the default values of Static Variables. This Block
		//			 gets executed when the class is loaded in the memory
		System.out.println("Country Name: " + country_name + ", Country Population: " + country_population);
		
		//Note: See how one Static Block override other Static Block

//=============================================  FINAL  ====================================================
		
		//Example-1: Final Variable- You cannot change a final variable's value once that is assigned.
		FinalDetails final_variable = new FinalDetails();
		final_variable.finalVariable();
		
		//Example-2: Final Method- After inheritance, cannot override Final Method
		//This is normally we do to access object-right? 
		//Only difference is you are creating an instance of your current class/object
		LessonFive final_method = new LessonFive();		
		final_method.finalMethod();
		
		//Note: So, remember that Final Method is inherited but you cannot override it
		
		//Example-3: Final Class- You cannot 'EXTENDS' Final Class from your Main?
			
//======================> EXTRA FEW EXAMPLES ON FINAL <=========================
		
		//Extra-1: What is Blank/Uninitialized Final Variable? Can we Initialize?
		new FinalDetails();		//What it will do?
		
		//Note: A final variable that is not initialized at the time of declaration is knows as Blank/Uninitialized Final variable
		//And Yes! we can initialize it later only through Constructor
		
		//Extra-2: What is Final Parameter?
		FinalDetails final_parameter = new FinalDetails();
		System.out.println("After passing 10, total becomes: " + final_parameter.finalParameter(10));
		
		//Note: If you declare any parameter as final, you cannot change the value of it.
	}

}

/* 		Tips:
 *      ------------------
 * 		1) 	More on @SuppressWarnings: Excluding warnings using @SuppressWarnings
 * 		2) 	Remember that you can call static methods direct or using class name as well and static methods can't use non-static
 * 			(regular) methods
 * 		3)	Keywords for Final: (a)	Stop value change, (b) Stop method overriding and (c) Stop class inheritance
 * 		4)	You cannot make a Constructor Final because Constructor is never inherited
 */