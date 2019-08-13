package com.youtube.forbeginers;

public class Variable {
	
	
	public static void fun01() {
		System.out.println("Hello do nothing");
	}
	
	public static void fun02(String message) {
		System.out.println("Hello " + message);
	}
	
	public static void print(String message) {
		System.out.println(message);
	}
	
	public static String info() {
		
		String personal = "This is my code and it cannot be used without"
				+ "my permission";
		
		return personal;
		
	}
	
	public static double add(double a, double b) {
		
		double result = a + b;
		return result;
	}
	
	public static int add(int a, int b) {
		
		int result = a + b;
		return result;
	}
	
	public static int add (int a, int b, int c) {
		
		int result = a + b + c;
		return result;
	}
	
	
	public static double sub (double a, double b) {
		double answer = a - b;
		return answer;
		
	}
	
	/**
	 * write a function which takes integer as a parameter and return boolean as a result
	 * function will calculate if given parameter is odd or not.
	 * 
	 */
	
	public static boolean isOdd (int number) {
		
		boolean answer = false;
		
		if (number % 2 != 0) {
			answer = true;
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 50; i++) {
			System.out.println ("Value of " + i + " " + isOdd (i));
		}
		
		boolean ans = isOdd(5);
		System.out.println (ans);
		
		System.out.println (isOdd (5));
		
		
		//fun01();
		
		//print("message");
		
		//fun02("Yes you are right");
		
		// System.out.println(info());
		
		double result = add (20.0,30.0);
		System.out.println (result);
		
		result = add (25, 35, 10);
		System.out.println (result);
		
		//double answer = sub ( 30.0, 10.5);
		System.out.println (12);
		System.out.println (12.0);
		System.out.println ("twelve");

	
	
	}
	

		
	
}
