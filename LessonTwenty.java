package com.personal.javanet5;

//JavaNet5-LessonTwenty: String Builder & String Formatting

/*
NOTE on 'StringBuilder': 
------------------------------
In Java, any String we deal with are immutable (means once we make it, can't change without erasing the old one). And therefore
StringBuilder Class is there for us to help making mutable (changeable/modifiable) String.

Common Constructor we have from StringBuilder Parent Class are as follows:
(a)	stringBuilder()  				//Creates an empty string Builder with the initial capacity of 16
(b)	stringBuilder(String str)		//Creates a string Builder with the specified string
(c)	stringBuilder(int length)		//Creates an empty string Builder with the specified capacity as length

>> In this example we will be seeing all kind of examples based on List of Methods which 'StringBuilder' (Parent) Class gives us.

 */
public class LessonTwenty {

	public static void main(String[] args) {
		
		//Example-1: Add/Build String - Old Way vs New Way (using 'StringBuilder' with .append() method)		
		String part_1 = "Java is a cool language.";
		part_1 += " "; 		//Notice how r we doing Concatenation
		part_1 += "I love coding on Java ;) ";
		
		System.out.println(part_1);
		
		System.out.println("--------------------------------");
		
		StringBuilder sb_first_example = new StringBuilder("Ruby?");  	// Creating 'StringBuilder' object by passing an ARGUMENT
																		// Which Constructor signature will it follow?
		sb_first_example.append(" ");
		sb_first_example.append("I heard thats a good language too. Will try surely :)");
		
		System.out.println(sb_first_example);
		
		//Notice: Are they doing the same? Which one should I use? Why?
		
		System.out.println("--------------------------------");
		
		//Example-2: INSERT any chunk of String with your existing String at any specific location		
		StringBuilder sb_second_example = new StringBuilder();  		// Which Constructor signature will it follow?
		
		sb_second_example.append("My Name is: . Do u know?");
		sb_second_example.insert(12, "Rinku");
		
		System.out.println(sb_second_example);
		
		System.out.println("--------------------------------");
		
		//Example-3: REPLACE any chunk of String with your existing String at any specific location		
		StringBuilder sb_third_example = new StringBuilder();
		
		sb_third_example.append("A nicer country name is: Malaysia");
		sb_third_example.replace(25, 33, "USA");
		
		System.out.println(sb_third_example);
		
		System.out.println("--------------------------------");
		
		//Example-4: DELETE any chunk of String with your existing String at any specific location	
		StringBuilder sb_fourth_example = new StringBuilder();
		
		sb_fourth_example.append("Rose is RED!");
		sb_fourth_example.delete(5, 12);
		
		System.out.println(sb_fourth_example);
		
		System.out.println("--------------------------------");
		
		//Example-5: REVERSE the current String :)
		StringBuilder sb_fifth_example = new StringBuilder();
		
		sb_fifth_example.append("Rose");
		sb_fifth_example.reverse();
		
		System.out.println(sb_fifth_example);
		
		System.out.println("-------------------------------- Extra:1");
		
		//Extra-1: How we can find out StringBuilder holding capacity?
		//Note: The default capacity of the Builder is 16. If the number of character increases from its current capacity, 
		//      it increases the capacity by (oldcapacity*2)+2. 
		
		StringBuilder sb=new StringBuilder();  
		System.out.println("Old/Default Capacity: " + sb.capacity());				//default 16  
		
		sb.append("java is my favourite language");  
		System.out.println("New Capacity: " + sb.capacity());						//now (16*2)+2=34 i.e (oldcapacity*2)+2 
		
		System.out.println("-------------------------------- Extra:2");
		
		//Extra-2: Can we fix the StringBuilder minimum holding capacity from 16 to 20?
		StringBuilder sb_min_capacity = new StringBuilder();  
		System.out.println("Old Min Capacity: " + sb_min_capacity.capacity());		//default 16  
		
		sb_min_capacity.ensureCapacity(50);											//Manually changed that 16 to 50
		
		System.out.println("New Min Capacity: " +sb_min_capacity.capacity());		//Now see the change
		
	}

}

//Note: Normally try to use 'StringBuilder', rather than 'StringBuffer'. Only main difference between these two are,
//      'StringBuffer' is OLD and 'THREAD-SAFE' (means, multiple threads cannot access it simultaneously and they will be
//		given access in an order basis.

