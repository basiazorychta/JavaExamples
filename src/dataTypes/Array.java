package dataTypes;

import java.util.Scanner;

public class Array {

	public static void ArrayInt1() {

		/*
		 * Arrays are used to store values in a single variable, instead of declaring
		 * separate variables for each value.
		 * 
		 * To declare an array, define the variable type with square brackets in Array
		 * Array index start from 0
		 */

		int[] number = new int[3];

		number[0] = 100;
		number[1] = 20;
		number[2] = 130;

		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);

	}

	public static void ArrayInt2() {

		int[] myarray = { 200, 100, 50, 25 };

		int i = 0;
		while (i < 4) {
			System.out.println(myarray[i]);
			i++;
		}

	}

	public static void ArrayDouble() {

		double[] number = new double[6];

		number[0] = 100.54;
		number[1] = 20;
		number[2] = 130.9876;
		number[3] = 10.00;
		number[4] = 2.56789;
		number[5] = 3.14159;

		for (int i = 0; i < number.length; i++) {
			System.out.println(i + " - index: " + number[i]);
		}

	}

	public static void ArrayString() {

		String[] flowers = { "Tulipe", "Rose", "Orchidea" };

		// System.out.println(flowers[0]);
		// Now Sunflower instead of Tulipe

		flowers[0] = "Sunflower";
		System.out.println(flowers[0]);

	}

	public static void CreateArray() {
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = i * 10;

		}

		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void CreateTwoArrays() {
		int[] age = new int[5];
		int[] height = new int[5];

		for (int i = 0; i < 5; i++) {
			age[i] = i * 4;

		}

		for (int j = 0; j < 5; j++) {

			height[j] = j * 6;

		}

		for (int k = 0; k < 3; k++) {
			System.out.println(age[k] + " x " + height[k] + " = " + age[k] * height[k]);

		}

	}

	public static void DayOfWeek() {

		String[] day = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		System.out.println(day.length);

		for (int i = 0; i < day.length; i++) {

			System.out.println(i + " - " + day[i]);

		}

	}

	public static void SeasonsSize() {
		String[] seasons = { "Springtime", "Summer", "Autumn", "Winter" };

		System.out.println("Within a Year we have: " + seasons.length);

		for (int i = 0; i < seasons.length; i++) {
			System.out.println(i + " season-s: " + seasons[i]);
		}
	}

	public static void Numbers() {

		int[] arr = { 20, 50, 70, 987 };

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		for (int x : arr) {
			System.out.println(x);
		}
	}

	public static void ExempleWithoutAllData() {

		int[] x = new int[5];

		x[3] = 25;
		x[0] = 12;

		for (int temp2 : x) {
			System.out.println(temp2);

		}
		System.out.println("-----------------------");

		String[] st = { "one", "two", "three" };
		for (String temp : st) {
			System.out.println(temp);
		}
		System.out.println("-----------------------");

		String[] stx = new String[5];
		stx[3] = "25";
		stx[0] = "12";
		for (String temp2 : stx) {
			System.out.println(temp2);
		}

	}

	public static void MultidemensionalArray() {

		/*
		 * To create a two-dimensional array, add each array within its own set of curly
		 * braces
		 */

		int[][] data = { { 1, 3, 5, 7 }, { 0, 8, 6, 4 }, { 2, 5, 9, 7 } };

		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data[i].length; j++) {

				System.out.print(data[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static void ArrayStringInput() {

		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];

		for (int i = 0; i < name.length; i++) {
			System.out.println("Enter name: ");
			name[i] = scan.nextLine();
		}

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);

		}

	}

	public static void ArrayIntInput() {

		Scanner scan = new Scanner(System.in);

		int[] value = new int[5];
		for (int i = 0; i < value.length; i++) {

			System.out.println("Enter value");
			value[i] = scan.nextInt();
		}

		for (int i = 0; i < value.length; i++) {
			System.out.println(i + " - " + value[i]);
		}
	}

	public static void ArrayDemo1() {

		final int EMPLOYEES = 2;
		int[] hours = new int[EMPLOYEES];

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the hours worked by " + EMPLOYEES + " employees.");

		System.out.print("Employee 1: ");
		hours[0] = keyboard.nextInt();

		System.out.print("Employee 2: ");
		hours[1] = keyboard.nextInt();

		System.out.println("The hours you entered are: ");
		System.out.println(hours[0]);
		System.out.println(hours[1]);

	}

	public static void DaysInMonth() {

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < 12; i++) {
			System.out.println("Month " + (i + 1) + " has " + days[i] + " days.");

		}

	}

	public static void ArrayDemo2() {

		int[] values = new int[5];
		for (int i = 0; i < 5; i++) {
			values[i] = i + 1;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(values[i]);

		}

	}

	public static void ReversArray() {

		int[] number = { 1, 23, 40, 56, 128 };

		System.out.println("Normall Array - From left to right: ");

		for (int i = 0; i < number.length; i++) {

			System.out.println(number[i]);
		}

		System.out.println(" ");
		System.out.println("Revers Array - From right to left : ");

		for (int i = number.length - 1; i >= 0; i--) {

			System.out.println(number[i]);
		}
	}

	public static void SameArray() {

		/*
		 * This program demonstrates that two variables can 3 reference the same array.
		 */

		int[] array1 = { 20, 35, 50, 78 };
		int[] array2 = array1;

		// int[] array2 = array1.clone(); - if we want to create independent array,

		array1[1] = 666;
		array2[3] = 555;

		System.out.println("The contents of array1 : ");
		for (int value : array1) {
			System.out.print(value + " ");
		}
		System.out.println();

		System.out.println("The contents of array2 : ");
		for (int value : array2) {
			System.out.print(value + " ");

		}
		System.out.println();
	}

	public static void PrintArray(int i) {
		System.out.print(i + " ");
	}

	public static void PassElement() {

		/*
		 * This program demonstrates passing individual array 3 elements as arguments to
		 * a method.
		 */

		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < numbers.length; i++) {

			PrintArray(numbers[i]);
		}

	}

	public static void SummingArray() {

		int[] units = {2,5,33};
		int total = 0;

		for (int i = 0; i < units.length; i++) {
			total += units[i];
			// total = total + units[i];

		}
		System.out.println (total);
	}

	public static void main(String[] args) {

		// ArrayInt1 ();
		// ArrayDouble();
		// ArrayString();
		// CreateArray();
		// CreateTwoArrays();
		// DayOfWeek ();
		// SeasonsSize();
		// Numbers ();
		// ExempleWithoutAllData();
		// MultidemensionalArray();
		// ArrayStringInput();
		// ArrayIntInput();
		// ArrayDemo1();
		// ArrayDemo2();
		// DaysInMonth();
		// ReversArray();
		// SameArray();
		// PassElement ();
		SummingArray();

	}

}
