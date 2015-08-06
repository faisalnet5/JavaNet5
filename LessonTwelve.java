package com.personal.javanet5;

//JavaNet5-LessonTwelve: Structural Programming 1: Conditions (Mainly IF...ELSE statement)

public class LessonTwelve {

	public static void main(String[] args) {
		
		//Related to Example-1
		int salary = 90000;								//What these all initializations called?
		
		//Related to Example-2
		int a = 27;
		int b = 30;
		int max;
		
		//Related to Example-3
		int grade = 97;
		
		//Related to Example-4 & 5
		int user = 45;
		
		//Example-1: Simple Basic on IF...ELSE statement
		if(salary > 75000){
			System.out.println("Owala! U r heighly paied ;)");
		}else{
			System.out.println("Don't worry, Ur salary will be evaluated :)");
		}
		
		//Example-2: IF...ELSE statement (Smart way!)
		max = (a > b) ? a : b;
		System.out.println("Maximum Number is: " + max);
		
		//Example-3: IF...ELSEIF statement (Basic)
		if(grade > 90){
			System.out.println("Congratulation! A+");
		}else if(grade >= 85){
			System.out.println("Good, A-");
		}else{
			System.out.println("Please work hard :(");
		}
		
		//Example-4: IF...ELSEIF with different Operators
		if(user <=18){
			System.out.println("User is 18 or younger");
		}else if (user > 18 && user < 40){
			System.out.println("User is between 19 and 39");
		}else if (user == 45 || user == 50){
			System.out.println("User is either 45 or 50");
		}else{
			System.out.println("User is older than 40");
		}
		
		/*NOTE on OPERATORS
		 -----------------------
		 	(1)	use > for Grater Than
		 	(2)	use < for Less Than
		 	(3)	use >= for Grater Than or Equal To
		 	(4)	use <= for Less Than or Equal To
		 	(5)	use && for AND
		 	(6)	use || for OR
		 	(7)	use == for HAS a value of
		 	(8)	use ! for NOT	 
		*/	
		
		//Example-5: Nested IF Statement
		if (user >= 45){		//Program will go inside this condition only if condition is TRUE
			if(user > 34 && user < 60){
				System.out.println("USER: Plz consider urself still young ;)");
			}else{
				System.out.println("Either User is too Young or too Old :) ");
			}
		}
		
	}

}
