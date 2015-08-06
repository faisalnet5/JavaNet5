package com.personal.javanet5;

//JavaNet5-LessonTwentyOne: Casting (Upcasting vs Downcasting)

/*
===============================================
					CASTING
===============================================
It really means is, taking an Object of one particular type and “turning it into” another Object type. Also known as Casting Variables. However, when
we cast a particular variable, the data type of the variable itself is not altered. Instead, a new copy of our selected VARIABLE is made and its
data type is changed to another type (in which we want). 


BENEFITS OF CASTING VARIABLES: There are times when we want to get more specific functionality out of a generic Object. And that can be an ideal
                               situation when we use/need Casting.
         
TYPES: CASTING are two kinds: (a) UPCASTING and (b) DOWNCASTING  <- We can implement both of these two on (1) NUMERIC VALUES/or so
                                                                    called PRIMITIVE VALUE TYPES as well as (2) OBJECT TYPES or so
                                                                    called REFERENCE TYPES.

NOTES:

* Normally for UPCASTING, we can do IMPLICIT Casting (most of the time Java will be taking care of it) and for DOWNCASTING, we can 
  do EXPLICIT Casting (Which We have to do by ourself because Java wants to verify 'We know what we are doing' and for any mistakes,
  shame will be on us only ;) (Crazy-right???))

* For PRIMITIVE VALUE TYPES UPCASTING (IMPLICIT/EXPLICIT) remember following diagram:

			(<- DOWNCASTING)										   (UPCASTING ->)
			byte	->	  short	   ->    int    ->    long   ->   float   ->   double
			                              ^
					                      |
					                     char
			

* For NUMERIC VALUE/PRIMITIVE VALUE TYPE Casting, we also need to be aware of (a) WIDENING and (b) NARROWING -conversion
		 
* We also can convert PRIMITIVE VALUE TYPE to its corresponding REFERENCE TYPE, or the other way around by using (a) BOXING and 
  (b) UNBOXING -conversion

*/

//Related to Example-2: Implement (IMPLICIT/EXPLICIT) Casting on OBJECT/REFERENCE VALUE TYPES
class Machine{
	public void start(){
		System.out.println("Machine Started");
	}
}

class PC extends Machine{
	public void start(){
		System.out.println("PC Started");
	}
	
	public void osType(){
		System.out.println("PC running on Win 7");
	}
}

public class LessonTwentyOne {

	public static void main(String[] args) {
		
		//Example-1: Implement (IMPLICIT/EXPLICIT) Casting on NUMERIC VALUES/PRIMITIVE VALUE TYPES
		//			 (This particular example is taken from 'Cave of Programming' by John Purcell)
		
		//Step-1: Lets define some NUMERIC VALUES/PRIMITIVE VALUE TYPES Variables
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.3f;		  //Notice what we did to assign a float value
		//Or we can define this as this: float floatValue = (float) 8834.3;
		double doubleValue = 32.4;
		
		//Step-2: Find each Variable's max_value (Optional)
		System.out.println("Max value for 'Byte' is: " + Byte.MAX_VALUE);
		
		//Step-3: What if we try to assign very big value than it's capacity
		byteValue = (byte) 128;			  //128 is too big for byte
		System.out.println("Example: Saving bigger value than 'byte' capacity > " + byteValue);  //Notice what value will it print
		
		//Step-4: Assign small value than it's capacity (UPCASTING: Java will do that for us)
		//System.out.println("Max value for 'Short' is: " + Short.MAX_VALUE);
		shortValue = 32766;
		System.out.println("Example: Saving small value than 'short' capacity > " + shortValue); 

		//Step-5: Convert 'long' to 'int' (DOWNCASTING: We have to do Manually)
		intValue = (int) longValue;   	  //Taking our own risk: numeric data value may change
									  	  //You can also think that by Casting we are informing Java about our decision
		System.out.println("Example: Convert 'long' to 'int' > " + intValue);
		
		//Step-6: Convert 'int' to 'double'	(UPCASTING: Java will do that for us)
		doubleValue = intValue;		  	  //Will not have any major change of numeric data value
										  //This is also known as 'WIDENING Primitive Conversion'
		
		//REMEMBER: A WIDENING primitive conversion does not lose information about the overall magnitude of a numeric value.
		
		System.out.println("Example: Convert 'int' to 'double' > " + doubleValue);
		
		//Step-7: Convert 'float' to 'int' (DOWNCASTING: We have to do Manually)
		intValue = (int) floatValue;  	  //Don't get confuse this nature with Java Math, round
										  //This is also known as 'NARROWING Primitive Conversion'
		
		//REMEMBER: A NARROWING primitive conversion may lose information about the overall magnitude of a numeric value and 
		//          may also lose precision and range.
		
		System.out.println("Example: Convert 'float' to 'int' > " + intValue); 
		
	
		//Remember: Above we only dealt with NUMERIC VALUES/PRIMITIVE VALUE TYPES. We cannot just mass around this conversion concept with one TYPE
		//			to another TYPE (Means PRIMITIVE (int) to OBJECT Type (String)). For that you have to follow by-passing technique which you
		//          better try to avoid for simplicity
		
		
		System.out.println("--------------------------------");
		
		//Example-2: Implement (IMPLICIT/EXPLICIT) Casting on OBJECT/REFERENCE VALUE TYPES
		//			 (This particular example is also taken from 'Cave of Programming' by John Purcell)
		
		//Step-1: Create two simple instances of our public two classes
		Machine myMachine = new Machine(); 		//Right side Object instance which we created once, will always remain their. Means, if we create
		PC myPC = new PC();						//new Machine instance by 'new Machine()', that instance will never change.
		
		//Normally what we have seen before are as follows:
		myMachine.start();
		myPC.start();
		myPC.osType();
		
		//Now lets deal with UPCASTING & DOWNCASTING (Remember: Any CUSTING we do/will do, will be on top of the variable we create on Left Side) 
		//UPCASTING 
		
		System.out.print("UPCASTING > ");
		
		Machine machine_one = new PC(); 		//Remember, this is Polymorphism
		//we can also write this above instance as follows:
		//Machine machine_one = myPC;
		
		//Which start() method will it RUN? PArent's one OR Child's one???
		machine_one.start();
		//However, notice that we can call start() method of Child's Object but can't call osType()!!! Why???
		
		System.out.print("DOWNCASTING > ");
		
		Machine machine_two = new PC();			//As we know PC is having osType() method which we couldn't access in our above example
		PC pc_one = (PC) machine_two;			//This is the by passing way to make that DONE :) (By getting help from DOWNCASTING)
		//           ^
		//	         |
		//  Referring to which Object we r casting to (For any DOWNCASTING, Java needs our confirmation)
		
		//Now we can access all the methods from PC Object
		pc_one.start();
		pc_one.osType();
		
		//Observe this behaviors (related to DOWNCASTING) very CAREFULLY !!!
		//------------------------------------------------------------------------		
		/*
		//NOTE: Always before we are going for any DOWNCASTING, we have to be very clear about what we are going to do and whether that is possible or
		//      not to implement that concept in our situation. If you are NOT TAKING THIS POINT SERIOUSLY then notice a scenario below, where we will 
		//		get no Compiler time Error/Exception but the Run time, which Java will throw as follows:
		
		Machine machine_three = new Machine();
		PC pc_two = (PC) machine_three;			//Can we change the actual Object which is Machine to PC? Notice, it is not throwing any Error
		
		//Now try to use PC Object's method start() & run the Application
		pc_two.start();			// :( What just happened??? Meet with 'ClassCastException' ;)
		
		//REMEMBER (VERY IMPORTANT):
		//---------------------------------
		//	We cannot DOWNCAST between UNRELATED OBJECT, because we can't change one Object to another Object. Only what we can do is to deal with their
		//	REFERENCE VARIABLE(S) and change their type if necessary. 
		 
		//	You have to be sure that the Object Variable you are CASTING, really does refer to the kind of Object that you are DOWNCASTING to.  				 
		*/
		
		System.out.println("--------------------------------");
		
		//Example-3: BOXING vs UNBOXING Conversions
		//Note: Converting from a PRIMITIVE TYPE to its REFERENCE TYPES is called BOXING Conversion and the opposite is called
		//		UNBOXING Conversion.
		
		int a = 100;
		Integer aObj = new Integer (200);
		
		//Step1: Converting from a PRIMITIVE TYPE to its corresponding REFERENCE TYPES
		aObj = a; 	//BOXING conversion
		System.out.println("AUTOBOXING/BOXING > " + aObj);
		
		//Step2: Converting from a REFERENCE TYPES to its corresponding PRIMITIVE TYPE
		a = aObj;	//UNBOXING conversion
		System.out.println("UNBOXING > " + aObj);
		
		System.out.println("--------------------------------");
		
		//Example-4: 'String' to 'int' vs 'int' to 'String' Conversion
		
		//Step-1: Convert 'String' to 'int'
		int b = Integer.parseInt("1234");
		System.out.println("'String' to 'int' Conversion: " + b + " (int format)");
		
		//Step-2: Convert 'int' to 'String'
		String c = Integer.toString(5678);
		System.out.println("'int' to 'String' Conversion: " + c  + " (String format)");	
		
	}

}
