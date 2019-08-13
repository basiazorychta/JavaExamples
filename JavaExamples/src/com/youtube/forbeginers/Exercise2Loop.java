package com.youtube.forbeginers;

import java.util.Scanner;

public class Exercise2Loop {

	public static void loopB() {

		int i = 0;

		for (i = 0; i < 100; i++) {
			if (i == 50) {
				break;
			}
			System.out.println(i);
		}
	}

	public static void loopC() {

		int i = 0;

		for (i = 0; i < 100; i++) {
			if (i == 50) {
				continue;
			}
			System.out.println(i);
		}
	}

	public static void Embeddedloops() {

		for (int g = 0; g < 3; g++) {
			for (int h = 1; h < 4; h++) {
				System.out.println(g + " " + h);
			}
		}
	}

	public static void While1() {

		int i = 0;

		while (i <= -1) {
			System.out.println(i);
			i++;
		}
	}

	public static void While2() {

		int i = 10;

		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}

	public static void While3 () {
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Type a number : ");
		int i = sc.nextInt();
		
		int count = 0;
		
		while (i != 10) {
			System.out.println ("Type 10");
			System.out.println ("Type a number : ");
			i = sc.nextInt();
			count ++;
		}
		System.out.println ("You tried " + count + " times");
	}
	
	public static void DoWhile1() {

		System.out.println(" --------------------------- ");
		int j = 0;

		do {
			System.out.println(j);
			j++;
		} while (j <= -1);

	}

	public static void main(String[] args) {

		// loopB ();
		// loopC ();
		// Embeddedloops ();
		//While1 ();
		// While2();
		While3 ();
		//DoWhile1();

	}

}
