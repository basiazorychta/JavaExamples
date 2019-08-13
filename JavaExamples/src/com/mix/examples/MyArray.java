package com.mix.examples;
import java.util.Scanner;

public class MyArray {

	public static void CreateArray_1() {

		int[] arr = new int[5];

		// in Array we always start from 0

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		Print (arr[0]);
		Print ("Hello World");
		
		System.out.println("0" + arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

	}

	public static void CreateArray_2() {
		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = i * 10;
			

		}

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void CreateTwoArrays() {
		int[] age = new int[3];
		int[] height = new int[3];

		for (int i = 0; i < 3; i++) {
			age[i] = i * 4;

		}

		for (int j = 0; j < 3; j++) {

			height[j] = j * 6;

		}

		for (int k = 0; k < 3; k++) {
			System.out.println(age[k] + " x " + height[k] + " = " + age[k] * height[k]);

		}

	}

	public static void ProjectCostArray() {

		// Project for 3 junior programist, 3 senior programist, 1 Project manager

		int[] juniorprogrammer = new int[1];
		int[] seniorprogrammer = new int[1];
		int[] projectmaganer = new int[1];

		for (int i = 0; i < 1; i++) {
			juniorprogrammer[i] = 3 * (i + (100 * 10));
		}

		for (int j = 0; j < 1; j++) {
			seniorprogrammer[j] = 3 * (j + (150 * 10));
		}

		for (int k = 0; k < 1; k++) {
			projectmaganer[k] = 1 * (k + (475 * 10));
		}

		for (int l = 0; l < 1; l++) {
			System.out.println("Cost of Project: " + juniorprogrammer[l] + " + " + seniorprogrammer[l] + " + "
					+ projectmaganer[l] + " = " + (juniorprogrammer[l] + seniorprogrammer[l] + projectmaganer[l]));
		}

	}

	public static void DayOfWeekArray() {
		String[] dayofweek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		for (int i = 0; i < 7; i++) {
			System.out.println(i + " day of week is: " + dayofweek[i]);
		}
	}

	public static void ArraySize() {
		String[] dayofweek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		System.out.println("The size of array " + dayofweek.length);

		for (int i = 0; i < dayofweek.length; i++) {
			System.out.println(i + " day of week is: " + dayofweek[i]);
		}
	}

	public static void CreateArrayString( ) {

		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];

		for (int i = 0; i < name.length; i++) {
			Print("Enter name: ");
			name[i] = scan.nextLine();
		}

		for (int i = 0; i < name.length; i++) {
			Print(name[i]);

		}

	}
	
	
	public static void Print (String value) {
		
		System.out.println (value);
	}

	
	public static void Print (int value) {
		
		System.out.println (value);
		
	}
	
	public static void ReversArray () {
		
		int [] arr = {10, 20, 30, 40};
		
		Print ("Normall Array");
				
		for (int i=0; i<arr.length; i++) {
			
			Print (arr [i]);
		}
		
		
		PrintArray (arr);
		
		Print (" ");
		Print ("Revers Array: ");
		
		for (int i=arr.length-1; i>=0; i--) {
			
			Print (arr[i]);
		}
	}
	
	public static void PrintArray (int [] arr) {
		
		for (int i=0; i<arr.length; i++) {
			
			Print (arr [i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		//int [] arr = {23,35,56};
		
		ReversArray ();
		
		//CreateArray_1 ();
		//CreateArray_2 ();
		
		//CreateTwoArrays();
		//ProjectCostArray();
		//DayOfWeekArray();
		//ArraySize();
		//CreateArrayString( );

	}

}
