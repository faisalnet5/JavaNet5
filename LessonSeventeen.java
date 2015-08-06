package com.personal.javanet5;

//JavaNet5-LessonSeventeen: Structural Programming 6: Multi-dimensional Array

/*
	REMEMBER:
		
	(a)	Syntax to Declare an 2D-Array in Java
		(1) dataType[][] array_name;  OR  (2) dataType [][]array_name;  OR  (3) dataType array_name[][];  OR  (4) dataType []array_name[];
		
	(b)	Declaration and Instantiation of an 2D-Array in Java
		int a[][] = new int[3][3];     
		
		Then you can do initialization as follows: a[0][0] = 1;
	
	(c)	Example of Declaration, Instantiation and Initialization of Java 2D-Array (SMART WAY)
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

*/

public class LessonSeventeen {

	public static void main(String[] args) {
		
		//Example-1: Simple Multidimensional Array
		//Declaration, Instantiation and Initialization 2D-Array as follows:
		int multiDimensions[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		System.out.println("Displaying Multidimensional Array: ");
		
		for (int i=0; i<multiDimensions.length; i++){					//Great example of a NESTED FOR LOOP
			for(int j=0; j<multiDimensions.length; j++){
				System.out.print(multiDimensions[i][j] + " ");
			}
			System.out.println();
		}
		
		//Show the value of ur defined MultiDimensions Array @location [3][3]
		//Change the value of ur defined MultiDimensions Array @location [3][3]
		
		System.out.println("--------------------------------");
		
		//Example-2: Addition of 2 Arrays/Matrices in Java (This Example is taken from JavaTPoint.com)
		
		//Step-1: Creating two MultiDimensional Arrays
		int x[][]={{1,3,4},{3,4,5}};
		int y[][]={{1,3,4},{3,4,5}};
		
		//Step-2: Create one more MultiDimensional Array to store the SUM of above two MultiDimensional Arrays
		int z[][]=new int[2][3];
		
		System.out.println("Summation Result: ");
		//Step-3: Finally traverse ur defined Arrays and do the Summation
		for (int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				z[i][j]=x[i][j]+y[i][j];
				System.out.print(z[i][j] + " ");
			}
			System.out.println();
		}
			
	}

}
