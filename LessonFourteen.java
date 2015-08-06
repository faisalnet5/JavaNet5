package com.personal.javanet5;

//JavaNet5-LessonFourteen: Structural Programming 3: Do..While Loop

public class LessonFourteen {

	public static void main(String[] args) {
		
		//Related to Example-1
		int x = 1;
		
		//Example-1: Basic Do...While
		do{
			System.out.println("See, at least I printed once ;)");
			x++;
		}while(x < 1);
		
	}

}

/* NOTE: 
----------------------
 (1) U can use same 'break' and 'continue' keywords in Every Looping 
 (2) When should u use 'do...while' and just 'while' loop? (Ans: Basic difference between 'do...while' and 'while'
     is, 'do...while' will be executed at least once. Now if u need that condition to impose in ur code then use
     'do...while'
 (3) Remember that every 'do...while' loop can be written as a 'while' loop by running the body once before the 
     loop begins		
*/