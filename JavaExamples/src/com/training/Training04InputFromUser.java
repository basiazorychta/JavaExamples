package com.training;

import java.util.Scanner;

public class Training04InputFromUser {

	/**
	 * Write a program which can take input from user and display result on screen.
	 * Input should be as follow:

	 * Enter Your name:
	 * Enter your age:
	 * 
	 * Enter your height:
	 * Enter your weight:
	 * 
	 * Enter your address:
	 * Enter your email address:
	 * 
	 */
	
	public static void inputUser () {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Enter Your name: ");
		String name = scan.nextLine();
		
		System.out.print ("Enter Your age: ");
		int age = scan.nextInt();
		
		System.out.print ("Enter Your height in cm: ");
		int height = scan.nextInt();
		
		System.out.print ("Enter Your weight in kg: ");
		int weight = scan.nextInt();
		
		System.out.print ("Enter Your adress (city): ");
		String adress = scan.next();
		
		System.out.print ("Enter Your email: ");
		String email = scan.next();
		
		System.out.print ("My name is " + name + ".");
		System.out.print (" I am " + age + " years old. ");
		System.out.print ("I am " + height + " cm " + " and my weight is " + weight + " kg. ");
		System.out.print ("I am living in " + adress + " and my email is: " + email + ".");
		
	}
	
	/** Write a progranm examination control program which should perform following tasks.
	 * 
	 * Enter Student name:
	 * Enter student roll number:
	 * 
	 * Enter Maths marks:
	 * Enter Biology marks:
	 * Enter Computer Marks: 
	 * Enter Urdu Marks:
	 * Enter English marks: 
	 * 
	 * Student total marks ____ out of 500. 
	 * Student average marks are: 
	 * 
	 * Note: 
	 * Formula for average marks is (student marks / number of subjects)
	 */
	
	public static void studentMark () {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Add your name: ");
		String name = scan.next();
		
		System.out.print ("Enter your roll number: ");
		int number = scan.nextInt();
		
		System.out.print ("Enter Math marks: ");
		int math = scan.nextInt();
		
		System.out.print ("Enter Biology marks: ");
		int biology = scan.nextInt();
		
		System.out.print ("Enter Computer marks: ");
		int computer = scan.nextInt();
		
		System.out.print ("Enter Urdu marks: ");
		int urdu = scan.nextInt();
		
		System.out.print ("Enter English marks: ");
		int english = scan.nextInt();
		
		int total_marks = math + biology + computer + urdu + english;
		int average_marks = total_marks / 5;
		
		System.out.println("-----------------------");
		System.out.println("Student name is " + name + ". ");
		System.out.println("Student roll number is: " + number + ". ");
		System.out.println(name + " had exams from 5 subjects. ");
		System.out.println("From Math student recived: " + math + " points. ");
		System.out.println("From Biology student recived: " + biology + " points. ");
		System.out.println("From Computer student recived: " + computer + " points. ");
		System.out.println("From Urdu student recived: " + urdu + " points. ");
		System.out.println("From English student recived: " + english + " points. ");
		System.out.println("Student total marks: " + total_marks + " out of 500");
		System.out.println("Student average marks are: " + average_marks + " points.");
		
		
	}
	public static void main(String[] args) {
		
		//inputUser ();
		studentMark ();

	}

}
