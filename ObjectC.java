package com.java.protect_world_access_two;

import com.java.protect_world.ObjectA;

//Child-2
public class ObjectC {
	
	ObjectA myObjectC = new ObjectA();
	
	public void details(){
		System.out.println("My Suzuki color is: " + myObjectC.color + ", and Runs: ");
		myObjectC.run();
	}
}
