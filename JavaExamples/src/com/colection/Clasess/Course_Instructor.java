package com.colection.Clasess;

public class Course_Instructor {
	
	private String lastName;
	private String firstName;
	private String officeNumber;
	
	Course_Instructor (String lname, String fname, String officen){
		
		lastName = lname;
		firstName = fname;
		officeNumber = officen;
		
	}
	

	Course_Instructor (Course_Instructor object2){
		
		lastName = object2.lastName;
		firstName = object2.firstName;
		officeNumber = object2.officeNumber;
		
	}
	
	
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public String toString () {
		String str = "\nLast Name: " + lastName + "\nFirst Name: " + firstName +
					"\nOffice Number : " + officeNumber;
		return str;
	}

}
