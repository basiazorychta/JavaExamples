package com.training;

public class Training02DisplayTable {

	/**
	 * Write a function to display a table on screen. 
	 * Program should take input from user and display on screen. 
	 * Program should be as follow . Enter a value to display a table: 2
	 * 2 * 1 = 2
	 * 2 * 2 = 4
	 * 2 * 3 = 6
	 * 2 * 4 = 8
	 * 2 * 5 = 10
	 * 2 * 6 = 12
	 * 2 * 7 = 14
	 * 2 * 8 = 16
	 * 2 * 9 = 18
	 * 2 * 10 = 20
	 */
	
	public static void calculator () {
		
		int value = 2;
		int i = 0;
		
		for (i = 0; i <=10; i++) {
			System.out.println (value + " * " + i + " = " + (value * i));
		}
		
	}
	public static void main(String[] args) {
		
		calculator ();

	}

}
