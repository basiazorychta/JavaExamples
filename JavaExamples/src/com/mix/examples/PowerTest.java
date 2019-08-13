package com.mix.examples;
import java.util.Scanner;

public class PowerTest {

	public static void PowerTest() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Add base variable: ");
		int base = scan.nextInt();

		System.out.print("Add power variable: ");
		int power = scan.nextInt();

		System.out.println("Result for Power method is: " + (int) Math.pow(base, power));

	}

	public static void PowerTest2() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Add base variable: ");
		int base = scan.nextInt();

		System.out.print("Add power variable: ");
		int power = scan.nextInt();

		int sum = 1;

		while (power > 0) {
			sum = sum * base;
			power--;
		}

		System.out.println(sum);

	}

	public static void PTestFor() {

		int base = 3;
		int power = 4;
		int sum = 1;

		for (int i = 0; i < power; i++) {
			sum = sum * base;

		}
		System.out.println(sum);
	}

	public static void GetRadious() {

		// area = pi * r * r

		Scanner scan = new Scanner(System.in);

		System.out.print("Add radious variable: ");
		
		double radious = scan.nextDouble();

		
		double pi = 3.14159;
		double sum = (pi * radious * radious);

		
		System.out.println(sum);

	}
	
	
	
	

	public static void main(String[] args) {
		PowerTest2();
		// PTestFor();
		// GetRadious();

	}

}
