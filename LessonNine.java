package com.personal.javanet5;

//JavaNet5-LessonNine: Abstract & Interface

//Note: Abstraction is a process of hiding the implementation details and showing only functionality to the user. It basically lets you focus on what the object does 
//      instead of how it does it. Two ways you can achieve this Abstraction (a) Abstract Class (0 to 100%) and (b) Interface (100%)


//Related to Abstract Example-1: Create an Abstract Class
abstract class MyCountry{
	//Constructor
	MyCountry(){
		System.out.println("> Country Object is created");
	}
	
	//Abstract Method
	abstract void printName();
	
	//Data/Normal Method
	void population(){
		System.out.println("Bangladesh population is about 15.6 M");
	}
}

//Related to Interface Example-1 & 2: Basic Interface
interface MySubject{							//Make Interface name always CAP First
	String subject = "Computer Science";		//Remove 'null' assignment. What happen? Why? Remember: any FINAL variable must be defined
	void subjectTitle();
	void subjectPublishYear();
}

//Related to Interface Example-2: Multiple inheritance
interface SubjectType{
	String type="funnny :) ";
	void itsType();
}

//Related to Interface Example-3: Interface inheritance
interface MyGame{
	abstract void favouriteGame();
}

interface WhyLike extends MyGame{
	void description();
}

public class LessonNine extends MyCountry implements MySubject, SubjectType, WhyLike{
	
	//Overriding Abstract method
	void printName(){
		System.out.println("Country name is: Bangladesh!");
	}
	
	//Implementing Interface Method - 1
	public void subjectTitle(){
		System.out.println("My Subject is: " + subject);
	}
	
	public void subjectPublishYear(){
		System.out.println("Subject publish year: 1973");
	}
	
	//Implementing Interface Method - 2
	public void itsType(){
		System.out.println("Subject type is: " + type);
	}
	
	//Implementing Interface Method - 3
	public void favouriteGame(){
		System.out.print("My Favorite game is Cricket !!! ");
	}
	
	public void description(){
		System.out.println("Thats really Exciting ;)");
	}
		
	public static void main(String[] args) {
		
		/*		ABSTRACT CLASS		*/
		
		//Abstract Class: A class that is declared with 'abstract' keyword. It can have abstract and non-abstract methods. It needs to be extended and it's method
		//				  implemented. It cannot be instantiated.
		
		//Example-1: An Abstract class with Abstract method
		//MyCountry myCountry = new MyCountry;					//Why this one is giving exception
		
		MyCountry myCountry = new LessonNine();
		
		//Constructor will be called automatically
		
		//Abstract Method is Called
		myCountry.printName();	
		
		//Data Method is called
		myCountry.population();
		
		//NOTE: * 	If there is any Abstract method in a class, that class must be Abstract
		//		*	If you are extending any Abstract Class that have Abstract Method, you must either provide the implementation of the 
		//			Abstract Method or make this class Abstract
		
		/*		INTERFACE		*/
		
		//Interface: Always think that Interface is the BLUEPRINT of a CLass/Object. This is the only way in Java to achieve 'FULL ABSTRACTION'
		//			 Means, there can only be Abstract Methods in the Interface, but no Method Body. We always use Interface for (a) to achieve
		//			 Fully Abstraction, (b) we can support the functionality of multiple inheritance, (c) used to achieve loose coupling
		
		//REMEMBER: The Java Compiler adds 'public' and 'abstract' keywords before the interface method & public, static and final keywords
		//	        before data members. Means if u type 'void print();', for Interface compiler will convert that to 'public abstract void print();
		//          and if u type 'int x = 10;', then compiler will convert that to 'public static final int x = 10;'
		
		//CLASS & INTERFACE RELATIONSHIP: (a) CLASS --EXTENDS--> ABSTRACT CLASS, (b) CLASS --IMPLEMENTS--> INTERFACE and (c) INTERFACE --EXTENDS--> INTERFACE
		
		//Example-1: Basic Interface Example
		LessonNine exampleInterface = new LessonNine();		//Remember that this Class Constructor will be called
		exampleInterface.subjectTitle();
		exampleInterface.subjectPublishYear();
		
		//Example-2: Multiple inheritance by Interface
		exampleInterface.itsType();
		
		//NOTE: Again remember that this above multiple inheritance mechanism is not supported in CLASS but only possible in Interface
		
		//Example-3: Interface inheritance
		exampleInterface.favouriteGame();
		exampleInterface.description();
		
		//Note: MARKER/TAGGED Interface: If an Interface has no member, then that is called MARKER /TAGGED Interface. Example: Serializable,
		//		Cloneable, Remote, etc. They are used to provide some essential information to the JVM to do some useful operation
		//		Java also supports NESTED Interface (An Interface can have another Interface)
		
	}
	
}
