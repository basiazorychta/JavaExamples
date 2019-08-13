package com.pluralsight.training;

public class LetsGetLogical {

	public static void main(String[] args) {
		//  & vs &&

		int students = 150;
		int rooms = 0;

		if (rooms > 0 && students / rooms > 30) {
			System.out.println("Crowded");
		}

		System.out.println();
		System.out.println("** end program **");

	}

}
