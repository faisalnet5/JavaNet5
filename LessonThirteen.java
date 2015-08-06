package com.personal.javanet5;

//JavaNet5-LessonThirteen: Structural Programming 2: While Loop

public class LessonThirteen {
	//int x = 10;        //What if u declare integer x here?

	public static void main(String[] args) {
		//Related to Example-1
		int x = 1;
		
		//Related to Example-2
		int y = 1;
		
		//Related to Example-3
		int z = 1;
		
		//Example-1: Basic While Loop
		while(x <= 10){
			System.out.println("Value of X is: " + x);
			x++;
		}
		System.out.println("--------------------------------------------");
		//Example-2: While Loop with 'BREAK'
		while(y <= 10){
			System.out.println("Value of Y is: " + y);
			y++;
			if(y == 5){
				break;
			}	
		}
		System.out.println("Y is 5; So BREAKED");
		
		System.out.println("--------------------------------------------");
		//Example-3: While Loop with 'CONTINUE'
		while(z <= 10){
			System.out.println("Value of Z is: " + z);
			z++;
			if(z == 5){
				System.out.println("Yahoooooooooooooooooooo");
				continue;
			}			
		}
	}
}
