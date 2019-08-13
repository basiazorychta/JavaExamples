package com.mix.examples;

public class Exemples {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if (i == 5) {
				break;
			}
		}
		
		System.out.println ();

		for (int i = 0; i < 10; i++) {
			if ( i >= 8)
				continue;
			
			{
				System.out.print(i + " ");

			}

		}

	}

}
