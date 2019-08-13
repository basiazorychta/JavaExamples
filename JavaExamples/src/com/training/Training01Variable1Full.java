package com.training;

import java.util.Scanner;

public class Training01Variable1Full {

	/**
	 * Write a program to including all types of variables in one program. 
	 * Create a display "student information program" and display student information
	 * including: name, address, phone number, email address, height, weight.
	 * 
	 */
	
	public static void Student () {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Add your name : ");
		String name = scan.nextLine();
		
		System.out.println ("Add your surmane :");
		String surName = scan.nextLine();
		
		System.out.println ("Add your email :");
		String email = scan.nextLine();
		
		System.out.println ("Add your phone# : ");
		int phone = scan.nextInt();
		
		System.out.println ("How old are you? : ");
		int age = scan.nextInt();
		
		System.out.println ("What is your weight : ?");
		double weight = scan.nextDouble();
		
		
		
		System.out.println("Your name is : " + name + " " + surName);
		System.out.println("Your email is : " + email);
		System.out.println("Your phone# is : " + phone);
		System.out.println ("You are : " + age);
		System.out.println ("Your wieght is : " + weight + " - Eat more vegetables");
		
	}
	public static void main(String[] args) {
		Student ();

	}

}
