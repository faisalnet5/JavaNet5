package com.personal.javanet5;

/*
ENCAPSULATION (KNOWN AS DATA HIDING): The whole idea behind encapsulation is to hide the implementation details from users. Other way to say, It is a 
process of wrapping code and data together into a single unit which is not accessible to outsiders (unless you give permission). 
Example: Capsule (inside mixed of several medicines)

We can create a fully encapsulated class in Java by making all the data members of that class PRIVATE. Then use GETTER and SETTER to Get or Set the Data.
One very common example is: Java Been Class (POJO- Which we already know)

*/

class FamilyTree{
	
	//Element-1: Variable(s)
	private static int members;
	
	//Element-2: Method(s)
	public static int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		FamilyTree.members = members;
		
		if(members >= 4){			
			System.out.println("Man! Come on....protect the Future :(");
		}else{
			System.out.println("You are the Man ;) Controlling highbried...lol");
		}	
	}
	
	//Element-3: Constructor(s)  | Notice it's signatures	
	FamilyTree(int pass_members){
		this.setMembers(pass_members);	//'this' is optional
	}
}

//Factory Class/Object Code
class FactoryReport {		//We are encapsulating report creation logic in one method
	public static FamilyTree createReport(int pass_members) {
		return new FamilyTree(pass_members);	//Will look for proper Constructor Signature
	}
}

//Factory Client Code
public class FunWithEncapsulation{

	public static void main(String[] args) {
		
		//Example: Encapsulation with Factory Pattern
		FactoryReport.createReport(4);	
		
		System.out.println("------------------------------------------");
		
		System.out.println("Reading passing total members: " + FamilyTree.getMembers());
	}

}

/*
NOTE: 
Many design pattern in Java uses encapsulation concept, one of them is 'Factory pattern' which is used to create objects

Advantage of Encapsulation: 
(a) It improves maintainability and flexibility and re-usability
(b)	By providing only Getter and Setter method, you can make the class READ-ONLY or WRITE-ONLY 
(c) User would not be knowing what is going on behind the scene

>> HOME WORK: Try to implement this same example in Scenario-2 (Same Package but Different File) and Scenario-3 (Different Package and Different File)
*/

