package com.mix.examples;
import java.util.Scanner;

public class NFLTest {

	public static void NFLT() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter start number: ");
		int start = scan.nextInt();

		System.out.print("Enter last number: ");
		int last = scan.nextInt();

		for (int i = start; i <= last; i++) {

			System.out.println(i);

		}

	}

	public static void NFLEven() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter start number: ");
		int start = scan.nextInt();

		System.out.print("Enter last number: ");
		int last = scan.nextInt();

		for (int i = start; i <= last; i++) {
			if (i % 2 == 0) {

				System.out.println(i);

			}
		}

	}

	public static void NFLOdd() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter start number: ");
		int start = scan.nextInt();

		System.out.print("Enter last number: ");
		int last = scan.nextInt();

		int sum = 0;

		for (int i = start; i <= last; i++) {

			if (i % 2 != 0) {

				sum = sum + i;

				// System.out.println(sum + " = " + sum + " " + i );

			}
		}

		System.out.println("Sum of Odd numbers is : " + sum);

		if (sum % 2 == 0) {
			System.out.println("Sum is : " + sum + " It means - it is Even");
		} else {
			System.out.println("Sum is : " + sum + " It is Odd");
		}

	}

	public static void NFLGiven() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter start number: ");
		int start = scan.nextInt();

		System.out.print("Enter given number: ");
		int given = scan.nextInt();

		int sum = 0;

		for (int i = start; i <= given; i++) {

			sum = sum + i;

			System.out.print(i);

			if (i < given) {
				System.out.print(" + ");
			}

		}

//		System.out.println ("");
		System.out.print(" = " + sum);
	}

	public static void NFLNumber() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter start number: ");
		int start = scan.nextInt();

		System.out.print("Enter end number: ");
		int end = scan.nextInt();

		for (int i = start; i <= end; i++) {

			if (i % 4 == 0 && i % 5 != 0) {
				System.out.println(i + " " + "," + " divide by 4 ");
			}
		}
	}

	public static void NFLChooseBreak(int target) {

		// int target = 5;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter start number: ");
		int start = scan.nextInt();

		System.out.print("Enter end number: ");
		int end = scan.nextInt();

		int count = 0;

		for (int i = start; i <= end; i++) {

			if (i % 4 == 0 && i % 5 == 0) {

				count++;

				if (target == count) {

					System.out.println(i + " is in line: " + count);
					break;

				}

			}

		}

	}

	public static void NFLBreak() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter start number: ");
		int start = scan.nextInt();

		System.out.print("Enter end number: ");
		int end = scan.nextInt();

		for (int i = start; i <= end; i++) {

			if (i % 4 == 0 && i % 5 == 0) {
				System.out.println(i);
				break;
			}
		}

	}

	public static void main(String[] args) {
		// NFLT();
		// NFLEven();
		// NFLOdd();
		// NFLGiven();
		// NFLNumber();
		NFLChooseBreak(4);
		// NFLBreak ();

	}

}
