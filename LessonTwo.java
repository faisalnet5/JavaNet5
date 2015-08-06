package com.personal.javanet5;

import com.personal.javanet5.extras.Lesson_Extra_Person;

//JavaNet5-LessonTwo: Classes & Objects (Package, Inheritance)

//In File Object but outside the Main Class, which we will access from our Main method
class Fruits {
	String fruits_name = "Apple";					//Instance Variables
	String fruits_color = "Red";
}

public class LessonTwo {

	public static void main(String[] args) {
		
		//Notice here how ur Main method is access other Object/Class :)
		
		//Example-1: Accessing (called also Inheriting) ur First (any other class/object under same CLASS) public object 
		Fruits myFruits = new Fruits();
		
		System.out.println("Selected Fruit: " + myFruits.fruits_name +"\n");
		System.out.println("It's Color is: " + myFruits.fruits_color);
				
		//Example-2: Accessing (called also Inheriting) ur Second (any other class/object under SAME PACKAGE) 
		LessonExtraFlower myFlower = new LessonExtraFlower();
		
		System.out.println("\nSelected Flower Name is: " + myFlower.flower_name + '\n');
		System.out.println("It's Color is: " + myFlower.flower_color);
		
		//Example-3: Accessing (called also Inheriting) ur Second (any other class/object under DIFFERENT PACKAGE) 
		Lesson_Extra_Person myPersonName = new Lesson_Extra_Person();
		
		System.out.println("\nSelected Person: " + myPersonName.getPerson_name() + ",\tand his age is: " + myPersonName.getPerson_age());
				
	}
}
/*
	REMEMBER:
	-----------
	a) 	In Java, mainly we have 2 types of Variables based on Locations:
		(1)	Local Variable: A variable that is declared inside the method
		(2)	Instance Variable: A variable that is declared inside the class but outside the method
		
		* Don't get confuse by STATIC and FINAL Variable
		
	b)	In Java, Data Type of Variables we can define into following ways:
		(1)	Primitive Data Type: These are predefined types of data, which are supported by Java Language itself. 
			
			Examples are: boolean, char, byte, short, int, long, float, double
			
		(2) Non-Primitive Data Type: These Data Types are NOT defined by Java, rather programmer themselves create. These 
		    Non-Primitive Data Types are also known as "reference Variables" or "Object References" or just "Object".
		    
		    Examples are: String, Array, Class, Interfaces etc.
	
			Remember: While an object may contain any type of data, the information referenced by the object may still be stored 
			as a primitive data type
			
	c)	Always REMEMBER while creating Object Instances as follows:
	
				Bank myBank = new TDBank();
				  |                  |
			      |             This one represents WHICH actual method/implementation will be called   
			      |
		
		This one represents WHAT are the
		total number of methods any child
		call call
			
			
 		Tips:
        ------------------
 * 		1) 	For Helping Hints from eclipse, at the end of ur word press Ctrl + Space bar
 * 		2)	Use + for concatination
 * 		3)	"\n" refers to New Line for Java to use
 * 		4)	To import all necessary items (can come from same or different package) inside ur Main Function
  			press Ctrl + Shift + O
 * 		5)  "\t" refers to one tab press for Java to use
  
 */