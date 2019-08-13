package com.youtube.forbeginers;

public class Exercise5MathandArithmetic {

	public static void Math1 () {
		
		int x, y, answer;
		x = 80;
		y = 30;
		answer = x % y;
		
		System.out.println ("Answer is : " + answer);
	}
	
public static void Increment1 () {
		
		int x, y, z;
		x = 10;
		// x = x + 1; or
		x++;
		
		y = 20;
		y += 5; // y = y + 5;
		
		z = 10;
		z *= 10; // z = z * 10;
		
		System.out.println ("Answer is : " + x);
		System.out.println ("Answer is : " + y);
		System.out.println ("Answer is : " + z);
	}

	public static void main(String[] args) {
		//Math1 ();
		Increment1 ();

	}

}
