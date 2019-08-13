package com.youtube.forbeginers;

public class Exercise3Array {

	public static void Array() {

		int[] values = new int[3];

		values[0] = 10;
		values[1] = 5;
		values[2] = 20;

		int[] array = { 10, 5, 20 };
		array[2] = 40; // {10, 5, 4);
		int x = array[1] + 5; // {10, 10, 20};

		System.out.println(x);

	}

	public static void Array1() {

		int[] amount = new int[5];

		for (int i = 0; i < amount.length; i++) {
			amount[i] = i;
			int y = amount[i] * amount[i];
			System.out.println(y);
		}
	}

	public static void Array2() {

		int[] val = new int[5];
		int i = 0;

		while (i < val.length) {
			val[i] = i;
			int y = val[i] * val[i];

			System.out.println(y);
			i++;
		}

	}

	public static void Array3 () {
		
		int [] myarray = {20,40,32,555,321};
		int index = 0;
		
		while (index < myarray.length) {
			System.out.println (myarray [index]);
			index++;
		}
		
		System.out.println (" ----------- ");
		
		for (index = 0; index < 5 /* myarray.length*/; index++) {
			System.out.println (myarray [index]);
		}
	}
	
	public static void Array4 () {
		
		int [] arr = {1, 2, 4, 5, 8, 3};
		String [] name = new String [5];
		
		int index = 0;
		for (int element: arr) {
			System.out.println (element + " " + index);
			index ++;
		}
		
	}
	public static void Result(int[] player) {
		
		// to find best and fastes player
		
		int faster = player[0];
		
		for (int j = 0; j < player.length -1; j++) {
			if (player[j] > player[j + 1]) {
				faster = player[j + 1];
			}

		}
		System.out.println("winner is: " + faster + " with min time");

	}

	public static void main(String[] args) {

		// Array();
		// Array1 ();
		// Array2 ();
		//Array3();
		Array4 (); 

		//int[] array = { 23, 45, 15, 21, 22, 76 };
		//Result(array);

	}

}
