package com.training;

import java.util.Scanner;

public class Training09IfCondition {

	/**
	 * Write a program to categorize the give input from user. 
	 * 1. If user enters a value which is less than 100 and even (A value which is divisial by 2).
	 * Print: "I got an Even number " << value. 
	 * 
	 * 2. If user enters a value which is less than 200 and odd (A value which is not divisial by 2) 
	 * Print: "I got an odd number " << value. 
	 * 
	 * 3. otherwise show a message: "Entered value does not satisfy the criteria".
	 */
	
	
	public static void findANumber(int number) {
		
		if(number < 100 && !isOdd(number)) {
		
			System.out.println(number + " I got an Even number ");
		
		}
		else if(number < 200 && isOdd(number)) {
			
			System.out.println(number + " I got an Odd number ");
			
		}
		else {
			
			System.out.println(number + " Entered value does not satisfy the criteria");

		}
		
		
		
	}
	
	public static boolean isOdd_01 (int number) {
		
		boolean result;
		
		if (number % 2 != 0) {
			
			result = true;
		}
		
		else {
			
			result = false;
			
		}
		
		return result;
		
	}

	public static boolean isOdd(int number) {
		
		boolean result = false;
		
		if (number % 2 != 0) {
			
			result = true;
		}
		
		return result;	
	}
	
	public static boolean isOdd_02 (int number) {
		
		return number % 2 != 0 ;
			
	}
	
	/** Write a program to categorize the given input from user.
	- If user enter a value which is less than or equal to 500 and if divisible by 2, 
	print << value is less than500 and divisible by 2
	- If divisible by 5, print << value is less than 500 and divisible by 5.
	otherwise value is not divisible by 2 or 5.
	- If value is more than 500 print value is out of range.
	*/
	
	public static void findNumber_01 (int number) {
		
		if (number <= 500 && number % 2 == 0) {
			System.out.println (number + " Value is less than 500 and divisible by 2");
		} else if (number <= 500 && number % 5 == 0) {
			System.out.println (number + " Value is less than 500 and divisible by 5");
		} else {
			System.out.println (number + " Value is out of range ");
		}
	}
	
	public static void findNumber (int number) {
		
		if (number <= 500) {
			if (number % 2 == 0) {
				System.out.println (number + " Value is less than 500 and divisible by 2");
			} 
			else if (number % 5 == 0) {
				System.out.println (number + " Value is less than 500 and divisible by 5");
			}
			else {
				System.out.println (number + " Value is less than 500 but not divisible by 2 or 5");
			}
		}
		else {
			System.out.println (number + " Value is out of range ");
		}
	}
	
	/**
	 * Write a program to find maximum values between two numbers given by user.
	 * - If both values are equal print equal values.
	 * 
	 * Write a program to find maximum values between three numbers given by user.
	 * - Don't care about equality.
	 * 
	 * Write a program to check if given value is positive, negative or zero.
	 */
	
	
	public static void findMaximum (int a, int b) {
		
		if (a == b) {
			System.out.println (a + " and " + b + " are equal");
		}
		else if (a > b){
			System.out.println (a + " is greater than " + b);
		}
		else {
			System.out.println (b + " is greater than " + a);
		}
	}
	
	public static void findMaximum (int a, int b, int c) {
		
		if (a > b && a > c){
			System.out.println (a + " is greater than " + b + " and " + c);
		}
		else if (b > a && b > c){
			System.out.println (b + " is greater than " + a + " and " + c);
		}
		else {
			System.out.println (c + " is greater than " + a + " and " + b);
		}
	}

	public static void findDifferent (int a) {
		
		if (a > 0) {
			System.out.println (a + " is positive");
		}
		else if (a < 0) {
			System.out.println (a + " is negative");
		}
		else {
			System.out.println (a + " is zero");
		}
	}

	
	/**
	Wikipedia states leap year is a special year containing one extra day 
	i.e. total 366 days in a year (Feb = 29). 

	Write a program to check if given year is leap year or not.
	
	What is the formula to check leap year.
	- If year is exactly divisible by 400 OR
	- If year is exactly divisible by 4 but year is not divisible by 100 
	the year is leap year.
	Else year is normal year
	*/
	
	public static void isLeapYear ( int year) {
		
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
			{	
				System.out.println ("Year " + year + " is a Leap Year");
			}
	
		else 
			{
				System.out.println ("Year " + year + " is a Normal Year");
			}
	}
	
	/**
	 * 1. Write a program to check if given character is alphabet or not, 
	 * - if alphabet then if it is vowel (a e i o u). 
	 * 
	 * 2. Write a program to check if given character is 
	 * - alphabet, digit or special character.
	*/
	
	public static boolean isVowel (char vowel) {
		
		boolean answer;
		
		if ((vowel == 'a')|| (vowel == 'A')|| (vowel == 'e')|| (vowel == 'E')|| 
				(vowel == 'i')|| (vowel == 'I') || (vowel == 'o') || (vowel == 'O') || 
				(vowel == 'u') || (vowel == 'U')) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isAlphabet (char alphabet) {
		
		boolean result = false;
		
		if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
			result = true;
		}
		
		return result;
	}
	/**
	 * 
	 * We are using ASCII Table to create function / method to find character. 
	 * Calling function - always using character without ASCII Table. 'a','8','*'
	 * 
	 */
	public static boolean isDigit (char digit) {
		
		boolean result = false;
		
		if ((digit >=48) && (digit <=57)){
			result = true;
		}
		return result;
	}
	
	/**
	 * isVowel01 and isAlphabet01 was created by using ASCII Table
	 * 
	 */
	public static boolean isVowel01 (char vowel) {
		
		boolean answer;
		
		if ((vowel == 97)|| (vowel == 65)|| (vowel == 101)|| (vowel == 69)|| 
				(vowel == 105)|| (vowel == 73) || (vowel == 'o') || (vowel == 79) || 
				(vowel == 'u') || (vowel == 85)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isAlphabet01 (char alphabet) {
		
		boolean result = false;
		
		if ((alphabet >= 97 && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 90)) {
			result = true;
		}
		
		return result;
	}
	
	
	/**
	 * In Pakistan currency we have number of different currency notes.
	 * Write a program to calculate how many currency notes are equal to the given amount.
	 * for example for amount 1500:

	 * 5000 note = 0
	 * 1000 = 1
	 * 500 = 3
	 * 100 = 15
	 * 50 = 30
	 * 10 = 150
	*/
	
	public static final int ONETHOUSAND = 1000;
	public static final int FIVEHUNDRED = 500;
	public static final int ONEHUNDRED = 100;
	public static final int FIFTY = 50;
	public static final int TEN = 10;
	
	public static void currency (int amount) {
		
		
		if (amount >= ONETHOUSAND) {
			int onet = amount / ONETHOUSAND;
			amount = amount % ONETHOUSAND;
			System.out.println ("You will receive: " + onet + " currency note of ONETHOUSAND");
		}
		if ( amount >= FIVEHUNDRED) {
			int fiveh = amount / FIVEHUNDRED;
			amount = amount % FIVEHUNDRED;
			System.out.println ("You will receive: " + fiveh + " currency note of FIVEHUNDRED");
		}
		if ( amount >= ONEHUNDRED) {
			int oneh = amount / ONEHUNDRED;
			amount = amount % ONEHUNDRED;
			System.out.println ("You will receive: " + oneh + " currency note of ONEHUNDRED");
		}
		if ( amount >= FIFTY) {
			int fifty = amount / FIFTY;
			amount = amount % FIFTY;
			System.out.println ("You will receive: " + fifty + " currency note of FIFTY");
		}
		if ( amount >= TEN) {
			int ten = amount / TEN;
			amount = amount % TEN;
			System.out.println ("You will receive: " + ten + " currency note of TEN");
		}
		
	}
	
	/** Write a c++ program to input electricity unit charges 
	    and calculate total electricity bill according to the given condition:
		
		For first 50 units Rs. 0.50/unit
		For next 100 units Rs. 0.75/unit
		For next 100 units Rs. 1.20/unit
		For unit above 250 Rs. 1.50/unit

		An additional surcharge of 20% is added to the bill.
	*/
	
	public static final double FIRSTFIFTY = 0.50;
	public static final double FIRSTONEHUNDRED = 0.75;
	public static final double NEXTONEHUNDRED = 1.20;
	public static final double ABOVETWOFIFTY = 1.50;
	
	public static void electricityCharge (double unit) {
		
		double amount = 0;
		double currentBalance = 0;
		double realUnit = unit;
		
		String info = " ";
				
		if (unit > 0) {
			if (unit <= 50) {
				
				currentBalance = unit * FIRSTFIFTY;
				info = "for " + unit + "unit";
			}
			else {
				currentBalance = 50 * FIRSTFIFTY;
				info = "for 50 unit";
			}
			
			amount = currentBalance;
			unit = unit - 50;
			System.out.println ( info + " = " + currentBalance);
		}
		

		if (unit > 0) {
			if (unit <= 100) {
				
				currentBalance = (unit * FIRSTONEHUNDRED);
				info = "for " + unit + "unit";
			}
			else {
				currentBalance = (100 * FIRSTONEHUNDRED);
				info = "for 100 unit";
			}
			amount += currentBalance;
			unit = unit - 100;
			System.out.println ( info + " = " + currentBalance);
		}
		
		if (unit > 0) {
			if (unit <= 100) {
				
				currentBalance = (unit * NEXTONEHUNDRED);
				info = "for " + unit + "unit";
			}
			else {
				currentBalance = (100 * NEXTONEHUNDRED);
				info = "for 100 unit";
			}
			unit = unit - 100;
			amount += currentBalance;

			System.out.println ( info + " = " + currentBalance);
		}
		
		if (unit > 0) {
			if (unit > 250) {
				
				currentBalance = (unit * ABOVETWOFIFTY);
				info = "for " + unit + "unit";
			}
			else {
				currentBalance = (250 * ABOVETWOFIFTY);
				info = "for 250 unit";
			}
			unit = unit - 250;
			amount += currentBalance;
			
			System.out.println (info + " = " + currentBalance);
		}
		
		
		double charges = amount * 20 / 100;
		
		amount = amount + charges;
		
		System.out.println ("client will pay: " + amount + " amount for " + realUnit + " units"
				+ " including charges " + charges);

		
	}
	
	public static void main(String[] args) {
		
		electricityCharge (600.0);
		
		//currency (3550);
		
		/** char ch = '-';
		
		
		if (isAlphabet (ch)) {
				System.out.println ("Entered - " + ch + " is an alphabet");
		}
		else if (isDigit (ch)) {
			System.out.println ("Entered - " + ch + " is a digit"); 
		}
		else {
			System.out.println ("Entered - " + ch + " is a special character");
		}
		*/
		
		/**char ch = 'r';
		
		if (isAlphabet(ch)) {
			System.out.println ("Entered - " + ch + " is alphabet");
			
			if (isVowel(ch)) {
				System.out.println ("Entered - " + ch + " is vowel");
			}
			else {
				System.out.println ("Entered - " + ch + " is not vowel");
			}
		}
		else {
			System.out.println ("Entered - " + ch + " is not alphabet");
		}
		*/
		
		/**for (char ch = 65; ch <= 122; ch++ ) {
			
		//char ch = i;
		
		if (isAlphabet01(ch)) {
			System.out.println ("Enter - " + ch + " is alphabet");
			
			if (isVowel01(ch)) {
				System.out.println ("Enter - " + ch + " is vowel");
			}
			else {
				System.out.println ("Enter - " + ch + " is not vowel");
			}
		}
		else {
			System.out.println ("Enter - " + ch + " is not alphabet");
		}
		}
		*/
		
		/**char ch = 'a';
		if (isVowel(ch)) {
			System.out.println ("Enter - " + ch + " is vowel");
		}
		else {
			System.out.println ("Enter - " + ch + " is not vowel");
		}
		*/
		
		// System.out.println (isVowel ('b'));
		
		/**isLeapYear (2019);
		isLeapYear (2020);
		*/
		
		/**findDifferent (90);
		findDifferent (-187);
		findDifferent (0);
		*/
		
		/**findMaximum (10, 40, 50);
		findMaximum (1, 400, 5);
		findMaximum (8, 10, 90);
		*/
		
		/**findMaximum (10, 40);
		findMaximum (20, 2);
		findMaximum (5647, 20);
		findMaximum (10, 10);
		*/
		

		/**
		 * findNumber (400); 
		 * findNumber (153); 
		 * findNumber (15); 
		 * findNumber (600);
		 */
		
		/**findANumber(20);
		findANumber(21);
		findANumber(120);
		findANumber(123);
		findANumber(201);
		
		System.out.println (isOdd(19));
		System.out.println (isOdd_01(19));
		System.out.println (isOdd_02(19));

  		boolean answer = isEven (91);
		System.out.println (answer);
		*/
	}

}
