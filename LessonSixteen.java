package com.personal.javanet5;

//JavaNet5-LessonSixteen: Structural Programming 5: Array

/*
 NOTE: Array is an object that contains element of similar data type with fixed data set/length. It is 'Index' based. First element of the Array is stored at 0 index.

 ADVANTAGE:    (1) Code Optimization: It makes the code optimized, we can retrieve or sort the data easily
 			   (2) Random Access: We can get data located at any index position

 DISADVANTAGE: (1) Size Limit: We can store only fixed size of elements in the Array. It dosen't grow its size at runtime

 TYPES: 	   (1) Single Dimensional Array
               (2) Multidimensional Array

 >> In this Lesson we will focus only on 'Single Dimensional Array (also called 1D-Array)'

*/

/*
 REMEMBER:

 (a)	Syntax to Declare an 1D-Array in Java
 		(1) dataType[] array_name;  OR  (2) dataType []array_name;  OR (3) dataType array_name[];

 (b) 	Declaration and Instantiation of an 1D-Array in Java
 		int a[] = new int[5];     

 		Then you can do initialization as follows: a[0] = 10;

 (c)	Example of Declaration, Instantiation and Initialization of Java 1D-Array (SMART WAY)
 		int b[] = {3,9,10};

 */

public class LessonSixteen {

	public static void main(String[] args) {

		// Example-1: Simple Single Dimensional Array

		// Step-1: Defined one String Array by allocating 5 Elements space
		String fruitList[] = new String[5];

		// Step-2: Initialize your created Array with values
		fruitList[0] = "Apple";
		fruitList[1] = "Orange";
		fruitList[2] = "Mango";
		fruitList[3] = "Apricot";
		fruitList[4] = "Cherry";

		//You can also do the above Array Declaration, Instantiation and Initialization as follows: 
		//Only One Step: 
		//String fruitList[] = {"Apple", "Orange", "Mango", "Apricot", "Cherry"};
		

		// Step-3: Now ur Array is ready with values. So that you can now play with it ;)
		System.out.println("Array Size is: " + fruitList.length); 		// Printing Array Length
		System.out.println("Value @position 3: " + fruitList[2]); 		// Finding index value of an Array
		System.out.println("--------------------------------");

		// Print whole Array list with FOR...LOOP
		for (int i = 0; i < fruitList.length; i++) {
			System.out.println("Fruit in bucket " + i + " is: " + fruitList[i]);
		}

		System.out.println("--------------------------------");

		// Example-2: Create an empty Array of String type and assign it's values
		String countryName[] = new String[3];
		
		for (int i = 0; i < countryName.length; i++) {
			switch (i) {
			case 1:
				countryName[i] = "Bangladesh";
				break;
			case 2:
				countryName[i] = "America";
				break;
			default:
				countryName[i] = "Canada";
			}
		}
		
		// Print whole Array list with FOR...LOOP
		for (int i = 0; i < countryName.length; i++) {
			System.out.println("Country Name: " + countryName[i]);
		}
		
		/*
		//You also can Print the Array as following Smart For Signature
		for (String Len : countryName){
			System.out.println("Country Name: " + Len);
		}
		*/
		
		System.out.println("--------------------------------");
		
		// Example-3: Passing Array to Method
		int myNumbers[] = { 23, 45, 76, 50 };

		printMyNumbers(myNumbers); // Notice here how are u passing the whole Array

		System.out.println("\n-------------------------------- EXTRAS");

		// Extra-1: What is the Class Name of Java Array?
		// NOTE: In Java, Array is an object. For Array Object, an proxy class is created whose name can be obtained by getClass() and getName() methods on the object.

		int arrayName[] = { 2, 3, 4, 5, 6, 7 };

		@SuppressWarnings("rawtypes")
		// Using this just to avoid any Warnings
		Class arrayClass = arrayName.getClass();
		String displayName = arrayClass.getName();

		System.out.println("Extra-1: Newly created Array Name is: " + displayName);

		// Extra-2: How to Copy a Java Array?
		char firstArray[] = { 'a', 'b', 'c', 'd' }; 	// Array with 4 elements
		char secondArray[] = new char[4]; 				// An Empty Array with length 4 but EMPTY

		// Check-1: Display Second Array Elements
		for (int i = 0; i < secondArray.length; i++) {
			if (secondArray[i] == 0) {
				System.out.println(">> Second Array element " + i + " is: 0");
			} else {
				System.out.println(">> Second Array element " + i + " is: "
						+ secondArray[i] + " ");
			}
		}

		// Now, we will copy 'firstArray' elements into 'secondArray'

		System.arraycopy(firstArray, 0, secondArray, 0, 4); // Notice: the in-built function we used

		System.out.println("Now, after copying, Second Array elemetns are: ");
		
		// Check-2: Display Second Array Elements
		for (int i = 0; i < secondArray.length; i++) {
			if (secondArray[i] == 0) {
				System.out.println(">> Second Array element " + i + " is: 0");
			} else {
				System.out.println(">> Second Array element " + i + " is: "
						+ secondArray[i] + " ");
			}
		}

	} // Main() Method Ends Here

	// Related to Example-2: We are calling this Method from Main()
	static void printMyNumbers(int[] myNumbers) {
		System.out.println("My Numbers are: ");

		for (int i = 0; i < myNumbers.length; i++) {
			if (i != myNumbers.length - 1) {
				System.out.print(myNumbers[i] + "--");
			} else {
				System.out.print(myNumbers[i] + " !!!");
			}
		}
	}
}