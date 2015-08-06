package com.personal.javanet5;

import com.personal.javanet5.extras.LessonExtraProtected;

//JavaNet5-LessonSeven: Public, Private, Protected

public class LessonSeven extends LessonExtraProtected{
	
	public static void main(String[] args) {
		
		/*		PUBLIC		*/
		
		//Look LessonTwo for example
		
		
		/*		PRIVATE		*/
		
		//Look LessonTwo for example
		
		/*		PROTECTED		*/
		
		//Remember: Protected access modifier is accessible within package or outside the package but through inheritance only
		//          it will be exposed to its subclasses
		
		//Old Way
		//Lesson_Extra_Protected anyName = new Lesson_Extra_Protected();
		//System.out.println(anyName.myVariable);
		
		//New Way
		LessonSeven myProtectedObject = new LessonSeven();
		
		//Example-1: Access PROTECTED VARIABLE from Parent Class 'Lesson_Extra_Protected.java'
		System.out.println(myProtectedObject.myVariable);
		
		//Example-2: Access PROTECTED METHOD from Parent Class 'Lesson_Extra_Protected.java'
		myProtectedObject.myMessage();
			
		//Notice: Normally what we used to do to ACCESS PUBLIC ELEMENTS within or outside the same Package
		//		  by using 'NEW' keyword...but now we can use 'extends' key word
	
	}	
	
}
