package com.pluralsight.training;

public class WhileForDoLoop {

	public static void main(String[] args) {

		// While Loop

		int kVal = 5;
		int factorial = 1;

		while (kVal > 1) {
			factorial *= kVal;
			kVal -= 1;
		}

		System.out.println(factorial);

		// Do-While Loop - Exercise 1

		int iVal = 5;

		do {
			System.out.print(iVal);
			System.out.print(" * 2 ");

			iVal *= 2;
			System.out.print(iVal);
			System.out.println();

		} while (iVal < 100);
		
		System.out.println ();

		// Do-while Loop - Exercise 2

		int iKal = 150;  // Do-while Loop - will do at the least once

		do {
			System.out.print(iKal);
			System.out.print(" * 2 ");

			iKal *= 2;
			System.out.print(iKal);
			System.out.println();

		} while (iKal < 100);
		
		// For Loop
		
		int i = 1;
		
		for (int i1 = 1; i1 < 100; i1 *=2) {
		
		
		System.out.println ("Come on");
		}

	}

}
