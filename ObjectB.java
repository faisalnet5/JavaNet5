package com.java.protect_world_access_one;

import com.java.protect_world.ObjectA;
import com.java.protect_world_access_two.ObjectC;

//Child-1
public class ObjectB extends ObjectA{
	
	public static void main(String[] args){
		
		ObjectB myObjectB = new ObjectB();
		System.out.print("My Mercedes-Benz color is: " + myObjectB.mb_color + ", and Runs: ");
		myObjectB.mb_run();
		
		System.out.println("-----------------------------------------------");
		
		ObjectC accessObjectC = new ObjectC();
		accessObjectC.details();
	}
}

/*
Notice: By using 'extends' Object B is becoming subclass/child of Object A
*/
