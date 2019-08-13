package com.mix.examples;
import java.util.Scanner;

public class Test {

	public static void HelloWorld() {

		System.out.println("Hello World!");

	}

	public static void HWInput() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter name ");
		String name = scan.nextLine();

		System.out.print("Enter number of execution ");
		int value = scan.nextInt();

		for (int i = 0; i < value; i++) {

			System.out.println(name);

		}

	}

	public static void HWInputTest(int value) {

		for (int i = 0; i < value; i++) {

			System.out.println("Hello World");
		}

	}

	public static void main(String[] args) {
		// HelloWorld();

		// HWInput();
		// HWInputTest(10);
		
		double a = 4.6;
		int i = (int)a;
		
		
		System.out.println(a+" "+ i);
		
		

	}

}
