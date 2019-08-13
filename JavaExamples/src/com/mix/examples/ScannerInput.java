package com.mix.examples;
import java.util.Scanner;

public class ScannerInput {

	public static void Exemple() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter name");
		String name = scan.nextLine();

		System.out.println("Enter address");
		String address = scan.nextLine();

		System.out.println("Enter postcode");
		int postcode = scan.nextInt();

		System.out.println("My name is : " + name);
		System.out.println("My address is : " + address);
		System.out.println("My postcode is : " + postcode);

	}

	public static void main(String[] args) {

		Exemple();

	}

}
