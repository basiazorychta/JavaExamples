package dataTypes;

import java.util.Scanner;

public class MethodReturn {

	public static int Add(int a, int b) {

		int sum = a + b;

		return sum;

	}

	public static double GetRadious(double radious) {

		double pi = 3.141592;
		double area = pi * radious * radious;

		return area;

	}

	public static String Info(String name, String address, int id) {

		String detail = "My name is : " + name + ", My address is :  " + address + ", My id number is : " + id;

		return detail;

	}

	public static boolean IsPrime(int value) {

		for (int a = 2; a < value / 2; a++) {

			if (value % a == 0) {

				return false;

			}
		}

		return true;
	}
	
	public static void PrimeBetween() {

		// Scanner scan = new Scanner(System.in);

		/*
		 * System.out.print ("Enter first number : "); int first = scan.nextInt();
		 * 
		 * System.out.print ("Enter last number: "); int last = scan.nextInt();
		 */

		for (int i = 1; i <= 100; i++) {

			boolean ans = IsPrime(i);

			// if (ans == true) {}

			if (ans) {
				System.out.println(i);
			}

		}

	}

	public static String DayOfWeek(int value) {

		//String day1 = "Monday"; 
		//String day2 = "Tuesday";
		//String day3 = "Wednesday";
		//String day4 = "Thursday"; 
		//String day5 = "Friday"; 
		//String day6 = "Saturday"; 
	    //String day7 = "Sunday";
		
		String day = "";
		

		if (value == 1) {
			day = "Monday";
		} else if (value == 2) {
			day = "Tuesday";
		} else if (value == 3) {
			day = "Wednesday";
		} else if (value == 4) {
			day = "Thursday";
		} else if (value == 5) {
			day = "Friday";
		} else if (value == 6) {
			day = "Saturday";	
		} else if (value == 7) {
			day = "Sunday";
		} else
			day = "Invalid Input";

		
		return day;
		
	}


	public static void main(String[] args) {

		// int sum = Add (10,30);
		// System.out.println(sum);

		//double ans = GetRadious(20);
		//System.out.println(ans);
		
		//System.out.println (Info ("Carin", "London", 761023465));

		//System.out.println(IsPrime (10));

		//PrimeBetween();
	
		System.out.println (DayOfWeek(2));

	}

}
