package com.youtube.forbeginers;

public class Exercise1Return_Passing {

	public static double pay(double basePay, int hours) {

		if (basePay < 8.0) {
			return -1;
		} else if (hours > 60) {
			return -1;
		} else {

			int overTime = 0;

			if (hours > 40) {
				overTime = hours - 40;
				hours = 40;

			}

			double salary = hours * basePay;
			salary += overTime * basePay * 1.5;

			return salary;

		}
	}

	/*
	 * Foo Corporation needs a program to calculate how much to pay their employees.
	 * 1. Pay = hours worked x base pay 2. Hours over 40 get paid 1.5 the base pay
	 * 3. The base pay must be no less than $8.00 4. The number of hours must be no
	 * more than 60
	 */

	public static void sayHello1(String name) {

		System.out.println("Hello " + name);
	}

	public static void Math (int a, int b, int c, int d) {
		
		System.out.println (a * b / c + d);
	}

	
	public static int MathRet (int a, int b, int c, int d) {
		
		return (a * b / c + d);
	}
	
	public static void main(String[] args) {

		// double salary = pay (9.3, 55);
		// System.out.println (salary);
		// sayHello1("Basia");
		// Math (5, 2, 2, 12);
		int sum = MathRet (5, 2, 2, 12);
		int result = sum * 2;
		System.out.println (result);

	}

}
