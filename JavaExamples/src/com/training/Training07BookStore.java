package com.training;

import java.util.Scanner;

public class Training07BookStore {

	/**
	 * Develop a Java program that will determine whether 
	 * a Book Store customer has exceeded the credit limit on a charge account.

	 * Every customer has maximum of 200 Rupees limit.
	 * Customer can buy or leave (0) the product.

	 * Book store has following products:
	 * Note book 20 rupees, 
	 * Computer Science book 40 rupees, 
	 * Eraser 6 rupees, 
	 * Ball pen 5 rupees, 
	 * Pencil 8 rupees, 
	 * Sharpener 4 rupees.

	 * System will ask customer to enter quantity. 

	 * (For example): 
	 * Note book 2
	 * Computer Science book 1
	 * Eraser 3
	 * Ball pen 4
	 * Pencil 2
	 * Sharpener 5

	 * System will display total amount of all items charged by this customer.
	 * If total amount does not exceed 200 rupees limit. System will display this message 

	* Thank you mr customerName for your shopping. You have bought:
	* 2 Note book
	* 1 Computer Science book
	* 3 Eraser
	* 4 Ball pen
	* 2 Pencil
	* 5 Sharpener

	* Total Price is _____ and you have still ____ amount limit.

	* If total amount will exceed more than 200,  system will display following message.

	* Respected CustomerName Sorry but you total amount is _______ but your limit is 200 Rupees.

	* Program MUST use const variable where necessary
	*/
	
	public static final int VALUELIMIT = 200;
	public static final int NOTEBOOK = 20;
	public static final int COMPUTERBOOK = 40;
	public static final int ERASER = 6;
	public static final int BALLPEN = 5;
	public static final int PENCIL = 8;
	public static final int SHARPNER = 4;
	
	public static void bookStore () {
		
		int limit = VALUELIMIT;
		
		Scanner scan = new Scanner (System.in);
		System.out.println ("Enter your name: ");
		String name = scan.nextLine();
	
		
		System.out.println ("Enter qty of note book which you want to buy: ");
		int notebook = scan.nextInt();
		
		System.out.println ("Enter qty of computer science book which you want to buy: ");
		int computerbook = scan.nextInt();
		
		System.out.println ("Enter qty of eraser which you want to buy: ");
		int eraser = scan.nextInt();
		
		System.out.println ("Enter qty of ball pen which you want to buy: ");
		int ballpen = scan.nextInt();
		
		System.out.println ("Enter qty of pencil which you want to buy: ");
		int pencil = scan.nextInt();
		
		System.out.println ("Enter qty of sharpner which you want to buy: ");
		int sharpner = scan.nextInt();
		
		int sum = (notebook * NOTEBOOK) + (computerbook * COMPUTERBOOK) + (eraser * ERASER)
				+ (ballpen * BALLPEN) + (pencil * PENCIL) + (sharpner * SHARPNER); 
		
		int rest = VALUELIMIT - sum;
		
		if (sum < VALUELIMIT) {
			System.out.println ("Student: " + name + " spent: " + sum 
					+ " rupees. You still have: " + rest + " rupees.");
		} else {
			System.out.println ("Respected " + name + ". Sorry but you total amount is: " 
					+ sum + " rupees. " + " But your limit is: " + VALUELIMIT + " rupees.");
		}
		
	}
	public static void main(String[] args) {
		bookStore ();

	}

}
