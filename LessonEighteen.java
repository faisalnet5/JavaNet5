package com.personal.javanet5;

import java.util.ArrayList;
import java.util.Iterator;

//JavaNet5-LessonEighteen: Structural Programming 7: ArrayList

/*
	REMEMBER
	---------------------
	* ArrayList Class uses a Dynamic Array for storing the elements. It EXTENDS AbstractList class and IMPLEMENTS List Interface
	* ArrayList can contain duplicate elements
	* ArrayList maintains insertion order
	* ArrayList allows random access because it also works at INDEX basis
	* ArrayList manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the Array List
	* ArrayList class is also called 'Collection Class'

Creating ArrayList: There are two ways
	(a)	Old Way/Non Generic (Not Recommended):
	
	ArrayList myList = new ArrayList();

	(b)	New Way/Generic (Recommended):
	
	ArrayList <String> myList = new ArrayList <String> ();
	
Iterate through ArrayList: There are two ways you can iterate through ArrayList elements
	(a)	By for-each loop (Remember, Normal FOR...LOOP will not help you much)
	(b) By Iterator Interface

*/

//Related to Example-2
class Population{
	String first_name;	//Object Instance/Local Variables
	int age;
	
	//Using Constructor to set values for those above instance/local variables
	Population(String first_name, int age){
		this.first_name = first_name;
		this.age = age;
	}
}

public class LessonEighteen {

	public static void main(String[] args) {
		
		//Example-1: Create Simple Generic ArrayList with .add operator & loop through it 
		
		//Step-1: Create Generic String Type of ArrayList
		ArrayList <String> countryList = new ArrayList <String> ();
		
		//(Iteration) Checking ArrayList elements in String List Format
		System.out.println("ArrayList elements are: (Initial Stage) " + countryList.toString());
		
		//Step-2: By using .add operator add elements into ur newly created ArrayList
		countryList.add("Bangladesh");
		countryList.add("United State");
		countryList.add("Canada");
		countryList.add("Australia");
		
		//Step-3: Iterated through ur ArrayList (Testing Purpose)
		
		//(Iteration) Checking ArrayList elements in String List Format
		System.out.println("ArrayList elements are: (In String Format) " + countryList.toString());
		
		System.out.println("----------------------------------------------------");
	
		System.out.println("ArrayList elements are: (In List Format) 'FOR...EACH'");
		
		//(Iteration) Checking ArrayList elements by FOR...EACH Loop
		for (String countryName : countryList){
			System.out.println(countryName);		
		}
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("ArrayList elements are: (In List Format) 'Iterator'");
		
		//(Iteration) Checking ArrayList elements by Iterator
		Iterator<String> countryIterate = countryList.iterator(); 
		//We will learn more about Iterator in LessonThirtyFive
		
		while(countryIterate.hasNext()){
			System.out.println(countryIterate.next());  //Notice: How are we iterating through
		}
		
		//Example-2: User Defined Class Object in ArrayList
		
		//Step-1: Create Object Instances and Set it's value
		Population p1 = new Population("Steave", 65);
		Population p2 = new Population("Jason", 55);
		Population p3 = new Population("Lavery", 75);
		
		ArrayList<Population> populationList = new ArrayList<Population>();
		
		//Step-2: Entering/Adding those Object Instance Values into ArrayList (By using .add operator)
		populationList.add(p1);		//Adding Object
		populationList.add(p2);
		populationList.add(p3);
		
		System.out.println("----------------------------------------------------");
		
		//Step-3: Iterated through ur newly edited ArrayList (Testing Purpose)
		Iterator<Population> newList = populationList.iterator();
		
		while(newList.hasNext()){			
			Population pt = newList.next();
			System.out.println("First Name: " + pt.first_name + ", Age: " + pt.age);
		}
		
		System.out.println("----------------------------------------------------");
		
		//Extra-1: addAll() in ArrayList
		//Create First ArrayList
		ArrayList<String> first_ArrayList = new ArrayList<String>();
		
		first_ArrayList.add("Spring");
		first_ArrayList.add("Summer");
		first_ArrayList.add("Monsoon");
		
		//Create Second ArrayList
		ArrayList<String> second_ArrayList = new ArrayList<String>();
		
		second_ArrayList.add("Autumn");
		second_ArrayList.add("Winter");
		second_ArrayList.add("Monsoon");
		
		//Now use addAll() method
		first_ArrayList.addAll(second_ArrayList);
		
		//Finally Iterate through 'first_ArrayList' to see its elements
		Iterator<String> iterateList_one = first_ArrayList.iterator();
		
		System.out.println("Extra-1: 'first_ArrayList' -elements are: ");
		while(iterateList_one.hasNext()){
			System.out.println(iterateList_one.next());
		}
		
		//REMEMBER: addAll() method appends all of the elements of RIGHT Side Collection/List with LEFT Side Collection/List.
		//          Data duplication will be there.
		
		System.out.println("----------------------------------------------------");
		
		/*
		//Extra-2: removeAll() in ArrayList
		//Now use removeAll() method
	    first_ArrayList.removeAll(second_ArrayList);
	    
	    //Finally Iterate through 'first_ArrayList' to see its elements
  		Iterator<String> iterateList_two = first_ArrayList.iterator();
  		
  		System.out.println("Extra-2: 'first_ArrayList' -elements are: ");
  		while(iterateList_two.hasNext()){
  			System.out.println(iterateList_two.next());
  		}
  		
  		//REMEMBER: removeAll() method removes from RIGHT Side Collection/List all of its elements that are contained in
  		//          LEFT Side Collection/List
  		
  		System.out.println("----------------------------------------------------");
		*/
		
		//Extra-3: retainAll() in ArrayList
  	    //Now use retainAll() method
	    first_ArrayList.retainAll(second_ArrayList);
	    
	    //Finally Iterate through 'first_ArrayList' to see its elements
  		Iterator<String> iterateList_three = first_ArrayList.iterator();
  		
  		System.out.println("Extra-3: 'first_ArrayList' -elements are: ");
  		while(iterateList_three.hasNext()){
  			System.out.println(iterateList_three.next());
  		}
  		
  		//REMEMBER: retainAll() method removes from RIGHT Side Collection all of its elements that are not contained in the 
  		//          LEFT Side Collection. If the LEFT Side Collection is also a set, this operation effectively modifies RIGHT 
  		//          Side Collection so that its value is the intersection of the two sets.
  		
	}

}
