package com.training;

public class Training01VariableFloat {

	/**
	 * Write a program to display variable of type float.
	 * perform following arithmatic tasks.
	 * Add, Subtract, Divide, Multiply and Remainder.
	 */
	
	public static float add ( float val1, float val2) {
		
		float result = val1 + val2;
		return result;
		
	}
	
	public static float sub ( float val1, float val2) {
		
		float answer = val1 - val2;
		return answer;
		
	}
	
	public static float mul ( float val1, float val2) {
		
		float score = val1 * val2;
		return score;
		
	}
	
	public static float div ( float val1, float val2) {
		
		float prov = val1 / val2;
		return prov;
		
	}

	public static float mod ( float val1, float val2) {
	
	float con = val1 % val2;
	return con;
	
	}

	public static void main(String[] args) {
		float val1 = 200.5f;
		float val2 = 100.850f;
		
		float result = add (val1, val2);
		System.out.println ("answer from add : " + result);
		
		float answer = sub (val1, val2);
		System.out.println ("answer from sub : " + answer); 
		
		float score = mul (val1, val2);
		System.out.println ("answer from mul : " + score);
		
		if (val2 > 0) {
			float prov = div (val1, val2);
			System.out.println ("Result from div : " + prov);
		}
		
		if (val2 > 0) {
			float con = mod (val1, val2);
			System.out.println ("Result from mod : " + con);
		}
	}

}
