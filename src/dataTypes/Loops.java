package dataTypes;

import java.util.Scanner;

public class Loops {

	public static void ForLoop1() {

		for (int i = 1; i <= 10; i++) { // i++ - can be also i--; i=i+2, i=i-3
			System.out.println(i);
		}

		/*
		 * for (int i=10; i>=1; i--){ System.out.println (i); }
		 */

		System.out.println();

		for (double d = 0; d <= 5; d = d + 0.5) {
			System.out.println(d);
		}

	}

	public static void ForLoop2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I like dogs!");
		}
	}

	public static void WhileExemple1() {

		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

	}

	public static void WhileExemple2 () {
		
		int a = 0;
		while(a<10) {
			System.out.println (a + " - " + "a");
			a++;
		}
		// for (int i = 0; i<10; i++){
		//	System.out.println (i + " - " + "i");
		// }
	}
	public static void DoWhile() {

		int i = 1;

		do {
			System.out.println(i);
			i++;
		} while (false);

	}

	public static void FactorialExemple() {

		/*
		 * 0! = 1 4! = 4*3*2*1 = 24 5! = 5*4*3*2*1 = 120
		 */

		int n = 10;
		long fact = 1L;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial from : " + n + " is: " + fact);

	}

	public static void Multiply() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Value");
		int value = scan.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(value + " * " + i + " = " + (value * i));

		}
	}
	
	public static void main(String[] args) {
		// ForLoop1();
		// WhileExemple1();
		// WhileExemple2 ();
		// DoWhile ();
		// FactorialExemple ();
		//ForLoop2();
		Multiply();

	}

}
