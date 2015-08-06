package com.personal.javanet5;

//JavaNet5-LessonTen: Encapsulation

//Note: Encapsulation- is a process of wrapping code and data together into a single unit. Example: Capsule (mixed of several medicines)
//					   We can create a fully encapsulated class in Java by making all the data members of that class PRIVATE. Then use
//					   GETTER and SETTER to Get or Set the Data.
//					   One very common example is: Java Been Class (POJO- We will know that later)

//Advantage of Encapsulation: (a) By providing only Getter and Setter method, you can make the class READ-ONLY or WRITE-ONLY 
//							  (b) It provides you the Control over Data (Example: Set value greater than 100 only)

//Related to Example-1
class FamilyTree{
	
	private int members;

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		
		if(members >= 5){
			System.out.println("Man! Come on....protect the Future :(");
		}else{
			this.members = members;
			System.out.println("You are Good ;) Controlling highbried Man...lol");
		}		
	}	
}

public class LessonTen extends FamilyTree{

	public static void main(String[] args) {
		
		//Example-1: Simple example of Encapsulation
		FamilyTree totalMembers = new LessonTen();		//This is we are doing just because of Main()
		
		totalMembers.setMembers(5);						//Change this value and the fun :)
		totalMembers.getMembers();
	}

}
