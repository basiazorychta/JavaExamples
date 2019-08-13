package com.mix.examples;
import java.util.Scanner;

public class NumbersForLoop {

	public static void NumberForLoop() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter starting number: ");
		int start = scan.nextInt();

		System.out.print("Enter ending number: ");
		int end = scan.nextInt();

		for (int i = start; i <= end; i++) {

			System.out.println(i);

		}
		
		
	}

	public static void Even() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter starting number: ");
		int start = scan.nextInt();

		System.out.print("Enter ending number: ");
		int end = scan.nextInt();

		for (int i = start; i <= end; i++) {

			if (i % 2 == 0) {

				System.out.println(i);

			}

		}

	}

	public static void Odd() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter starting number: ");
		int start = scan.nextInt();

		System.out.print("Enter ending number: ");
		int end = scan.nextInt();

		int sum = 0;
		
		
		for (int i = start; i <= end; i++) {

			if (i % 2 != 0) {

				sum = sum + i;

				System.out.println(i);

			}

		}

		System.out.println("Sum of Odd number is: " + sum);
		
		if (sum % 2 == 0 ) {
			System.out.println ("Value of: " + sum + "is: even");
		}
		else {
			System.out.println ("Value of: " + sum + "is Odd");
		}
	}

	public static void main(String[] args) {

		// NumberForLoop();
		// Even();
		Odd();

	}
}
