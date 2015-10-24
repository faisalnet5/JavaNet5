package com.java.passbyvalue;

class PassByValue{
	
	//Element-1: Variables
	private String first_name;
	
	//Element-2: Methods (Getter & Setter)
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	//Element-3: Constructor (Signature)
	public PassByValue(String first_name) {
		this.first_name = first_name;
	}
	
}

public class FunValueRef {

	public static void main(String[] args) {
		/* Note: Good News! Good News! Good News!
		   -------------------------------------
		   Java Guru says that 'Everything in Java is 'Pass-by-value'. There is no such thing as 'Pass-by-reference' 
		   Dammit!
		*/
		
		PassByValue pass_by_value = new PassByValue("Nancy");  
		// Suppose Computer located our created image location at 780324ff (Hash Value)
		// Question is do we know the real location of our Object 'PassByValue'?
		
		System.out.println("Check 'PassByValue' Object Hashvalue-1: " + pass_by_value);
		System.out.println("Check 'PassByValue' Object Variable Value-1: " + pass_by_value.getFirst_name());
		
		callingMethod(pass_by_value); //Passing a copy of the whole object and it's elements
		
	}

	private static void callingMethod(PassByValue pass_by_value) {
		
		System.out.println("----------------------------------------------");
		
		pass_by_value.setFirst_name("Sara");			//Line-a
		
		// We are dealing with the same copy (Memory location: 780324ff)-right?
		System.out.println("Check 'PassByValue' Object Hashvalue-2: " + pass_by_value);  	
		System.out.println("Check 'PassByValue' Object Variable Value-2: " + pass_by_value.getFirst_name());
		
		System.out.println("----------------------------------------------");
		
		pass_by_value = new PassByValue("Lisa");  	//Line-b
		// We just created a new copy of our Object 'PassByValue' and kept it at 16721ee7 (Hash Value)
		// So new location-right? But that new location is for holding our newly created Object Image? 
		// Do we still know where is our original Object 'PassByValue' located?
		
		System.out.println("Check 'PassByValue' Object Hashvalue-3: " + pass_by_value);
		System.out.println("Check 'PassByValue' Object Variable Value-3: " + pass_by_value.getFirst_name());
		
		System.out.println("----------------------------------------------");
		
		pass_by_value.setFirst_name("Monica");			//Line-c
		System.out.println("Check 'PassByValue' Object Hashvalue-4: " + pass_by_value);
		System.out.println("Check 'PassByValue' Object Variable Value-4: " + pass_by_value.getFirst_name());
		
		/*
		
		Carefully observe what is happening here:
		------------------------------------------------------
		@Line-a: 'pass_by_value' is changing the first_name (to 'David') of our Real Object through it's Image Copy (located at 780324ff (Hash Value))
		  	
		@Line-b: A new 'PassByValue' Object's Image copy is created, lets say it's holding memory address is at 16721ee7 (Hash Value). 
		
		@Line-c: Finally holding our newly created Object copy which image is located at 16721ee7 (Hash Value) and then changing first_name to 'Field'
			     
	    >> WHICH MEANS: YOU CAN ASSIGN A POINTER, PASS THE POINTER TO A METHOD, FOLLOW THE POINTER IN THE METHOD AND CHANGE THE DATA THAT 
		   WAS POINTED TO. HOWEVER, YOU CANNOT CHANGE WHERE THAT POINTER POINTS. WHICH NEGATES THE CONCEPT OF 'PASS-BY-REFERENCE' IN PROGRAMMING WORLD!
		
		*/
	}
}
