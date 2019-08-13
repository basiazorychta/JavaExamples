package com.mix.examples;
import java.util.Scanner;

public class Weather {

	public static void Weather1() {

		// weather and &&
		// weather max temp = x

		float x = 35.50f;

		if (x >= 10.00 && x <= 20.00) {
			System.out.println("reasonable weather - but take some jacket");
		} else if (x > 19.99 && x <= 30.00) {
			System.out.println("Warm - Enjoy this weather");
		} else {
			System.out.println("HOT - More than 30.00C- Stay Home!");
		}

	}

	public static void WheatherInput() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the temperature");
		int temperature = scan.nextInt();

		System.out.println("Temperature today is: " + temperature);
		System.out.println("Temperature < 20 - take a jacket");
		System.out.println("Temperature < 30 - Enjoy this day");
		System.out.println("Temperature > 35 - Hot! - Stay home");

	}

	public static void main(String[] args) {

		// Weather1 ();

		WheatherInput();

	}

}
