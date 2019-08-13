package com.mix.examples;
import java.util.Scanner;

public class Celcius {

	public static void Farenheit() {

		double temp = 0.00;

		double farenheit = (temp * 9 / 5) + 32;

		System.out.println(temp + " degrees in Celcius convert into: " + farenheit + " Farenheit");

	}

	public static void Celcius() {

		double Temp = 0.00;

		double celcius = (Temp - 32) * 5 / 9;

		System.out.println(Temp + " degrees in Farenheit convert into: " + celcius + " Celcius");

	}

	public static void CelciusInput() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter temperature in Farenheit: ");

		double Temp = scan.nextDouble();

		double celcius = (Temp - 32) * 5 / 9;

		System.out.println(Temp + " degrees in Farenheit convert into: " + celcius + " Celcius");

	}

	public static void FarenheitInput() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter temperature in Celcius: ");
		
		double temp = scan.nextDouble();

		double farenheit = (temp * 9 / 5) + 32;

		System.out.println(temp + " degrees in Celcius convert into: " + farenheit + " Farenheit");

	}

	public static void FarenheitInputTest ( double temp ) {
		

		double farenheit = (temp * 9 / 5) + 32;

		System.out.println(temp + " degrees in Celcius convert into: " + farenheit + " Farenheit");

	}
	
	public static void main(String[] args) {
		
		for (double i = 20; i < 25; i++) {
			
			// FarenheitInput (); 
			
			FarenheitInputTest ( i );
			
			
	
		}
				

		// Farenheit();

		// FarenheitInput();

		// Celcius();

		// CelciusInput();

	}

}
