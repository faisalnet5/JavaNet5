package com.personal.javanet5.extras;

//Note: This Class is related to LessonEight: Constructor
public class LessonPrivateConstructor {
	
	//Create static class reference
	private static LessonPrivateConstructor privateConstructor = null;
	
	//Make your Constructor Private so that no one can Instantiate this class directly
	private LessonPrivateConstructor(){
		
	}
	
	//Write a method which will manually create the object if that object is not created
	public static LessonPrivateConstructor manuallyCreate(){
		
		if(privateConstructor == null){
			privateConstructor = new LessonPrivateConstructor();
		}
		
		return privateConstructor;
	}
	
	public void display(){
		System.out.println("Example of a Private Constructor");
	}
	
	public static void main(String[] args) {	
		
		//For making this Class Constructor Private, any other Class/Object cannot be inherited from it.
		//This way we are creating a pressure to other Class/Object via the Public method given in this class
		
		LessonPrivateConstructor objInstance = LessonPrivateConstructor.manuallyCreate();
		System.out.println("Private");
		objInstance.display();
	}
}

/* NOTE ON PRIVATE CONSTRUCTOR
 =======================================
 
 (1)	We can make constructor as private. So that We can not create an object outside of the class.
 (2)	This property is useful to create singleton class in java.
 (3)	Singleton pattern helps us to keep only one instance of a class at any time.
 (4)	The purpose of singleton is to control object creation by keeping private constructor.
*/
