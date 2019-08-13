package com.mix.examples;
import java.util.Scanner;

public class JavaTurtorialInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// invitation for the party
		
		System.out.println ("Enter person 1 : ");
		String person1 = scan.nextLine();
		
		System.out.println ("Enter person 2 : ");
		String person2 = scan.nextLine();
		
		System.out.println ("Enter person 3 : ");
		String person3 = scan.nextLine();
		
		System.out.println ("Enter person 4 : ");
		String person4 = scan.nextLine();
		
		System.out.println ("Enter person 5 : ");
		String person5 = scan.nextLine();
		
		System.out.println ("Enter person 6 : ");
		String person6 = scan.nextLine();
		
		System.out.println ("People invited for our party: ");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(person5);
		System.out.println(person6);

	}

}
