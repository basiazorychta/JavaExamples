package com.mix.examples;

public class JavaTurtorialComparisonOperators {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		
//		boolean c = (a == b);
//		boolean d = (a >= b);
//		boolean e = (a != b);
//		
//		System.out.println (c);
//		System.out.println (d);
//		System.out.println (e);
		
		if (a==5) {
			System.out.println ("a = 5 - So it is true");
		}
		
		if (a > 4) {
			System.out.println ("a is still 5 - So it is true");
		}
		
        if (a == 5 || a == 6) {
        	System.out.println ("a is 5 or a is 6");
        }
        if (a >= 0 && a < 10) {
        	System.out.println ("a is 5 - a is in the range");
        }

	}

}
