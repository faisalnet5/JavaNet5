package com.personal.javanet5;

import com.personal.javanet5.extras.LessonPrivateConstructor;


//JavaNet5-LessonEight: Constructors

/*	Do you have any Question on the following notes:
 * 
 * 	(1)	Constructors are required to create objects for a class. Constructors are used to initialize the instance variables 
 * 		of an object.
	(2)	Constructor declaration looks like method declaration. It must have the same name as that of the class and have no 
		return type.
	(3)	Constructors can be classified into two types, default constructors and parametarized constructors.
	(4)	If you don't define a constructor, then the compiler creates a default constructor. Default constructors do not contain 
		any parameters. Default constructors are created only if there are no constructors defined by us.
	(5)	Parameterized constructors are required to pass parameters on creation of objects. We can overload constructors with 
		different datatypes as its parameters.
	(6)	Use 'this()' to communicate from one constructor to another constructor in the same class.
	(7)	Use 'super()' to communicate with super class constructor.

 * 
 */

//Related to Example-5: Setting Object Instance Variable Values by Constructor
class ConstructorMagic{
	private String countryName;
	private int countryPopulation;
	
	public String getCountryName() {
		return countryName;
	}
	/*
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	*/
	public int getCountryPopulation() {
		return countryPopulation;
	}
	/*
	public void setCountryPopulation(int countryPopulation) {
		this.countryPopulation = countryPopulation;
	}
	*/
	
	//Notice by using Constructor how can we change the values of our Object's instance variables
	ConstructorMagic(String countryName, int countryPopulation){
		this.countryName = countryName;
		this.countryPopulation = countryPopulation;
	}
}

public class LessonEight {
	
	//Related to Example-1: Notice what is happening here (Overriding/Overloading?)
	public LessonEight(){
		System.out.println("Example-1: This is Default Constructor");
	}
	
	//Related to Example-2.a: Notice what is happening here (Overriding/Overloading/pass-by-value)
	public LessonEight(String passing_variable){
		System.out.println("Example-2.a: Our Lord is: " + passing_variable);
	}
	
	//Related to Example-2.a: Notice what is happening here (Overriding/Overloading/pass-by-value)
	public LessonEight(String passing_variable, int count){
		System.out.println("Example-2.b: Our Lord is: " + passing_variable + ',' + " And He is the only " + count);
	}

	//Related to Example-3
	public LessonEight(int count_a, int count_b){		
		this();	//By using this() we can call base constructor in the same class
		System.out.println("Example-3: Count a is: " + count_a + ", and Count b is: " + count_b);
	}
	
	
	public static void main(String[] args) {
		
		//Example-1: Default Constructor Example
		//a) LessonEight defaultConstructor = new LessonEight();
		//Or you can do this way: b)
		new LessonEight();					
		
		//Example-2.a: Parameterized Constructor (1 Parameter)
		//a) LessonEight defaultConstructor = new LessonEight("Allah");
		//Or you can do this way: b)
		new LessonEight("Allah");
		
		//Example-2.b: Parameterized Constructor (2 Parameter)
		//a) LessonEight defaultConstructor = new LessonEight("Allah", 1);
		//Or you can do this way: b)
		new LessonEight("Allah", 1);
		
		//Example-3: Constructor Chaining
		//Calling one Constructor from another Constructor in the same Class is called Constructor Chaining.
		new LessonEight(7, 8);
		
		//Example-4: Private Constructor
		//Example is in Package 'com.personal.javanet5.extras', class name 'LessonPrivateConstructor'
		
		//After creating 'LessonPrivateConstructor' Class, try to create its instance here...
		//LessonPrivateConstructor accessPrivateConsturctor = new LessonPrivateConstructor();
		
		//Could you manage ;) 
		//Well now do the following...and see the magic :)
		LessonPrivateConstructor accessPrivateConsturctor = LessonPrivateConstructor.manuallyCreate();
		accessPrivateConsturctor.display();
		
		//Example-5: Use Constructor to set Object Instance Variable value(s)
		ConstructorMagic constructorMagic = new ConstructorMagic("Bangladesh", 15); //Notice How u r passing arguments to Constructor
		
		System.out.println("Country Name is: " + constructorMagic.getCountryName());
		System.out.println("Country Population: " + constructorMagic.getCountryPopulation());
	}
}

//