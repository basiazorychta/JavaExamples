package com.training;

import java.util.Arrays;
import java.util.Scanner;

public class Training13Array {

	/**
	 * 1. Write a function to declare an integer array of size 5, take input from
	 * user and display on screen.
	 */

	public static void array() {

		int[] input = new int[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < input.length; i++) {
			System.out.println("Enter integer value ");
			input[i] = scan.nextInt();
		}
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

	/**
	 * 2. Write a Function to declare an integer of size 5, take input from user and
	 * display all values and sum of the values on screen.
	 */

	public static void sumArray() {

		int[] input = new int[5];
		int sum = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < input.length; i++) {
			System.out.println("Enter integer value ");
			input[i] = scan.nextInt();
		}
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);

			sum = input[i] + sum;
		}
		System.out.println(sum);
	}

	/**
	 * 3. Write a function to declare 3 arrays of integers of size 5, take input in
	 * first two arrays, add those two arrays and store result in third array
	 */

	public static void arrayOfTree() {

		int[] arr_1 = new int[5];
		int[] arr_2 = new int[5];
		int[] arr_3 = new int[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arr_1.length; i++) {
			System.out.println("Enter integer arr_1 ");
			arr_1[i] = scan.nextInt();
		}
		for (int j = 0; j < arr_2.length; j++) {
			System.out.println("Enter integer arr_2 ");
			arr_2[j] = scan.nextInt();
		}
		for (int k = 0; k < arr_3.length; k++) {
			arr_3[k] = arr_1[k] + arr_2[k];
		}
		for (int i = 0; i < arr_3.length; i++) {
			System.out.println(arr_1[i] + " + " + arr_2[i] + " = " + arr_3[i]);
		}
	}

	/**
	 * 4. Write a function which takes 2 int type arrays, match if arrays are same
	 * return true otherwise false.
	 * 
	 * int[] arr_1 = { 0, 2, 5 };
		int[] arr_2 = { 0, 2, 5, 6 };
	 */

	public static boolean isMatch(int[] arr1, int[] arr2) {
		
		if (arr1.length != arr2.length) {
			return false;
		}

		boolean answer = true;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				answer = false;
				break;
			}
		}

		return answer;
	}

	/**
	 * 5. Write a function which takes int array as parameter and return larger
	 * value of the array.
	 */

	public static int maxValue(int[] value) {

		int max = value[0];

		for (int i = 0; i < value.length; i++) {
			if (value[i] > max) {
				max = value[i];
			}
		}

		return max;

	}

	/**
	 * 6. Write a function which takes int array as parameter and return smaller
	 * value of the array.
	 */

	public static int minValue(int[] value) {

		int min = value[0];

		for (int i = 0; i < value.length; i++) {
			if (value[i] < min) {
				min = value[i];
			}
		}

		return min;

	}

	/**
	 * 7. Write a function to print a reverse an array  
	 * input = 4 5 2 6  
	 * output = 6 2 5 4
	 */

	public static void printReverseArray(int[] arr) {

		System.out.println("Normal array : ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}

		System.out.println("\nReverse array :  ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public static int [] reverseArray ( int [] oldarray) {
		
		int [] newarray = new int [oldarray.length];
		
		printArray (oldarray);
		
		
		
		for (int i = oldarray.length - 1, j = 0; i >= 0; i--, j++) {
			newarray [j] = oldarray[i];
		}
		printArray (newarray);
		
		return newarray;
	}

	/**
	 * 9. Write a function to check if array is palindrome
	 * 
	 * Palindrome is a value if you write it reverse, it will remain same. For
	 * example:
	 * 
	 * 101 palindrome ababa palindrome 12321 palindrome
	 * 
	 * 12332 not palindrome afggff not palindrome
	 */

	public static boolean isPalindrom(int[] array) {

		boolean answer = true;

		if (array.length <= 1) {
			return true;
		}
		
		for (int i = 0, j = array.length -1; i < array.length/2; i++, j--) {
			if (array[i] != array [j]) {
				answer = false;
				break;
			}
		}

		return answer;
	}

	public static void printArray (int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println (arr[i]);
		}
	}
	
	public static void main(String[] args) {

		
		/**int[] arr_sec = { 4,6,7 }; 
		boolean answer = isPalindrom (arr_sec);
		System.out.println (answer);
		*/
		
		/** int[] arr_sec = { 67, 2, 5, 9, 3, 56, 786, 456 };
		Arrays.sort(arr_sec);
		printArray (arr_sec);
		*/
		
		/** int[] arr_sec = { 67, 2, 5, 9};
		reverseArray (arr_sec);
		*/

		/**int[] arr_sec = { 2, 5, 9, 3, 56, 786, 456 };
		printReverseArray (arr_sec);
		*/

		/**
		int[] arr = {2,5,9,3,56,786,456}; 
		int result = maxValue (arr);
		System.out.println ("Max value is : " + result);
		System.out.println ("Min value is: " + minValue (arr));
		*/
		

	/**	int[] arr_1 = { 0, 2, 5};
		int[] arr_2 = { 0, 2, 5,6};
		boolean answer = isMatch (arr_1, arr_2);
		System.out.println(answer);
		*/

		// isArrayMatch ();

		// arrayOfTree ();
		//sumArray ();
		// array();

	}

}
