package com.mix.examples;
import java.util.Scanner;

public class Sickness {

	public static void Medicin() {

		// Medicine OR ||
		// temp = t
		// headacke = h (more than "10" take Medicine)

		int t = 40;
		int h = 10;

		if (t > 39 && h > 0) {
			System.out.println("Take Medicine !!!");
		} else if (t > 39 || h < 0) {
			System.out.println("Take half of pill");
		} else if (t < 39 || h > 0) {
			System.out.println("Take Alvadon and Call to the Doctor");
		} else {
			System.out.println("Go to Work");
		}
	}

	public static void Fever () {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter temperature");
		int temp = scan.nextInt ();
		
		System.out.print("Enter headacke level: ");
		int headacke = scan.nextInt ();
		
		System.out.println ("Temperature: " + temp);
		System.out.println ("Headacke level: " + headacke);
		
		if (temp > 39 && headacke > 0) {
			System.out.println("Take Medicine !!!");
		} else if (temp > 39 || headacke < 0) {
			System.out.println("Take half of pill");
		} else if (temp < 39 || headacke > 0) {
			System.out.println("Take Alvadon and Call to the Doctor");
		} else {
			System.out.println("Go to Work");
		}
		
	}

	public static void main(String[] args) {

		// Medicin();
		
		Fever ();
		

	}

}
