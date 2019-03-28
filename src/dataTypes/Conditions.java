package dataTypes;

import java.util.Scanner;

public class Conditions {

	public static void IfExemple1() {

		int x = 40;

		if (x == 20) {
			System.out.println("x equal to : " + x);
		} else {
			System.out.println("x not equal to : " + x);
		}

	}

	public static void IfExemple2() {

		int a = -2;
		if (a < 0) {
			System.out.println("a less than : " + a);
		} else if (a > 0) {
			System.out.println("a greater than : " + a);
		} else {
			System.out.println("a equal to: " + a);
		}

	}

	public static void IfExemple3() {

		int x = 10;
		int cond;
		cond = (x > 0) ? 1 : 0;

		System.out.println(cond);
	}

	public static void IfExemple4() {

		int a = 100;

		if (a == 100) {
			System.out.println("a equal to 100");
		}
		if (a > 50) {
			System.out.println("a greater than 50");
		}
		if (a < 2000) {
			System.out.println("a less than 2000");
		}
		if (a > 0) {
			System.out.println("a greater than 0");
		} else {
			System.out.println("a equal to: " + a);
		}
	}

	public static void IfExemple5() {

		// If statement for User Input

		Scanner scan3 = new Scanner(System.in);

		/*
		 * System.out.println("Enter your name"); String name = scan3.nextLine();
		 * System.out.println("\n" + "Hello " + name + "." + " How are You today?");
		 * 
		 * System.out.println("Enter your age"); int age = scan3.nextInt();
		 * System.out.println("No way! " + age + "?" + " You look much younger!");
		 */

		System.out.println("Enter Your height in cm ?");
		double height = scan3.nextDouble();

		System.out.println("Enter Your weight in kg ?");
		double weight = scan3.nextDouble();

		height = height / 100;
		double bmi = weight / (height * height);

		System.out.println("\n" + "According your height and weight - Your bmi is : " + bmi);

		if (bmi < 18.5) {
			System.out.println("Your bmi is too low");
		} else if (bmi > 25.0) {
			System.out.println("Time for exerice and diet!");
		} else {
			System.out.println("Good job! Your bmi is correct!");
		}

	}

	
	public static void StudentResult() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Student name: ");
		String name = scan.nextLine();

		System.out.print("Student Roll Number: ");
		String rollnumber = scan.nextLine();

		System.out.print("Enter Math Marks: ");
		int Math = scan.nextInt();

		System.out.print("Enter Englis Marks: ");
		int English = scan.nextInt();

		System.out.print("Enter Polish Marks: ");
		int Polish = scan.nextInt();

		System.out.print("Enter Urdu Marks: ");
		int Urdu = scan.nextInt();

		System.out.print("Enter Chemistry Marks: ");
		int Chemistry = scan.nextInt();

		System.out.println("My name is: " + name);
		System.out.println("My Roll Number is: " + rollnumber);
		System.out.println("Subjects for Exam:");
		System.out.println("Subject 1 - Math: " + Math);
		System.out.println("Subject 2 - English: " + English);
		System.out.println("Subject 3 - Polish: " + Polish);
		System.out.println("Subject 4 - Urdu: " + Urdu);
		System.out.println("Subject 5 - Chemistry: " + Chemistry);

		System.out.println("Total Marks : " + (Math + English + Polish + Urdu + Chemistry));
		System.out.println("Avarage Marks : " + (Math + English + Polish + Urdu + Chemistry) / 5);

		int AvarageMarks = (Math + English + Polish + Urdu + Chemistry) / 5;

		if (AvarageMarks >= 95) {

			System.out.println("A!");
			System.out.println("Excellent!");

		} else if (AvarageMarks >= 80 && AvarageMarks < 95) {
			System.out.println("Good Job - B!");
		} else if (AvarageMarks >= 70) {
			System.out.println("Nice - C");
		} else if (AvarageMarks >= 60) {
			System.out.println("Pass - D");
		} else {
			System.out.println("Fail - F!");
		}

	}

	public static void main(String[] args) {

		// IfExemple1 ();
		// IfExemple2 ();
		IfExemple3 ();
		// IfExemple4 ();
		// IfExemple5 ();
		//StudentResult();

	}

}
