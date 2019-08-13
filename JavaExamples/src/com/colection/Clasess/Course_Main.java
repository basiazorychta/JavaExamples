package com.colection.Clasess;

public class Course_Main {

	public static void main(String[] args) {
		
		Course_Instructor myInstructor = new Course_Instructor ( "Kramer", "Shawn", "RH3010");
		Course_TextBook myTextBook = new Course_TextBook ("Starting Out with Java", "Gaddis", "Pearson");
		Course myCourse = new Course ("Intro to Java", myInstructor, myTextBook);
		
		System.out.println(myCourse.toString());
		


	}

}
