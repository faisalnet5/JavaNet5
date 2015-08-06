package com.personal.javanet5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

//JavaNet5-LessonTwentyThree: Handling Exceptions/Multiple Exceptions/Multiple Catch

/*
 NOTE: EXCEPTION is an event that disrupts the normal flow of the program. It also considers as a mechanism to handle 'runtime'
 	   errors such as ClassNotFound, IP, SQL, Remote etc., related.
 	   
 	   The core advantage of Exception Handling is to maintain the normal flow of our Application. Suppose there are 10 statements
 	   in our Application to run but there occurs an exception at statement 5. In this situation rest of our Application will not  
 	   be executed, means statement 6 to 10 will not run. By performing Exception Handling, we can ensure that those rest of the 
 	   statements will be executed as expected, even though there is an exception at statement 5.

Type of Exceptions: There are mainly TWO types of Exceptions (1) Checked Exception and (2) Unchecked Exception

(1) Checked Exception: The classes that extend Throwable class except RuntimeException and Error are known as checked exceptions 
    e.g.IOException, SQLException etc. Checked exceptions are checked at compile-time.
    
(2)	Unchecked Exception: The classes that extend RuntimeException are known as unchecked exceptions e.g. ArithmeticException, 
    NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time rather they 
    are checked at runtime.

* Sometime ERROR can also be considered as Exception but they are irrecoverable e.g. OutOfMemoryError, VirtualMachineError, 
  AssertionError etc.
  
Common scenarios where exceptions may occur:
-----------------------------------------------
(a)	Scenario where ArithmeticException occures: Example- int a=50/0;									//ArithmeticException  
(b)	Scenario where NullPointerException occurs: Example-String s=null; System.out.println(s.length()); 	//NullPointerException 
(c)	Scenario where NumberFormatException occurs: Example- String s="abc"; int i=Integer.parseInt(s);	//NumberFormatException
(d)	Scenario where ArrayIndexOutOfBoundsException occurs: Example- int a[]=new int[5]; a[10]=50; 		//ArrayIndexOutOfBoundsException   

Exception Handling Keywords:
-----------------------------
(a) try, (b) catch, (c) finally, (d) throw, and (e) throws

*/

//Related to both Example-1-a & Example-1-b: Notice how we are using 'throws' and 'throw' in this example
class ExceptionGenerator{
	public void run() throws ParseException{	 	 //There can be more than one throwable Exception(s) with Comma separation
		
		//Manually generating an Exception for this run() method, therefore whenever any child will call (means will create an 
		//instance of this Parent Object) will receive an ParseException
		throw new ParseException("Example-1 > Oh Nooo", 0);  //Here 0 is errorOffset - the position where the error is found while parsing
	}
	
	//Related to Example-3: Using Multiple Catch
	public void inputException() throws IOException, FileNotFoundException{		
		//Again manually triggering Exception (You can use 'FileNotFoundException' as well )
		throw new IOException("System couldn't read user input :(");
	}
	
}

//Related to Example-4: ExceptionHandling with MethodOverriding

class Parent_One{  
	//Case-1:Rule-1 & Rule-2 (No Exception Declaration)
	void message_one(){
		System.out.println("Example-4: (Case-1:Rule-1) > Exception from Parent");
	}  
	void message_two(){
		System.out.println("Example-4: (Case-1:Rule-2) > Exception from Parent");
	}  
	
	//Case-2: Rule-1 (a)
	void message_three() throws Exception{
		System.out.println("Example-4: (Case-2:Rule-1 (a)) > Exception from Parent");
	}  
	
	//Case-2: Rule-1 (b)
	void message_four() throws Exception{
		System.out.println("Example-4: (Case-2:Rule-1 (b)) > Exception from Parent");
	} 
	
	//Case-2: Rule-1 (c)
	void message_five() throws Exception{
		System.out.println("Example-4: (Case-2:Rule-1 (c)) > Exception from Parent");
	} 
	/*
	//Case-2: Rule-1 (d)
	void message_six() throws ArithmeticException{
		System.out.println("Example-4: (Case-2:Rule-1 (d)) > Exception from Parent");
	} 
	*/
} 

public class LessonTwentyThree extends Parent_One{
	
	//Related to Example-4 (Case-1:Rule-1): Child is trying to override Paren't method with Checked Exception
	/*
	void message_one()throws IOException{  
		System.out.println("Example-4 (Case-1:Rule-1) > Exception from Child");  
	}  
	*/
	
	//Related to Example-4 (Case-1:Rule-2): Child is trying to override Paren't method with Unchecked Exception
	void message_two()throws ArithmeticException{  
		System.out.println("Example-4: (Case-1:Rule-2) > Exception from Child");  
	}  
	
	//Related to Example-4 (Case-2:Rule-1 (a)): Child is trying to override Paren't method with SAME Parent's Exception
	void message_three() throws Exception{  
		System.out.println("Example-4: (Case-2:Rule-1(a)) > Exception (Refering SAME as Parent) from Child");  
	}  
	
	//Related to Example-4 (Case-2:Rule-1 (b)): Child is trying to override Paren't method with Parent's SUBCLASS Exception
	void message_four() throws ArithmeticException{  
		System.out.println("Example-4: (Case-2:Rule-1(b)) > Exception (Refering SUBCLASS of Parent) from Child");  
	}  
	
	//Related to Example-4 (Case-2:Rule-1 (c)): Child is trying to override Paren't method with NO Exception
	void message_five(){  
		System.out.println("Example-4: (Case-2:Rule-1(c)) > Exception (Refering No Parent) from Child");  
	} 
	
	//Related to Example-4 (Case-2:Rule-1 (d)): Child is trying to override Paren't method with PARENT Exception
	/*
	void message_six() throws Exception{  
		System.out.println("Example-4: (Case-2:Rule-1(d)) > Exception (Referring Parent Type Exception) from Child");  
	} 
	*/
	
	//Example-1-a: Handling Exception at method level 'add throws declaration'
	public static void main(String[] args) throws ParseException {						 //First way of Dealing with Exception(s)
	
	//Related to Example-2 (This Example is to support the concept of Multiple Exceptions)
	//By this Comma separated list of Exceptions below, we can deal with Multiple Exceptions scenario (Example-2).
	//public static void main(String[] args) throws  ParseException, ArithmeticException{ 	
		
		ExceptionGenerator exceptionGenerator = new ExceptionGenerator();								
		//exceptionGenerator.run();				//Task-1									
		
		//NOTICE: We we uncomment Task-1 and commented below try-and-catch block from 'Example-1-b' what will happen? WHY?
		
		//Example-1-b: Handling Exception by surrounding try-and-catch 				
		try {																	        //Second way of Dealing with Exception(s)
			exceptionGenerator.run();			//Task-2
		} catch (ParseException e) {
			System.out.println("Example-1-b > We are in LessonTwentyThree !!! Presenting result: " + e);
			//e.printStackTrace();
		}
			
		System.out.println("--------------------------------");
		
		//Example-2: Example on Dealing with Multiple Exceptions (Compare this Example with Example-1-a & Example-1-b)
		//int value = 50/0;														        //First way of Dealing with Exception(s)
		//System.out.println("Example-2 > We are in LessonTwentyThree !!! Presenting result: " + value);
		
		/*
		try {																		    //Second way of Dealing with Exception(s)							    
			int value = 50/0;
			System.out.println("Example-2 > We are in LessonTwentyThree !!! Presenting result: " + value);
		} catch (ArithmeticException e) {
			e.printStackTrace();;
		}
		*/
		System.out.println("<<< Example is comented out >>>");
		
		System.out.println("--------------------------------");
		
		//Example-3: Example on Multiple Catch
		try {
			exceptionGenerator.inputException();
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Example-3 (FileNotFoundException) > " + e);
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Example-3 (IOException) > " + e);
		}
		
		//REMEMBER: If there is a situation where Child is throwing an Exception which is belong to one of the Child Exception
		//          Class, and we are intending to use Multiple Catch technique, in such cases for sure we have to catch the Child
		//          Exception first and then only Parent Exception (which is demonstrating in our above Example-3)
		
		System.out.println("--------------------------------");
		
		//Example-4: ExceptionHandling with MethodOverriding (Very Important)
		
		//Case-1:  If the SUPERCLASS/PARENT method does NOT declare an exception
		//-------------------------------------------------------------------------
		
		//Rule-1: If the SUPERCLASS/PARENT method does not declare an exception, SUBCLASS/CHILE overridden method cannot declare 
		//        the CHECKED EXCEPTION (Remember: A CHECKED EXCEPTIONS are those exceptions that must be either caught or declared 
		//        in a method where it can be thrown).
		
		Parent_One case_1_rule_1 = new LessonTwentyThree();  
		case_1_rule_1.message_one();  
		 
		//Rule-2: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked 
		//        exception but can declare UNCHECKED EXCEPTION.
		 
		Parent_One case_1_rule_2 = new LessonTwentyThree();  
		case_1_rule_2.message_two(); 
		
		//Case-2:  If the SUPERCLASS/PARENT method declares an exception
		//-------------------------------------------------------------------------
		
		//Rule-1: If the SUPERCLASS/PARENT method declares an exception, subclass overridden method can declare (a) same, 
		//        (b)SUBCLASS/CHILD exception or (c) no exception BUT (d) cannot declare parent exception. 
		//        (Remember: UNCHECKED EXCEPTIONS are those exceptions that are not checked at compiled time
		
		//(a) SAME Exception (Both Parent & Child)		--- CAN
		Parent_One case_2_rule_1_a = new LessonTwentyThree();
		try {
			case_2_rule_1_a.message_three();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//(b) SUBCLASS/CHILD exception					--- CAN
		Parent_One case_2_rule_1_b = new LessonTwentyThree();
		try {
			case_2_rule_1_b.message_four();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//(c) Declares NO exception						--- CAN
		Parent_One case_2_rule_1_c = new LessonTwentyThree();
		try {
			case_2_rule_1_c.message_five();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		//(d) Declares Parent Exception					--- CAN'T
		Parent_One case_2_rule_1_d = new LessonTwentyThree();
		try {
			case_2_rule_1_d.message_six();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}
}
