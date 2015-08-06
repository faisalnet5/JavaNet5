package com.personal.javanet5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


//JavaNet5-LessonTwentyFive: Getting User Input

/*
	NOTE: Recommended common methods which we can use to read user entered data from Keyboard are as follows:
	
	(a) InputStreamReader with BufferedReader
		
		InputStreamReader class performs two tasks:
		(1)	Connects to input stream of keyboard
		(2)	Converts the byte-oriented stream into character-oriented stream
		
		And then we use BufferedReader, which we use to read data line by line by readLine() method.
		
	(b)	Scanner
	
		Scanner class is widely used. We used it to parse text for string and primitive types using regular expression.
		This class breaks the input into tokens using a delimiter that is whitespace by default. It provides many methods 
		to read and parse various primitive values.
		
		Java Scanner class extends Object class and implements Iterator and Closable interfaces.
*/

public class LessonTwentyFive {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		//Example-1: Read data from user/keyboard by InputStreamReader and BufferdReader class:
		//Step-1: Create a 'Reader' Object Instance
		InputStreamReader reader_one=new InputStreamReader(System.in);  //'System.in' by default standard input parsing structure
		
		//Step-1: Create a 'Buffer' (called 'bufferReader') Object Instance where we will keep user entered data
		BufferedReader bufferReader_one=new BufferedReader(reader_one);  
		
		//Step-3: Now we can read the Buffer as follows:
		System.out.println("Example-1: Enter your name");  

		try {
			String userData_one = bufferReader_one.readLine();
			System.out.println("Example-1: Welcome "+ userData_one); 
			
		} catch (IOException e) {
			System.out.println("Example-1: Error occured in InputStreamReader!" + e);
		}
		
		//We can enter any String or Integer value which will automatically be converted into String and ready to display
		
		System.out.println("--------------------------------");		
		
		//Example-2: Read data from user/keyboard by Java Scanner class:
		//Step-1: Create a 'Scanner' Object Instance
		Scanner scannerObj  = new Scanner(System.in);  
	    
		//Get user entered data 
		try {
			System.out.println("Example-2: Enter your FirstName: "); 
			String scan_name = scannerObj.next();  
			
			System.out.println("Example-2: Enter your Age: ");
			int scan_age = scannerObj.nextInt();
			
			System.out.println("Example-2: Enter any double value: "); 
			double scan_double=scannerObj.nextDouble();  
			
			//Display as Information
			System.out.println("You are: " + scan_name + ", Age: "+ scan_age + " and You entered: " + scan_double);  
		}catch (Exception e) {
			System.out.println("Example-2: Error occured in Scanner!" + e);
		}finally{
			scannerObj.close();
			System.out.println("\nExample-2 > Scanner is Closed!");
		}
		
		System.out.println("--------------------------------");		
		
		//Extra-2: Scanner Example with delimiter
		//Step-1: Making a string with delimiter
		String input_item = "MALAYSIA IS A BEAUTIFUL AND PEACEFUL COUNTRY";
		
		//Step-2: Create a 'Scanner' Object Instance
		Scanner scannerObj_extra  = new Scanner(input_item).useDelimiter("\\s");
		
		try{
			//Step-3: Read through given 'input_item' through Scanner Object
			System.out.println("Example-2 (Extra): " + scannerObj_extra.next()); 
			System.out.println("Example-2 (Extra): " + scannerObj_extra.next()); 
			System.out.println("Example-2 (Extra): " + scannerObj_extra.next()); 
			System.out.println("Example-2 (Extra): " + scannerObj_extra.next()); 
			System.out.println("Example-2 (Extra): " + scannerObj_extra.next()); 
			System.out.println("Example-2 (Extra): " + scannerObj_extra.next()); 
			System.out.println("Example-2 (Extra): " + scannerObj_extra.next());		
		}catch(Exception e){
			System.out.println("Example-2 (Extra): Error occured in Scanner! " + e);
		}finally{
			scannerObj_extra.close();
			System.out.println("\nExample-2 (Extra) > ScannerExtra is Closed!");
		}
	}
}
