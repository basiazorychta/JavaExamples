package com.mix.examples;
import java.util.Scanner;

public class BookStore {

	public static void BookStore() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Student name: ");
		String name = scan.nextLine();

		int credit = 200;

		int notebook = 20;
		int computerscience = 40;
		int eraser = 6;
		int ballpen = 5;
		int pencil = 8;
		int sharpener = 4;

		int amount = (2 * notebook) + (1 * computerscience) + (3 * eraser) + (4 * ballpen) + (2 * pencil)
				+ (5 * sharpener);
		int difference = (credit - amount);

		System.out.println("Thank you mr  " + name + " for your shopping. You have bought: ");
		System.out.println("2 Note book,");
		System.out.println("1 Computer Science book,");
		System.out.println("3 Eraser,");
		System.out.println("4 Ball pen,");
		System.out.println("2 Pencil,");
		System.out.println("5 Sharpener.");

		System.out.print("Total Price is: " + amount + " and you have still: " + difference + " amount limit");

		if (amount > 200) {
			System.out.println("Respected " + name + " Sorry but your total amount is: " + amount + "Rupees "
					+ "but your limit is 200 Rupees");
		}

	}

	public static void BookStoreDynamic() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Student name: ");
		String name = scan.nextLine();

		System.out.print("Enter credit: ");
		int credit = scan.nextInt();

		System.out.print("Enter notebook value: ");
		int notebookvalue = scan.nextInt();
		System.out.print("Enter cost of notebook: ");
		int notebookcost = scan.nextInt();

		System.out.print("Enter Computer Science book value: ");
		int ComputerSciencebookvalue = scan.nextInt();
		System.out.print("Enter cost of Computer Science book: ");
		int ComputerSciencebookcost = scan.nextInt();

		System.out.print("Enter Eraser value: ");
		int Eraservalue = scan.nextInt();
		System.out.print("Enter cost of Erasercost: ");
		int Erasercost = scan.nextInt();

		System.out.print("Enter Ball pen value: ");
		int Ballpenvalue = scan.nextInt();
		System.out.print("Enter cost of Ball pen: ");
		int Ballpencost = scan.nextInt();

		System.out.print("Enter pencil value: ");
		int pencilvalue = scan.nextInt();
		System.out.print("Enter cost of pencil: ");
		int pencilcost = scan.nextInt();

		System.out.print("Enter sharpener value: ");
		int sharpenervalue = scan.nextInt();
		System.out.print("Enter cost of sharpener: ");
		int sharpenercost = scan.nextInt();

		System.out.println("Thank you mr  " + name + " for your shopping. You have bought: "
				+ "notebook, computerscience, eraser, ballpen, pencil, sharpener");

		int amount = (notebookvalue * notebookcost) + (ComputerSciencebookvalue * ComputerSciencebookcost)
				+ (Eraservalue * Erasercost) + (Ballpenvalue * Ballpencost) + +(pencilvalue * pencilcost)
				+ (sharpenervalue * sharpenercost);
		int difference = (credit - amount);

		System.out.print("Total Price is: " + amount + " you have: " + difference + " amount limit");

		if (amount > credit) {
			System.out.println("Respected " + name + " Sorry but your total amount is: " + amount + "Rupees "
					+ "but your limit is " + credit + " Rupees");
		}

	}

	public static void main(String[] args) {

		// BookStore ();
		BookStoreDynamic();

	}

}
