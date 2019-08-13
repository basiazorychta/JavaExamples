package com.mix.examples;
import java.util.Scanner;

public class Minutes {

	public static void ConvertInput () {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter input");
		
		int input = scan.nextInt();

		int hours = 0;
		int minutes = 0;
		int seconds = 0;

		minutes = input / 60;
		hours = minutes / 60;
		minutes = minutes % 60;
		seconds = input % 60;

		System.out.println(input + " seconds converted into : " + hours + " hours and  " + minutes + " minutes and  "
				+ seconds + " seconds ");
			
			
	}

	public static void Time() {

		int input = 7888;

		int hours = 0;
		int minutes = 0;
		int seconds = 0;

		minutes = input / 60;
		hours = minutes / 60;
		minutes = minutes % 60;
		seconds = input % 60;

		System.out.println(input + " seconds converted into : " + hours + " hours and  " + minutes + " minutes and  "
				+ seconds + " seconds ");

	}

	public static void main(String[] args) {

		// Time();
		
		ConvertInput();

	}

}
