package com.mix.examples;
import java.util.Scanner;

public class MultiplicationInput {

	public static void Multiply() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Value");
		int value = scan.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(value + " * " + i + " = " + (value * i));

		}

	}

	public static void main(String[] args) {
		
		Multiply ();
		

	}

}
