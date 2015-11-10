package com.personal.javanet5;

/* 
ABSTRACT Class: A class that is declared with 'abstract' keyword. It can have abstract and non-abstract methods. It needs to be extended 
and it's method implemented. It cannot be instantiated (means cannot use NEW keyword).
*/	

//Related to Abstract Example-1: Create an Abstract Class
abstract class MyCountry{
	
	//Element-2: Method(s)  - Abstract Method
	abstract void printName();
	
	//Element-2: Method(s) (Whereas, for INTERFACE, you can't have any method which is NOT ABSTRACT and having method BODY)
	void population(){
		System.out.println("Bangladesh population is about 15.6 M");
	}
	
	//Element-3: Constructor(s)
	MyCountry(){
		System.out.println("> Country Object is created");
	}		
}

//Related to Abstract Example-2: An Abstract method in Abstract class
abstract class Flower{
	
	//Element-2: - Abstract Method
	abstract void flowerName();
	
/*
	NOTE: As soon as you are defining a method ABSTRACT, that methods can't have any BODY
	By default JVM is thinking you will Override that method somewhere else in your code
*/
	//Element-2: Method(s)
	/*void flowerName(){			
		System.out.println("Flower name is: Rose");
	}*/
}

public class FunWithAbstract extends MyCountry{
	
	@Override 					//Overriding Abstract method
	void printName() {
		System.out.println("Country name is: Bangladesh!");
	}

	public static void main(String[] args) {
		
		//Example-1: An Abstract class with Abstract method
		//MyCountry myCountry = new MyCountry;    //Why this one is giving exception
		
		MyCountry myCountry = new FunWithAbstract();
		myCountry.printName();
		
		//Data Method is called
		myCountry.population();
				
		System.out.println("--------------------------------------");

		//Example-2: An Abstract method in Abstract class
		//We are seeing this Example-2 just to how the other way works
	}
}

/*
REMEMBER:
(1) You CAN'T extends more than one ABSTRACT class at a time (by adding comma)
(2) If you are extending any Abstract Class that have Abstract Method, you must either provide the implementation of the 
    Abstract Method or make this class Abstract
(3) If there is any Abstract method in a class, that class must be Abstract
*/
	
