package com.personal.javanet5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//JavaNet5-LessonTwentySix: Reading Files using Scanner & FileReader
//This Class/Object needs an external file named 'LessonExtraStream.txt' which you will find in our course materials

public class LessonTwentySix {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String fileSource = "C:/Users/Quazi/Desktop/LessonFileReadWrite.txt";
		
		/************************ Reading Files using Scanner ************************/
		try{
			//Step-1: Create an instance of File for 'LessonExtraStream' 
			File file = new File(fileSource); //Notice the file source
			//Create your own file/copy 'LessonExtraStream.txt' on your desktop before you run this program
			
			//Step-2: Create a new Scanner object which will read the data from the file passed in
			Scanner scanner = new Scanner(file);
			
			//Step-3: To check if there are more line to read from it we check by calling the scanner.hasNextLine() method
			while (scanner.hasNextLine()) {
                                String line = scanner.nextLine();
                                System.out.println("READING FILE (Scanner) > " + line.toUpperCase());  //.toUpperCase() -will make all text upper case	
                        }
		}catch(Exception e){
			System.out.println("Error occured while reading File! " + e);
		}	
		
		System.out.println("----------------------------------------------------");	
		
		/************************ Reading Files with File Reader ************************/
		
		List<String> records = new ArrayList<String>();
		try{
			BufferedReader reader = new BufferedReader(new FileReader(fileSource));
			String line;
		    
			while ((line = reader.readLine()) != null)
		    {
		      records.add(line);
		      System.out.println("READING FILE (FileReader) > " + line.toUpperCase());
		    }
		    reader.close();
		    
		}catch(Exception e){
			System.err.format("Exception occurred trying to read '%s'.", fileSource);
		    e.printStackTrace();
		}
		
		//Note: This example is showing both 'Scanner' and 'FileReader' side-by-side so that you can see their major differences
	}
}