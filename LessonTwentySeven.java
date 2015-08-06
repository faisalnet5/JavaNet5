package com.personal.javanet5;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

//JavaNet5-LessonTwentySeven: Creating and Writing Text Files

public class LessonTwentySeven {

	public static void main(String[] args) {
		
		//Very First Step: Create an original File (i.e. on your Desktop), define its source path and use Java FILE Class to create an instance of it
		String fileSource = "C:/Users/Quazi/Desktop/LessonFileReadWrite.txt";
		File file = new File(fileSource);
		
		/* >>>>>>>>>>> WRITING INTO FILE <<<<<<<<<<<< */
		
		//Example-1: 'FileWriter' way of Writing into a File. This character streams class is used to write the strings, arrays or characters data directly into file   
		try { 
			//Check whether the File is already there or not if
			if(!file.exists()) { 				
				file.createNewFile();
				System.out.println("Example [FileWriter] > New File is Created!");			
			}else{ 
				System.out.println("Awesome! File exists ;)");
			 
				FileWriter fw = new FileWriter(file,true);	//CAREFUL: By adding 'true' with argument we are enabling APPEND mechanism
															//Or it will erase the whole file and add the new String from buffer
				// Always wrap FileWriter in BufferedWriter.
	            BufferedWriter bw = new BufferedWriter(fw);		
	            //Note: We could directly write into 'outputStream' but adding this extra layer adds more efficiency than to write data directly into a stream.
				// 		It uses an internal buffer to store data which boost overall I/O performance (Always Recommended)
	            
	            bw.write("\nText -7 > Hello World -7"); //For new line we can use '\n' or bw.newLine();
				bw.flush();		//flush(): The method flushes the output stream and forces any buffered output bytes to be written out. 
				
				// Always close files.
	            bw.close();
				fw.close(); 
			} 
		}catch(Exception e){ 
			e.printStackTrace(); 
		}
		
		//Notice: 'FileWriter' goes with 'BufferedWriter' and we use Buffering technique to make I/O performance faster ;)
		
		System.out.println("---------------------------------");
		
		// Example-2: 'FileOutputStream' way of Writing into a File. This bytes stream class is used to handle raw binary data
		try { 
			//Check whether the File is already there or not if
			if(!file.exists()) { 				
				file.createNewFile();
				System.out.println("Example [FileOutputStream] > New File is Created!");			
			}else{ 
				System.out.println("Awesome! File exists ;)");
				
				String newLine = "\nText -7 > Hello World -7";
	            byte[] buffer = newLine.getBytes();
				
				FileOutputStream outputStream = new FileOutputStream(file, true);	//CAREFUL: By adding 'true' with argument we are enabling APPEND mechanism
																					//Or it will erase the whole file and add the new String from buffer
				
				BufferedOutputStream bout=new BufferedOutputStream(outputStream);   
				
				bout.write(buffer);
				bout.flush();  					
				
				// Always close files
				bout.close();
				outputStream.close();       	//close() MUST be called after all other functions such as flush()

	            System.out.println("Wrote " + buffer.length + " bytes");			
			}
		}catch(Exception e){ 
			e.printStackTrace(); 
		}
		
		//Remember: To write BINARY data into file, you have to convert the data into bytes and then only save it into file.
		//Notice: 'FileOutputStream' goes with 'BufferedOutputStream' and we use Buffering technique here also to make I/O performance faster ;)
		
		System.out.println("---------------------------------");
		
		/* >>>>>>>>>>> READING FROM FILE <<<<<<<<<<<< */
		
		//Example-3: 'FileReader' way of Reading a File. If you want to read an ordinary text file in your system's default encoding, use FileReader and wrap it in a 'BufferedReader'
		String line = null; // This will reference one line at a time

		try {
			if (file.exists()) {
				FileReader fr = new FileReader(fileSource);

				// Always wrap FileReader in BufferedReader.
				BufferedReader br = new BufferedReader(fr);

				while ((line = br.readLine()) != null) {
					System.out.println("Example [FileReader] > " + line);
				}

				// Always close files.
				br.close();
				fr.close();

			} else {
				System.out.println("Error: File is NOT exists");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------");
	
		//Example-4: FileInputStream way of Reading a File. If you want to read a binary file, or a text file containing 'weird' characters use FileInputStream
		try {
			
            byte[] buffer = new byte[1000];		// Use this for holding/reading the data. And this is the shortcoming of it! 
            
            FileInputStream inputStream = new FileInputStream(file);
            
            while((inputStream.read(buffer)) != -1) {          	
            	System.out.println(new String(buffer));		//Convert to String so we can display it. Don't do this with a 'real' binary file
            }
            
            // Always close files.
            inputStream.close();       
            
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//Notice: Instead of wrapping FileInputStream in a buffer, FileInputStream defines a method called read() that lets you fill a buffer with data
		
		System.out.println("--------------------------------- Extra-1");
		
		//Extra-1: Check is a file is HIDDEN in Java
		if(file.isHidden()){
    		System.out.println("Extra-1 > This file is hidden");
    	}else{
    		System.out.println("Extra-1 > This file is not hidden");
    	}
		
		System.out.println("--------------------------------- Extra-2");
		
		//Extra-2: Check is a file is ReadOnly in Java
		if(file.canWrite()){
	   	     System.out.println("Extra-2 > This file is writable");
	   	}else{
	   	     System.out.println("Extra-2 > This file is read only");
	   	}  
		
		//Note: To make a File ReadOnly in Java just use: file.setReadOnly();
	}

}
