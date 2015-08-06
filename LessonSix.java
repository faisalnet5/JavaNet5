package com.personal.javanet5;

//JavaNet5-LessonSix:	Pass-by-value vs Pass-by-reference 
//				        Overloading vs Overriding

//Related to Pass-by-value vs Pass-by-reference: In File Object but outside the Main Class, which we will access 
class PassByValue{
	
	private String first_name;	//What will happen if we define this instance variable as 'static'

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	//Constructor
	public PassByValue(String first_name) {
		this.first_name = first_name;
	}
}

//Related to Overriding, Example-1: In File Object but outside the Main Class, which we will access 
class VehicleParent{
	void run(){
		System.out.println("====> I am Parent Vehicle");
	}
}

public class LessonSix extends VehicleParent{		//Using 'extends' only when talking about Overriding/ Overloading
	
	//Related to Method Overriding, Example-2:
	@Override	//Compile-time reminder that the intention of the method is to override a parent method
	void run(){
		System.out.println("========> I am a car, Chile Vehicle");
		super.run();
	}

	//Related to Method Overloading, Example-1: changing number of ARGUMENTS
	void sum (int a, int b){
		System.out.println("Method-1 (2 PARAMETERS) SUM is: " +(a+b));
	}
	void sum (int a, int b, int c){
		System.out.println("Method-2 (3 PARAMETERS) SUM is: " +(a+b+c));
	}
	
	//Related to Method Overloading, Example-2: changing data type of ARGUMENTS
	void minus(int a, int b){
		System.out.println("Method-3 (2 different Data Types) Minus is: " + (a-b));
	}
	void minus(double a, double b){
		System.out.println("Method-4 (2 different Data Types) Minus is: " + (a-b));
	}
	
	//Related to Method Overloading, Example-3: TypePromition with ARGUMENTS 
	void typePromition(int a, long b){
		System.out.println("Method-5 (TypePromotion) Result is: " + (a+b));
	}
	void typePromition(int a, int b, int c){
		System.out.println("Method-6 (TypePromotion) Result is: " + (a+b+c));
	}
	
	public static void main(String[] args) {
		
//=============================  Pass-by-value vs Pass-by-reference  ========================================

		//Note: Good News! Good News! Good News!
		//Java Guru says that 'Everything in Java is 'Pass-by-value'. There is no such thing as 'Pass-by-reference' Dammit!
		
		PassByValue pass_by_value = new PassByValue("Rinku");
		
		System.out.println("Check 'PassByValue' Object Hashvalue-1: " + pass_by_value);
		System.out.println("Check 'PassByValue' Object Variable Value-1: " + pass_by_value.getFirst_name());
		
		callingMethod(pass_by_value);	//Passing a copy of the whole object. 
		//Which also means, we essentially passing the address of the created 'PassByValue' object to the callingMethod() method.
		//Suppose the 'PassByValue' object resides at memory address 42. This means we pass a copy of 42 to the method.	
		
		//Do you think after calling callingMethod(), the PassByValue Object will change? Verify...
		System.out.println("Check 'PassByValue' Object Hashvalue after all crap: " + pass_by_value);
		System.out.println("Check 'PassByValue' Object Variable Value - after all crap: " + pass_by_value.getFirst_name());
			
//=================================  Overriding vs Overloading   =================================
		
		/*		OVERRIDING		*/
		
		//Note: Overriding- means having two methods with the same method name and parameters (also called method signatures)
		//					One of the methods is in the PARENT Class and the other is in the CHILD Class. Overriding allows a
		//					Child class to provide a specific implementation of a method that is already provided from its 
		//					Parent CLass.
		
		//Example-1: Basic Overriding
		VehicleParent myObject_1 = new VehicleParent();
		myObject_1.run(); 	//Notice which method is executing here
				
		//Example-2: Overriding with dynamic Ploymorphism
		VehicleParent myObject_2 = new LessonSix();	//Can u change this object sequencing?
		myObject_2.run(); 	//Now which run() will be executed?
		
		/*		OVERLOADING		*/
		
		//Note: Overloading-If a Class have multiple methods by same name but different parameters, it is then known as Method Overloading
		//      Two ways we can do Method Overload in Java: (a) By changing number of ARGUMENTS, (b) By Changing the data type
		//		Method Overloading is not possible by changing the return type of the Method because that will create more ambiguity
		
		//Example-1: Method Overloading by changing number of ARGUMENTS
		LessonSix testOverloading_arg = new LessonSix();	//Why we are creating 'LessonSix' object instance
		
		testOverloading_arg.sum(2, 3); 		//First call with 2 ARGUMENTS
		testOverloading_arg.sum(2, 3, 2);	//Second call with 3 ARGUMENTS
		
		//Example-2: Method Overloading by changing data type of ARGUMENTS
		LessonSix testOverloading_type = new LessonSix();
		
		//Notice the sequence of executing these two methods from Console output
		testOverloading_type.minus(12.5, 1.5); 		
		testOverloading_type.minus(12, 2);
		
		//Example-3: Method Overloading with TYPEPROMOTION (More on TypePromotion u will find below Tips)
		LessonSix testOverloading_typepromotion = new LessonSix();
		
		testOverloading_typepromotion.typePromition(20, 20); //Notice second ARGUMENT, which is 'int'. Is there any Method with same signature? 
															 //What will happen then? (Answer: Second 'int' literal will be promoted to 'long')
		testOverloading_typepromotion.typePromition(20, 20, 20);
		
		//Remember: How TypePromotion is working! One type is not de-promoted implicitly (Example: 'double' cannot be depromoted to any type implicitly)
		//			Memorize the TypePromotion figure ;)
		
//======================> EXTRA EXAMPLE ON METHOD OVERLOADING <=========================
		
		//Extra-1: Can we overload main() method? (Answer: Yes)
		System.out.println("First: Main() method invoke from itself");
		main(10);
		
		//Remember: We cannot Override Static Method which also means we cannot Override Main method but we can Overload ;)
		
	}
	
	//Following Methods are outside of Main Method but inside the Main Class; Why outside the Main Method? (Answer: Lesson Five)
	
	//Related to Extra-1: Overloading Main()
	private static void main(int pass_parameter) {
		System.out.println("Second: Main() method invoke from outside, where passing value is: " + pass_parameter);
	}
	
	//Related to Pass-by-value
	public static void callingMethod(PassByValue pass_by_value) {
		
		pass_by_value.setFirst_name("David");			//Line-a
		System.out.println("Check 'PassByValue' Object Hashvalue-2: " + pass_by_value);
		System.out.println("Check 'PassByValue' Object Variable Value-2: " + pass_by_value.getFirst_name());
		
		pass_by_value = new PassByValue("Copper");  	//Line-b
		
		System.out.println("Check 'PassByValue' Object Hashvalue-3: " + pass_by_value);
		System.out.println("Check 'PassByValue' Object Variable Value-3: " + pass_by_value.getFirst_name());
				
		pass_by_value.setFirst_name("Field");			//Line-c
		System.out.println("Check 'PassByValue' Object Hashvalue-4: " + pass_by_value);
		System.out.println("Check 'PassByValue' Object Variable Value-4: " + pass_by_value.getFirst_name());
		
/*
		
Note: Carefully observe what is happening here:
------------------------------------------------------
@Line-a: 'pass_by_value' is followed to the PassByValue (the main object at 42)	that it needs to change it's first_name to 'David'
  	
@Line-b:  A new 'PassByValue' object is created, lets say it's memory address 74. We assign the parameter 'pass_by_value' to 74

@Line-c: 'pass_by_value' is followed to the PassByValue (the main object at 74)	that it needs to change it's first_name to 'Field'


WHICH MEANS: YOU CAN ASSIGN A POINTER, PASS THE POINTER TO A METHOD, FOLLOW THE POINTER IN THE METHOD AND CHANGE THE DATA THAT 
WAS POINTED TO. HOWEVER, YOU CANNOT CHANGE WHERE THAT POINTER POINTS

*/		
	}

}

/* 		Tips:
 *      ------------------
 * 		1) 	To make any name UPPERCASE, press Ctrl + Shift + X, and for lowercase, press Ctrl + Shift + Y
 */