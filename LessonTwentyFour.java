package com.personal.javanet5;

//JavaNet5-LessonTwentyFour: Try-and-catch/Try-with-resources

/*
Note: Try-and-catch block we use to enclose the code that might throw an exception. It must be used within the method.
	  Many times Try Block can also be followed by 'finally' block.
	  
Syntax for 'Try-and-catch' block is as follows:
	  try{
	  	//code that may throw exception
	  }catch(Exception_Class_Name refVariable){
	  	//Your way of presenting caught exception
	  }
	  
Syntax for 'Try-and-finally' block is as follows:
	  try{
	  	//code that may throw exception
	  }finally{
	  	//Your last/final tasks
	  }

Both Catch and Finally block must be used after the Try Block only
*/

//Related to Example-5:
class FileSecurity implements AutoCloseable{
	@Override
	public void close() throws Exception {			//What benefit we will get by this close() method?
		System.out.println("Example-5 > File is now Closed.");
		
		/*Remove this comment to analyze how we can manually create Exception
		//Another way we can throw exception manually as follows:
		throw new Exception("Oh No !!!  :)");		//Thanks John for using such nice example in his note
		*/
	}
}

//Related to Example-6: Custom Implementation of AutoCloseable
class Lion implements AutoCloseable{
	public Lion(){
		System.out.println("Example-6 > LION is OPEN in the wild.");
	};
	
	public void hunt() throws Exception {
		throw new Exception("Example-6 > DeerNotFound says Lion!");
	};

	public void close() throws Exception {
		System.out.println("Example-6 > LION is CLOSED in the cage.");
		throw new Exception("Example-6 > Unable to close the cage!");
	};
}

class Tiger implements AutoCloseable {
	public Tiger() {
		System.out.println("Example-6 > TIGER is OPEN in the wild.");
	};

	public void hunt() throws Exception {
		throw new Exception("Example-6 > DeerNotFound says Tiger!");
	};

	public void close() throws Exception {
		System.out.println("Example-6 > TIGER is CLOSED in the cage.");
	};
}

public class LessonTwentyFour {

	public static void main(String[] args) {
		
	/* =========== Try-and-catch BLOCK =========== */
		
		/* Remove this Comment Block to understand Why we need Try-and-catch Block
		
		//Notice what will happen when we write the following code and execute:
		 
		int result_one = 50/0; 		//May throw Exception-right?
		System.out.println("We are in LessonTwentyFour !!! Presenting result: " + result_one);
		
		//After this program execution we will be seeing an Exception related to 'ArithmeticException' in console
		
		*/
		
		//Example-1: Solution based on simple Try-and-catch block
		try{
			int result_two = 50/0; 		//May throw Exception-right?
			System.out.println("Example-1 > We are in LessonTwentyFour !!! Presenting result: " + result_two);
			
		}catch(ArithmeticException e){
			System.out.println("Example-1 > Sorry, Program cannot run due to Exception: " + e);
		}
		
		System.out.println("--------------------------------");
		
		//Example-2: Implementing 'Multi-Catch block'
		//Note: If you have to perform different tasks at the occurrence of different Exceptions, then use this 'Multi-Catch block'
		try{
			int myArray[] = new int [3];
			
			myArray[1] = 20/2;
			
			myArray[2] = 30/2;		//What is we change the index value to 5!
			
			System.out.println("Example-2 > Two values in our Array are: " + myArray[1] +", " + myArray[2]);
			
		}catch(ArithmeticException e){
			System.out.println("Example-2 > Sorry, Program cannot run due to Exception: " + e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Example-2 > Sorry, Program cannot run due to Exception: " + e);		
		}catch (Exception e) {
			System.out.println("Example-2 > Sorry, Program cannot run due to Exception: " + e);	
		}

		//Remember: 
		//	* At a time ONLY One Exception is occurred and at a time ONLY One Catch Block is executed
		//	* All Catch blocks must be ordered from most specific to most general (i.e. Catch for 'ArithmeticException' must
		//    come before Catch for 'Exception'.
		
		System.out.println("--------------------------------");
		
		//Example-3: Example on Nested TRY Block
		//Note: Sometimes a situation may arise where a part of a block may throw one Exception/Error and the entire block itself
		//      may throw another Exception/Error. In such cases use Nested Exception handling techniques as follows:
		try{
			//Task-1 (Division Problem)
			try{
				int result_three = 40/0;
				System.out.println("Example-1 > We are in LessonTwentyFour !!! Presenting result: " + result_three);
				
			}catch(ArithmeticException e){
				System.out.println("Example-3-a > Sorry, Program cannot run due to Exception: " + e);
			}
			
			//Task-2 (Array Indexing Problem)
			try{
				int myArray[] = new int [3];
				
				myArray[5] = 200;		//Can we do that?
				
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Example-3-b > Sorry, Program cannot run due to Exception: " + e);
			}
			
		}catch(Exception e){
			System.out.println("Example-3-Main > Sorry, Program cannot run due to Exception: " + e);
		}
		
		System.out.println("--------------------------------");
		
		//Example-4: Try-and-catch block with 'finally' Block
		//Note: Finally Block is used to execute important code such as closing DB connection, stream etc. by must following
		//		a TRY or CATCH block. It is always executed whether exception is handled or not.
		
		
		//Case-1: 'finally block' where exception dosen't occurred
		try{
			int result_four_a = 40/2;
			System.out.println("Example-4-a > We are in LessonTwentyFour !!! Presenting result: " + result_four_a);
			
		}catch(ArithmeticException e){
			System.out.println("Example-4-a > Sorry, Program cannot run due to Exception: " + e);
		}finally{
			System.out.println("Example-4-a > Finally Block is always Executed !!!");
		}
		
		/*Remove this Comment to analyze Case-2
		//Case-2: 'finally block' where exception dose occurs but not handled
		try{
			int result_four_b = 40/0;
			System.out.println("Example-4-b > We are in LessonTwentyFour !!! Presenting result: " + result_four_b);
			
		}catch(NullPointerException e){		//Can we deal 'ArithmeticException' with 'NullPointerException'??  NO!!!
			System.out.println("Example-4-b > Sorry, Program cannot run due to Exception: " + e);
		}finally{
			System.out.println("Example-4-b > Finally Block is always Executed !!!");
		}
		*/
		//Note: If we don't comment our this above code then Case-3 will be effected only because in Case-2 we didn't Handle
		//		exception properly as we suppose to be
		
		//Case-3: 'finally block' where exception occurs and handled
		try{
			int result_two = 50/0; 		//May throw Exception-right?
			System.out.println("Example-4-c > We are in LessonTwentyFour !!! Presenting result: " + result_two);
			
		}catch(ArithmeticException e){
			System.out.println("Example-4-c > Sorry, Program cannot run due to Exception: " + e);
		}
		
		//Remember: 
		//	* If we do not handle exception before terminating our program, JVM then at least surely will executes 'finally
		//	  block' (if any)
		//	* For each TRY Block there can be ZERO or more Catch Block(s), but ONLY One 'Finally Block'
		
		System.out.println("--------------------------------");
		
	/* =========== TRY-WITH-RESOURCES BLOCK =========== */
		
		//Example-5: Simple example on TRY-WITH-RESOURCES BLOCK (We can use this technique only on Java 7 and on)
		//			 Today this technique is known as 'Automatic Resource Management' (ARM)
		try(FileSecurity fileSecurity = new FileSecurity()){  //Notice: How nicely we are creating an Instance of an Object
			System.out.println("Example-5 > File is read !");			  //        and passing that as a resource parameter.
		}catch (Exception e) {
			e.printStackTrace();  	//Another way we can print Exceptions in Console
		}
		
		//Remember: If there are multiple resources to be closed and an exception is thrown during closing of one resource,
		//          irrespective of that particular exception, all the resources will be closed by this 'AutoCloseable' Class.
		
		//Note: This above example-5 is just a simulation on File Read/Write by using TRY-WITH-RESOURCES Technique, NOT
		//      a real example. We will learn more and see real example in LessonTwentySix and LessonTwentySeven.
		
		System.out.println("--------------------------------");
		
		//Example-6: Nice example on Custom Implementation of AutoCloseable
		//(This particular example is taken from 'javapapers' by Joseph Kulandai (Joe))
		try (Lion lion = new Lion(); Tiger tiger = new Tiger()) {
			lion.hunt();
			tiger.hunt();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Example-6 > Finally.");
		}
		
	}

}
