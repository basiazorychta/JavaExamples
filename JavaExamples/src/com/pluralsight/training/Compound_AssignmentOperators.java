package com.pluralsight.training;

public class Compound_AssignmentOperators {

	public static void main(String[] args) {

		// 3 - Method - Compound Assignment Operators

		int myVal = 50;
		myVal -= 5; // myVal = 50 - 5 = 45

		System.out.println(myVal);

		// Available for 5 basic math operators (+=, -=, *=, /=, %=)

		int result = 100;

		int val1 = 10;
		int val2 = 5;

		result /= val1 * val2; // result = 100 / (val1 10 * val2 5 = 50) = 100/50 = 2

		System.out.println(result);

	}

}
