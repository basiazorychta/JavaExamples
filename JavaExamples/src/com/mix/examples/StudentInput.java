package com.mix.examples;
import java.util.Scanner;

public class StudentInput {

	public static void StudentMarks() {

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

	}

	public static void main(String[] args) {
		

		StudentMarks();

	}

}
