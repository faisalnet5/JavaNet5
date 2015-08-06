package com.personal.javanet5;

//JavaNet5-LessonThree: Methods & Parameters (Exp: toString, equals)

//In File Object but outside the Main Class, which we will access from our Main method
class Flowers{
	
	public String name;
	public String color;
	
	//Method definition WITHOUT PARAMETER(S)
	void presentation(){
		System.out.print("Me " + name + ", " + "my color is: " + color + " :)");
	}
	
	//Method definition WITH PARAMETER(S)
	
	void passParameters(String change_name, String change_color){
		System.out.println("\tMe " + change_name + ", " + "and my color is: " + change_color + " ;)");
	}

	//Defining FIRST Constructor without any parameter-Why? (Ans. is related with Example-2)
	public Flowers() { //Called Default Constructor
		super(); //Calls the constructor of the extended class, here the Default Constructor of object "Flowers"
	}
	
	//Example-2: toString()- This special method can be defined in any class. When on Object is used in a 
	//		     String concatenation operation or when specified in print statement, this method gets
	//			 invoked automatically
		
	//			 Whenever you require to explore the constructor called value in the String form, you can 
	//           simply use String toString()
	
	//Defining SECOND Constructor with parameters?
	public Flowers(String name, String color){	
		this.name = name;
		this.color = color;
	}

	//Commented out following toString() method and check the output
    
	public String toString(){
		return "I am the toString Method";
	}

	//Before u jump to the next Example-3, find out why u used Constructor & how u r using toString()
	
	//Remember: By using .toString(), we are trying to get the String representation of our created Class/Object. Also .toString()
	//          if good for debugging our Object, so that we can identify it's existence.
}

public class LessonThree {
	
	//Main method for our Application
	public static void main(String[] args) {
		
		Flowers myFlower = new Flowers();	//Which Constructor it will call?
		System.out.println("\nTEST WITH/WITHOUT toString(): " + myFlower);
		
		//Setting Parent's Variables value. Notice that we didn't use Getter/Setter methods. Why?
		myFlower.name = "Rose";
		myFlower.color = "Red";
		
		//Calling Parent's Method, WITHOUT ANY ARGUMENT(S)
		myFlower.presentation();
		
		String change_name = "Kodom";
		String change_color = "Yellow";
		
		//Calling Parent's Method, WITH ARGUMENT(S)
		myFlower.passParameters(change_name, change_color);
		
		//Example-2 related: Notice what will be the output WITH/WITHOUT toString()
		Flowers myFlower_toString = new Flowers("Lily", "Pink");	//Which Constructor it will call?
		System.out.println("\nTEST WITH/WITHOUT toString(): " + myFlower_toString);
		
		//Example-3: equal()
		String str_1 = new String("Hello World!");
		String str_2 = new String("Hello World! ");
		
		System.out.println("\nResult of equals(): " + str_1.equals(str_2));
	}
}

/* 		Tips:
 *      ------------------
 * 		1) 	Remember, Arguments used in function/method call
 * 		2)	And Parameters used in function/method definition
 * 		3)	Notice the difference between print & println
 * 		4) 	Always for Constructor, Your Class name and Constructor Method Name should be same
 * 		5)	And always Constructor looks for correct method signature
 * 
 */