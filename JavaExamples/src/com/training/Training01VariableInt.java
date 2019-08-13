package com.training;

public class Training01VariableInt {

	/**
	 * Write a program to display variable of type int. 
	 * Perform following arithmetic tasks. 
	 * Add, Subtract, Divide, Multiply and Remainder.
	 */
	
	public static int add (int val1, int val2) {
		
		int answer = val1 + val2;
		return answer;
	}
	
	public static int sub (int val1, int val2) {
		
		int result = val1 - val2;
		return result;
	}
	
	public static int mul (int val1, int val2) {
		
		int score = val1 * val2;
		return score;
	}
	
	public static int div (int val1, int val2) {
		
		int provide = val1 / val2;
		return provide;
	}
	
	public static int mod (int val1, int val2) {
		
		int cons = val1 % val2;
		return cons;
	}
	public static void main(String[] args) {
		
		int val1 = 10;
		int val2 = 0;
		
		int answer = add (val1, val2);
		System.out.println ("add result : " + answer);
		
		int result = sub (val1, val2);
		System.out.println ("Sub result : " + result);
		
		int provide = mul (val1, val2);
		System.out.println ("mul result : " + provide);
		
		if (val2 > 0 ) {
			int score = div (val1, val2);
			System.out.println (" div result : " + score);
		} else {
			System.out.println ("You cannot div by 0");
		}
		
		if (val2 > 0) {
			int cons = mod (val1, val2);
			System.out.println (" mod result : " + cons);
		}
		else {
			System.out.println ("We cannot mod by 0");
		}
	
	}

}
