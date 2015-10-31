package com.java.override;

class ObjectA{
	
	//Element-1: Variable(s)
	String greeting = "Welcome";
	
	//Element-2: Methods(s)
	void objectFunction(){   //Add 'final' infront of void then see...
		System.out.println("Hello from Object A");
	}
}

class ObjectB extends ObjectA{
	
	//Element-2: Method(s)
	void objectFunction(){
		System.out.println("Hello from Object B");
	}
}

public class TestOverride {

	public static void main(String[] args) {
		
		ObjectB copyObject = new ObjectB();
		copyObject.objectFunction();
		System.out.println(copyObject.greeting);
		
	}
}
