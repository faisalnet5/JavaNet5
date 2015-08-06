package com.personal.javanet5;

//All the imported Packages/Libs/Jars needed for ur Application
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//JavaNet5-LessonFour: Getter & Setter Methods (this)/ POJO Object

//In File Object but outside the Main Class, which we will access from our Main method
class CurrentDate{
	
	String current_date;	//This is called INSTANCE Variable

	public String getCurrent_date() {
		return current_date;
	}

	public void setCurrent_date(String current_date) {
		this.current_date = current_date;	//What .this is referring to?
	}
}

public class LessonFour {

	public static void main(String[] args) {
		
		//Preparing current date and it's format by using Java Util Class
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date(); //Choose java.util.date
		
		//Create a new instance of the object and use its GETTER and SETTER methods
		CurrentDate currentDate = new CurrentDate();
		
		//Setting current date
		currentDate.setCurrent_date(dateFormat.format(date));
		
		//As u setted the object with ur formated Date, so now u can access as follows:
		System.out.println("Cuttent Date and Time is: " + currentDate.getCurrent_date());
	}
}

/* 		Tips:
 *      ------------------
 * 		1) 	Don't forget that to import all necessary items (can come from same or different) packages/libs/jars, 
 *          inside ur Main Function just press Ctrl + Shift + O. Automatically they will be imported to ur Project.
 *          
 */