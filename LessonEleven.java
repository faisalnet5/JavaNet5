package com.personal.javanet5;

//JavaNet5-LessonEleven: Polymorphism


//Note: Polymorphism- is a concept by which we can perform a single action by different ways. 'Poly' means 'Many' and
//		'Morphs' means 'Forms'. So Ploymorphism means many forms. We can perform this Polymorphism in Java by method
//		'Overloading' and 'Overriding'

//Types of Ploymorphism: (a) Compile time Polymorphism (Example: If you overload static method in Java) and 
//						 (b) Runtime Polymorphism (Here, we will focus on this one)


//'Runtime Ploymorphism' is also called 'Dynamic Method Dispatch'

//Related to Example-1
class Birds extends Animal{  		//'extends' part is related to Example-4
	//Related to Example-3
	int speed = 90;
	
	//Related to Example-1
	void expressions(){
		System.out.println("Bird is singing...");
	}
}

//Related to Example-2
class Bank{							//Parent Class
	int getRateOfInterest(){
		return 0;
	}
}

class BAmerica extends Bank{		//Child-1
	int getRateOfInterest(){
		return 8;
	}
}

class TDBank extends Bank{			//Child-2
	int getRateOfInterest(){
		return 7;
	}
}

class CitizenBank extends Bank{		//Child-3
	int getRateOfInterest(){
		return 9;
	}
}

//Related to Example-4 (Multilevel Inheritance)
class Animal{
	void expressions(){
		System.out.println("----- All animal have different expressions -----");
	}
}

public class LessonEleven extends Birds{
	
	//Related to Example-1 (Overridding Parent Class Method)
	public void expressions(){
		System.out.println("Bird is singing... 'kuu' 'kuu' 'kuu'");
	}
	
	//Related to Example-3 (Overridding Parent Class Data Member/Instance Variable)
	int speed = 120;

	public static void main(String[] args) {
		
		//Example-1: Example of Runtime Ploymorphism
		Birds birdObject = new LessonEleven();  //This is called 'UPCASTING'
		birdObject.expressions();
		
		//Example-2: Real Example taken from JavaTPoint.com
		Bank b1 = new BAmerica();
		Bank b2 = new TDBank();
		Bank b3 = new CitizenBank();
		
		System.out.println("Bank of America: Rate of Interest is " + b1.getRateOfInterest());
		System.out.println("TD Bank: Rate of Interest is " + b2.getRateOfInterest());
		System.out.println("Citizen Bank: Rate of Interest is " + b3.getRateOfInterest());
		
		//Example-3: Polymorphism with Data Member/Instance Variable
		System.out.println("Our Selected Bird can fly " + birdObject.speed + " m/hr !!!");    //What will it Print?
		
		//Remember: Runtime Ploymorphism can't be achieved by Data Member/Instance Variable
		
		//Example-4: Polymorphism with Multilevel Inheritance
		Animal first_instance, second_instance, third_instance;   //An way for creating local variable with Object type
																  //In Java World this is called 'AGGREGATION'
		
		//Creating different instances on local variables
		first_instance = new Animal();
		second_instance = new Birds();
		third_instance = new LessonEleven();
		
		//Now observe, how Ploymorphism works ;)
		first_instance.expressions();
		second_instance.expressions();
		third_instance.expressions();
				
		//So what is ur Conclusion on Polymorphism....lol 
	}
	
}

//Remember: UPCASTING- When 'Reference Variable' of PARENT Class refers to the Object of CHILD Class, then that mechanism
//			is called UPCASTING

