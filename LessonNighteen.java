package com.personal.javanet5;

//JavaNet5-LessonNighteen: Structural Programming 8: Enum Types

/*
ENUM: It can be thought as a Data Type (like String) or a CLass/an Object that have fixed set of Constants (means it can have
 	   Data Models/fields, Methods and Constructors along with Constants).

Usage: Can be use for Days of the Week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY and SATURDAY), directions (NORTH, 
       SOUTH, EAST and WEST) etc.

REMEMBER:
 (1) ENUM improves type safety
 (2) Can be traversed
 (3) Can easily use in Switch
 (4) Any ENUM object we create, background it extends ENUM Class. Therefore, Your created ENUM Class/Object can't extends any
     other class but can implement many Interfaces
     
*/

//Related to Example-1.a (Outside the Class) 
enum Season{
	WINTER, SPRING, SUMMER, FALL
}

//Related to Example-2
enum Phone{
	
	//Remember: The enum constants have initial value that starts from 0, 1, 2, 3 and so on. But we can initialize the 
	//          specific value to the enum constants by defining fields and constructors.
	
	LUMIA, GALAXY (840), IPHONE (860), HTC (320);  	 	//These elements are Static & Final 
	
	private int price;
	
	//Remember: Constructors of ENUM type is always private therefore, we cannot create the instance of ENUM by 'new' keyword
	//Through constructor set those Constant Values to object's Private Variable
	Phone(){			//Constructor signature - 1
		price = 700;
	}
	
	Phone(int price){	//Constructor signature - 2  (This Constructor just working like a SETTER)
		this.price = price;
	}
	
	//Public GETTER Method
	public int getPrice() {
		return price;
	}
}

//Related to Example-3
enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY} 
	
public class LessonNighteen {
	
	//Related to Example-1.a (Inside the Class) 
	enum Colors{RED, BLUE, GREEN, YELLOW}

	public static void main(String[] args) {
		
		//Example-1: Simple example of ENUM
		System.out.println("Printing ENUM Type Object elements (both Inside and Outside) as follows: ");
		
		//1.a (Inside)
		for (Colors colorElements: Colors.values()){
			System.out.println(colorElements);
		}
		
		System.out.println("--------------------------------");
		
		//1.b (Outside)
		for (Season seasonElements: Season.values()){
			System.out.println(seasonElements);
		}
		
		//NOTE: The java compiler internally adds the values() method when it creates an ENUM. The values() method returns 
		//      an array containing all the values of the ENUM.
		
		System.out.println("--------------------------------");

		//Example-2: Specifying Initial Value to the ENUM constants
		System.out.println("Printing ENUM Type Phone Object elements (with it's values) are as follows: ");
		
		for (Phone phoneElements: Phone.values()){
			System.out.println(phoneElements + " > Price is: $" + phoneElements.getPrice());
		}
		
		System.out.println("--------------------------------");
		
		//Example-3: Using ENUM on SWITCH statement (This Example is taken from JavaTPoint.com)
		//Initialize the first day object as follows:
		Day day=Day.FRIDAY;  //Basically at this stage user can give any Day which later you will compare with your ENUM Object
		
		//Now use SWITCH to implement conditions
		switch(day){  
			case MONDAY:   
				System.out.println("Today is Monday :(");  
				break;  
			case FRIDAY:   
				System.out.println("Today is Friday ;)");  
				break;  
			default:  
				System.out.println("Well, all Days are Awesome :)");  
		}  
		
		//Notice: How SWITCH works as like IF...ELSEIF condition !!!
	}
}

//Note:  *	We can have ABSTRACT Method in ENUM, therefore can provide the implementation of those methods
