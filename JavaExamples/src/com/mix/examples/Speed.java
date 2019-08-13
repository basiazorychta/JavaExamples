package com.mix.examples;
import java.util.Scanner;

public class Speed {

	public static void HowFast() {

		int SPEED = 110;

		if (SPEED <= 80) {
			System.out.println("Nice and pleasent driving");
		} else if (SPEED > 80 && SPEED < 100) {
			System.out.println("You are driving fast, you are fined 500 Rupees");
		} else if (SPEED >= 100 && SPEED < 120) {
			System.out.println("Your driving can injured you and others, you are fined 1000 Rupees");
		} else {
			System.out.println("Hand over your driving licence! you are not allowed to drive on road");
		}
	}

	public static void FastInput() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter speed: ");
		int speed = scan.nextInt();

		System.out.println("Your speed: " + speed);

		if (speed <= 80) {
			System.out.println("Nice and pleasent driving");
		} else if (speed > 80 && speed < 100) {
			System.out.println("You are driving fast, you are fined 500 Rupees");
		} else if (speed >= 100 && speed < 120) {
			System.out.println("Your driving can injured you and others, you are fined 1000 Rupees");
		} else {
			System.out.println("Hand over your driving licence! you are not allowed to drive on road");
		}

	}

	public static void main(String[] args) {

		// HowFast();
		FastInput();

	}

}
