package com.training;

public class Training01VariableDouble {

	/**
	 * Write a program to display variable of type double.
	 * Perform following arithmetic tasks.
	 * Add, Subtract, Divide, Multiply and Remainder.
	 * 
	 */
	
	public static double add (double val1, double val2) {
		
		double result = val1 + val2;
		return result;
		
	}
	
	public static double sub (double val1, double val2) {
		
		double answer = val1 - val2;
		return answer;
		
	}
	
	public static double mul (double val1, double val2) {
		
		double score = val1 * val2;
		return score;
		
	}
	
	public static double div (double val1, double val2) {
		
		double prov = val1 / val2;
		return prov;
		
	}
	
	public static double mod (double val1, double val2) {
		
		double con = val1 % val2;
		return con;
		
	}

	public static void main(String[] args) {
		
		double val1 = 20.5;
		double val2 = 2;
		
		double result = add (val1, val2);
		System.out.println ("add : " + result);
		
		double answer = sub (val1, val2);
		System.out.println ("sub : " + answer);
		
		double score = mul (val1, val2);
		System.out.println ("mul : " + score);
		
		if (val2 > 0) {
			double con = mod (val1, val2);
			System.out.println ("result from modulus : " + con);
		}
		else {
			System.out.println ("Do not mod by 0");
		}
		
		if (val2 > 0) {
			double prov = div (val1, val2);
			System.out.println ("prov from div : " + prov);
		}
		else {
			System.out.println ("Do not div by 0");
		}
	}

}
