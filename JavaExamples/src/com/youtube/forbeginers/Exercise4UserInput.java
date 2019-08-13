package com.youtube.forbeginers;

import java.util.Scanner;

public class Exercise4UserInput {

	public static void UserInput () {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter some #");
		int newNumberInput = scan.nextInt();
		
		System.out.println ("The enter # is : " + newNumberInput);
	}
	
	public static void UserInput2 () {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter your dream trip");
		String dreamTrip = scan.nextLine();
		
		System.out.println ("I hope one day I will visit : " + dreamTrip);
	}
	
	
	public static void UserInput3 () {
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Input Your age");
		String scan = sc.nextLine();
		int age = Integer.parseInt(scan);
		
		if (age >= 18) {
		
			System.out.println ("What is Your fav food?");
			String food = sc.nextLine ();
			
			if (food.equals("pizza")) {
				System.out.println ("woow! Mine too");
			}
			else if (food.equals("pasta")){
				System.out.println ("Nice. I like it too");
			}
			else {
				System.out.println ("Not mine. I will eat it but it is not my fav one");
			}
		}
		else if (age >= 13) {
			System.out.println ("You are a teenager");
		}
		else {
			System.out.println ("You are not a teenager or adult");
		}
		
	}
	
	public static void main(String[] args) {
		
		//UserInput ();
		//UserInput2 ();
		UserInput3 ();
		


	}

}
