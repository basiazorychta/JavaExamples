package dataTypes;

import java.util.Scanner;

public class UserInput {

	/** 
	 * https://www.w3schools.com/java/java_user_input.asp
	 */
		
		public static void Exemple1() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the favourite day of the week");
		String day = scan.nextLine();
		System.out.println("Your favourite day is: " + day);

	}

	public static void Exemple2() {
		
		Scanner scan2 = new Scanner (System.in);
		
		System.out.print ("Enter your ID:");
		int id = scan2.nextInt();
		System.out.print("Your id is: " + id);
		
	}
	public static void Example3() {

		Scanner scan3 = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = scan3.nextLine();

		System.out.println("Enter your age");
		int age = scan3.nextInt();
		
		System.out.println("Enter Your height in cm ?");
		double height = scan3.nextDouble();

		System.out.println("Enter Your weight in kg ?");
		double weight = scan3.nextDouble();
		
		System.out.println("\n" + "Hello " + name + "." + " How are You today?");
		System.out.println("No way! " + age + "?" + " You look much younger!");
		System.out.println("Your height is: " + height);
		System.out.println("Your weight is: " + weight);
	

		height = height / 100;
		double bmi = weight / (height * height);
		
		System.out.println("\n" + "According your height and weight - Your bmi is : " + bmi);

	}

	public static void main(String[] args) {
		// Exemple1();
		// Exemple2 ();
		Example3();

	}

}
