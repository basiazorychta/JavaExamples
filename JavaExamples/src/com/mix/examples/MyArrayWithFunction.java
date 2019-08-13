package com.mix.examples;
import java.util.Scanner;

public class MyArrayWithFunction {

	public static void Print(int value) {

		System.out.println(value);

	}

	public static void Print(char value) {

		System.out.println(value);

	}

	public static void Print(String value) {

		System.out.println(value);

	}

	public static void PrintArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			Print(i + " - " + arr[i]);
		}

	}

	public static void ArrayInput() {

		Scanner scan = new Scanner(System.in);

		int[] value = new int[5];
		for (int i = 0; i < value.length; i++) {

			Print("Enter value");
			value[i] = scan.nextInt();
		}

		PrintArray(value);
	}

	public static void array_1() {

		int[] arr = { 20, 30, 40 };

		PrintArray(arr);

		/*
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * Print(arr[i]);
		 * 
		 * }
		 */

	}

	public static void array_2() {

		int[] age = { 39, 25, 49, 56, 45, 43 };

		PrintArray(age);
	}

	public static void FindVowels__() {

		String phar = "Print only vowels";

		for (int i = 0; i < phar.length(); i++) {

			// phar.charAt(i);

			if ((phar.charAt(i) == 'a') || (phar.charAt(i) == 'A') || (phar.charAt(i) == 'E') || (phar.charAt(i) == 'e')
					|| (phar.charAt(i) == 'I') || (phar.charAt(i) == 'i') || (phar.charAt(i) == 'O')
					|| (phar.charAt(i) == 'o') || (phar.charAt(i) == 'U') || (phar.charAt(i) == 'u')) {

				Print(i + " : Vowels in this pharagraph: " + phar.charAt(i));
			}
		}

	}

	public static void FindVowels() {

		String phar = "Print only vowels";

		for (int i = 0; i < phar.length(); i++) {

			// phar.charAt(i);

			char ch = phar.charAt(i);
			
			boolean result = IsVowel(ch);

			if (result == true) {

				Print(i + " : Vowels in this pharagraph: " + phar.charAt(i) + " " + phar.length());
			}
		}

	}

	public static boolean IsVowel(char ch) {

		// boolean result = false;

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {

			return true;

		} else {

			return false;

		}
	}

	public static void StringFunction() {

		String name = "Quick brown fox jumps";

		name.contains("fox jum");

		Print(name.toUpperCase());

	}

	public static void Hello() {

		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println("Print Array");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " " + arr[i]);
		}

		String ss = "Hello";
		System.out.println("Print String");
		for (int i = 0; i < ss.length(); i++) {
			System.out.println(i + " " + ss.charAt(i));
		}
	}

	public static void ArrayDynamic() {

		Scanner scan = new Scanner(System.in);
		int[] value = new int[3];

		for (int i = 0; i < value.length; i++) {

			Print("Enter value");
			value[i] = scan.nextInt();

		}
		PrintArray(value);
	}

	public static void main(String[] args) {

		/*
		 * char s[] = {'a','b','c'};
		 * 
		 * System.out.println(s[0]);
		 * 
		 * String ss = "Hello";
		 * 
		 * for(int i = 0; i < ss.length(); i ++) { char ch = ss.charAt(i);
		 * 
		 * System.out.println(ch); // ss[i] }
		 */

		// StringFunction();
		// Hello();

		// boolean ans = IsVowel('a');
		// System.out.println(ans);

		//returnArray();
		
		//ArrayInput();
		//array_2();
		//FindVowels__();
		//FindVowels();
		System.out.println (IsVowel('p'));

	}
}
