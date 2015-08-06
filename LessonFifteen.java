package com.personal.javanet5;

//JavaNet5-LessonFifteen: Structural Programming 4:	For Loop

//FOR LOOP: Is an efficient Repetition Control Structure. It is useful to use when you know how many times a task is to be repeated

public class LessonFifteen {

	public static void main(String[] args) {
		//Related to Example-1
		//int i = 5;				//So u can define int 'i' here or directly in FOR LOOP Statement 
		
		//Related to Example-2 (Integer vs String Type ARRAY)
		//Just try to remember how we r defining an Array (int vs String type). Details will see in LessonSixteen
		int [] number = {9, 3, 7, 1};	
		String  [] mylist = {"Nine", "Three", "Seven", "One"};
		
		//Example-1: For Loop (Old Way)
		for (int i=5; i <=10; i++){
			System.out.println("Value of 'i' is: " + i);
		}
		
		System.out.println("--------------------------------");
		
		//Example-2: For Loop (New Way - Mainly used for ARRAYs)
		for (int j : number){
			System.out.println("Value of 'j' is: " + j);
		}
		
		System.out.println("--------------------------------");
		
		for (String list : mylist){
			System.out.println("My String Array List: " + list);
		}
		
		System.out.println("--------------------------------");
		
		//Example-3: NESTED For Loop (with Old Way)
		for (int a = 1; a <= 9; a ++){
			for (int b = 1; b < a; b++){
				System.out.print("*");				
			}	
			System.out.println();
		}
		
	}

}

/* NOTE: 
----------------------
 (1) U can use same 'break' and 'continue' keywords in Every Looping 
 (2) ARRAY: is used to store a collection of Data. It stores a fixed-size sequential collection of elements of same type
 		
*/