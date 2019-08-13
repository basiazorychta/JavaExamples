package com.mix.examples;

public class StudentMarks {
	
	public static void StudentResult () {
		
		String StudentName = "Anna";
		String StudentRollNumber = "199210112345";

		int TotalMarks = 500;

		int MathMarks = 99;
		int BiologyMarks = 95;
		int ComputerMarks = 90;
		int UrduMarks = 97;
		int EnglishMarks = 90;

		int ResultsMarks = MathMarks + BiologyMarks + ComputerMarks + UrduMarks + EnglishMarks;
		int AvarageMarks = (ResultsMarks / 5);

		System.out.println("Student Name: " + StudentName);
		System.out.println("Student Roll Name: " + StudentRollNumber);
		System.out.println("Student Maths marks: " + MathMarks);
		System.out.println("Student Biology marks: " + BiologyMarks);
		System.out.println("Student Computer marks: " + ComputerMarks);
		System.out.println("Student Urdu marks: " + UrduMarks);
		System.out.println("Student English marks: " + EnglishMarks);
		System.out.println("Student total marks " + ResultsMarks + " out of " + TotalMarks);
		System.out.println("Student average marks are: " + AvarageMarks + "%");

		if (AvarageMarks >= 90) {
			if (AvarageMarks > 95) {
				System.out.println("You are Genious!");
			}

			System.out.println("Excellent!");

		} else if (AvarageMarks >= 80) {
			System.out.println("Good Job!");
		} else if (AvarageMarks >= 70) {
			System.out.println("Nice");
		} else if (AvarageMarks >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}	
		
	}

	public static void main(String[] args) {

	StudentResult ();

	}

}
