package com.colection.Clasess;

public class Course  {
	
	private String courseName;
	private Course_Instructor instructor;
	private Course_TextBook textBook;
	
	Course (String name, Course_Instructor instructor, Course_TextBook textBook){
		
		this.courseName = name;
		this.instructor = new Course_Instructor (instructor);
		this.textBook = new Course_TextBook (textBook);
		
	}
	

	public String getCourseName() {
		return courseName;
	}
	
	public Course_Instructor getInstructor() {
		return instructor;
	}
	
	public Course_TextBook getTextBook() {
		return textBook;
	}
	
	
	
	public String toString() {
		String str = "Course name : " + courseName + "\n" +
					 "\nInstructor Information: " + instructor + "\n"+
					 "\nText Book Information : " + textBook;
		
		return str;
	}

}
