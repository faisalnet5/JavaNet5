package com.personal.javanet5;

/*
INTERFACE: Always think that Interface is the BLUEPRINT of a CLass/Object. This is the only way in Java to achieve 'FULL ABSTRACTION'
Means, there can only be Abstract Methods in the Interface, but no Method Body. We always use Interface for (a) to achieve
Fully Abstraction, (b) we can support the functionality of multiple inheritance, (c) used to achieve loose coupling
		
REMEMBER: The Java Compiler adds 'public' and 'abstract' keywords before the interface method & public, static and final keywords
before data members. Means if u type 'void print();', for Interface compiler will convert that to 'public abstract void print();
and if u type 'int x = 10;', then compiler will convert that to 'public static final int x = 10;'
		
*/

//Related to Interface Example-1: Basic Interface Example
interface MySubject{							//Make Interface name always CAP First
	String subject = "Computer Science";		//Remove 'null' assignment. What happen? Why? Remember: any FINAL variable must be defined
	void subjectTitle();
	void subjectPublishYear();
}

//Related to Interface Example-2: Multiple Interfaces
interface SubjectType{
	String type="funnny :) ";
	void itsType();
}

//Related to Interface Example-3: Interface Inheritance
interface MyGame{
	abstract void favouriteGame();
}

interface WhyLike extends MyGame{
	void description();
}


public class FunWithInterface implements MySubject, SubjectType, WhyLike{
	
	//Implementing Interface Method - 1
	public void subjectTitle(){
		System.out.println("My Subject is: " + subject);	//Notice: Accessing subject directly
	}
	
	public void subjectPublishYear(){						//Try to comment out this Function and see what happen! 
		System.out.println("Subject publish year: 1973");
	}
	
	//Implementing Interface Method - 2
	public void itsType(){
		System.out.println("Subject type is: " + type);
	}
	
	//Implementing Interface Method - 3
	public void favouriteGame(){							//Try to comment out this Function and see what happen! 
		System.out.print("My Favorite game is Cricket !!! ");
	}
	
	public void description(){
		System.out.println("Thats really Exciting ;)");
	}
		
	public static void main(String[] args) {
		
		//Example-1: Basic Interface Example
		FunWithInterface exampleInterface = new FunWithInterface();
		exampleInterface.subjectTitle();
		exampleInterface.subjectPublishYear();
		
		System.out.println("--------------------------------------");
		
		//Example-2: Multiple Interfaces
		exampleInterface.itsType();
		
		//NOTE: This above multiple inheritance mechanism is not supported in CLASS but only possible in Interface
		
		System.out.println("--------------------------------------");
		
		//Example-3: Interface Inheritance
		exampleInterface.favouriteGame();
		exampleInterface.description();
	}
}

/*
REMEMBER:
(1)	You CAN implements more than one INTERFACE class at a time (by adding comma)
(2) If Interface is having 2 ABSTRACT methods, you must have to Override those 2 methods somewhere in your code
(3) Java also supports NESTED Interface (An Interface can have another Interface)
(4) CLASS, ABSTRACT & INTERFACE RELATIONSHIP: 
	(a) CLASS --EXTENDS--> ABSTRACT CLASS   & 
	(b) CLASS --IMPLEMENTS--> INTERFACE 	&
	(c) INTERFACE --EXTENDS--> INTERFACE

NOTE: MARKER/TAGGED Interface: If an Interface has no member, then that is called MARKER /TAGGED Interface. Example: Serializable,
Cloneable, Remote, etc. They are used to provide some essential information to the JVM to do some useful operation.

*/
