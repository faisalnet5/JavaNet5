package com.java.overloadride;

/*
OVERLOADING: If a Class is having multiple methods by same name but different parameters, it is then known as Method Overloading

Two ways we can do Method Overload in Java: (a) By changing number of ARGUMENTS, (b) By Changing the data type
Remember: Method Overloading is not possible by changing the return type of the Method because that will create more ambiguity

*/

public class FunOverloading {
	
	//Related to Example-1: changing number of ARGUMENTS
	void sum (int a, int b){
		System.out.println("Method-1 (2 PARAMETERS) SUM is: " +(a+b));
	}
	void sum (int a, int b, int c){
		System.out.println("Method-2 (3 PARAMETERS) SUM is: " +(a+b+c));
	}
	
	//Related to Example-2: changing TYPE of ARGUMENTS
	void minus(int a, int b){
		System.out.println("Method-3 (2 different Data Types) Minus is: " + (a-b));
	}
	void minus(double a, double b){
		System.out.println("Method-4 (2 different Data Types) Minus is: " + (a-b));
	}
	
	//Related to Example-3: TypePromition with ARGUMENTS 
	void typePromition(int a, long b){
		System.out.println("Method-5 (TypePromotion) Result is: " + (a+b));
	}
	void typePromition(int a, int b, int c){
		System.out.println("Method-6 (TypePromotion) Result is: " + (a+b+c));
	}
	
	public static void main(String[] args) {
		FunOverloading test_overload = new FunOverloading();	
		
		// Example-1: changing number of ARGUMENTS
		test_overload.sum(2, 3);
		test_overload.sum(2, 3, 2);
		
		System.out.println("----------------------------------------------");
		
		// Example-2: changing TYPE of ARGUMENTS
		test_overload.minus(12.5, 1.5);
		test_overload.minus(12, 2);
		// Notice the sequence of executing these two methods from Console output
		
		System.out.println("----------------------------------------------");
		
		//Example-3: TypePromition with ARGUMENTS 
		test_overload.typePromition(20, 10);		//Notice second ARGUMENT, which is 'int'. Is there any Method with same signature? 
													//What will happen then? (Answer: Second 'int' literal will be promoted to 'long')
		test_overload.typePromition(20, 20, 20);
		//Remember: How TypePromotion is working! One type is not de-promoted implicitly (Example: 'double' cannot be depromoted to any type implicitly)
		
		System.out.println("----------------------------------------------");
		
		//Extra-1: Can we overload main() method? (Answer: Yes)
		System.out.println("First: Main() method invoke from itself");
		main(10);
	}
	
	//Related to Extra-1: Overloading Main()
	private static void main(int pass_parameter) {
		System.out.println("Second: Main() method invoke from outside, where passing value is: " + pass_parameter);
	}
}
	
// Remember: We cannot Override Static Method which also means we cannot Override Main method but we can Overload ;)
// Type Promotion Rules (Widening conversions): 
//		char->int
//		byte->short->int->long->float->double
