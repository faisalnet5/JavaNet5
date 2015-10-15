package com.java.faisal;

//Related to FINAL: In File Object but outside the Main Class, which we will access 
class FinalDetails{
	
	//Related to Example-1
	final int number = 250; //Remove the keyword 'final' and see the difference
	
	public void finalVariable(){
		//Try to assign number variable value = 300 
		//number = 300; 
		System.out.println("> finalVariable() got executed!");
	}
	
	//Related to Example-2
	//final void finalMethod(){ 			//Remove the comment from this
    void finalMethod(){						//Comment this
		System.out.println("> finalMethod() got executed! Didn't Override");
	}
    
    //Related to Example-3
    final int myNumber; 					//This is called Blank/Uninitialized Final variable
    
    FinalDetails(){
    	myNumber = 300;
    	System.out.println("---------------------------------------------> Constructor just ran");
    }
    
    //Related to Example-4
    int finalParameter(final int n){ 	 	//Add 'final' in front of your method parameter and see what happen
		//n = n + 2;						//Comment out....try to change passing Parameter 'n' value. Can u do it?
		return n*n*n;
	}
}

//Related to Example-2: Through this SupportingClass we are trying to override parent's method
class SupportingClass extends FinalDetails{  
	//Doing Method Override
	void finalMethod(){
		System.out.println("> Yahoo....did Override");
	}
}  

public class LessonOnFinal {
	
	public static void main(String[] args) {
		
		// ======================== FINAL ========================
		
		//Example-1: Final Variable- You cannot change a final variable's value once that is assigned.
		FinalDetails final_variable = new FinalDetails();
		final_variable.finalVariable();
		
		//Example-2: Final Method- You cannot override Final Method
		SupportingClass final_method = new SupportingClass();	//This is normally we do to access object-right? 	
		final_method.finalMethod();								//Only difference is you are creating an instance of your current class/object
		
		//Notice the benefits of having 'extends' keywords
		System.out.println("Examples on having 'extends' keyword: " + final_method.number);
		
		//Example-3: Initialize Blank/Uninitialized Final variable(s) through Constructor
		FinalDetails blank_variable = new FinalDetails();
		System.out.println("Blank Variable's value is: " + blank_variable.myNumber);
		
		//Example-4: If any parameter is defined as FINAL, you can't change its value later
		FinalDetails final_parameter = new FinalDetails();
		System.out.println("After passing 10, total becomes: " + final_parameter.finalParameter(10));
	}
	
}
