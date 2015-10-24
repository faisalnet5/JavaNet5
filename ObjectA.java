package com.java.protect_world;

//Parent
public class ObjectA {

	//Element-1: Variables
	public String color = "Silver";
	protected String mb_color = "Blue";
	
	//Element-2: Methods
	public void run(){
		System.out.println("Runs good... :/");
	}
	protected void mb_run(){
		System.out.println("Abar gegau... ;)");
	}
}

/*
Remember: Protected variables and methods allow the class itself to access them, classes inside of the same package to access them,
and subclasses (means who is EXTENDING) of that class to access them.
*/
