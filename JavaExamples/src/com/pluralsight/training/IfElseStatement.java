package com.pluralsight.training;

public class IfElseStatement {

	public static void main(String[] args) {

		// If - Else Statement

		// if (condition)
		// true-statement ;
		// else
		// false-statement;

		int v1 = 10;
		int v2 = 4;

		if (v1 > v2) {
			System.out.println("v1 is bigger than v2");
		} else {
			System.out.println("v1 is not bigger than v2");
		}

		System.out.println();

		int v3 = 10;
		int v4 = 40;

		if (v3 > v4) {
			System.out.println("V3 is bigger");
		} else if (v3 < v4) {
			System.out.println("v4 is bigger");
		} else {
			System.out.println("v3 and v4 are equal");
		}

		System.out.println();

//				Block Statement
//				
		int v5 = 20, v6 = 30, diff;

		if (v6 > v5) {
			diff = v6 - v5;
			System.out.println("v6 is bigger" + " v6 = " + v6);
			System.out.println(diff);
		} else if (v6 < v5) {
			diff = v5 - v6;
			System.out.println("v5 is bigger" + " v5 = " + v5);
			System.out.println(diff);
		} else {
			System.out.println("v5 and v6 are equal");
		}
		System.out.println();

		float students = 0.0f;
		float rooms = 4.0f;

		if (students > 0.0f) {
			if (rooms > 0.0f)

				System.out.println(students / rooms);

		}

		else {
			System.out.println("No students");
		}

		System.out.println();
		System.out.println("end program");

	}

}
