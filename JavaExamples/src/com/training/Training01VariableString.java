package com.training;

public class Training01VariableString {

	/**
	 * Write a program to display variable of type string.
	 * Create different types of variables, including:
	 * name, address, occuption etc.
	 * 
	 */
	
	public static String name (String firstName, String surName) {
		
		String personal = firstName + " , "+ surName;
		return personal;
	}
	
	public static String adress (String street, String streetNumber, String town) {
		
		String live = street + " street, " + " , # " + streetNumber + " , " + town;
		return live;
	}
	public static String occup (String job, String company) {
		
		String work = job + " in " + company;
		return work;
	}
	public static void main(String[] args) {
		
		String firstName = "Barbara";
		String surName = "Surname";
		String street = "Maja";
		String streetNumber = "67";
		String town = "Solna";
		String job = "coder";
		String company = "ABC AB";
		
		String personal = name (firstName, surName);
		System.out.println ("My name is : " + personal);
		
		String live = adress (street, streetNumber, town);
		System.out.println ("I live in : " + live);
		
		String work = occup (job, company);
		System.out.println ("I am : " + " a " + work);

	}

}
