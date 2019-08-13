package com.training;

public class Training10WhileLoop {

	/** 1.Write a while loop to display numbers between 23 to 69.
	*/
	
	public static void showNumbers () {
		
		int i = 23;
		
		while (i <=69) {
			System.out.println (i);
			i++;
		}
	}
	/**2. Write a while loop to display only even numbers of exercise 1.
	*/
	
	public static void onlyEven () {
	
		int number = 23;
		
		while (number <= 69) {
		
			if ( number % 2 == 0) {
				System.out.println (number);
			}
			number++;
		}
		}
		
	/**3. write a while loop to display 

	odd numbers
	sum of odd numbers
	also check that sum is even or odd, take exercise 1 an input.
	*/
	
	public static void oddNumber () {
		
		int number = 23;
		int sum = 0;
		
		while (number <=69) {
			
			if (number % 2 != 0) {
				System.out.println (number);	
				sum = sum + number;
			}
		number ++;
		}
			if (sum % 2 == 0) {
				System.out.println("Sum is : " + sum + " It is Even");
			} else {
				System.out.println("Sum is : " + sum + " It is Odd");
		}
		
	}
	
	/** 4. write a while loop to display sum (from 0 till given number).
	   
	   Example: given number is 5 and answer is 15 
	   and program should calculate like 0 + 1 + 2 + 3 + 4 + 5 
	*/
	
	public static void sum ( int givenNumber) {
		
		int i = 0;
		int sum = 0;
		
		while (i <= givenNumber) {
			
			System.out.print (i);
			
			sum = sum + i;
			i++;
		}
			System.out.println (sum);
			
		}
		
	/** 5. Write a while loop to Print the numbers between 0 and 100. 
	 * If number is divisible by four but not by five then print the number
	*/
	
	public static void numberBetween (int number) {
		
		int i = 0;
		
		while (i <= number) {
			if ((i % 4 == 0 && i % 5 != 0)) {
				System.out.println (i);
			}
			i++;
		}
		
	}
	
	/** 6. print the table of given number.
	 */
	
	public static void table ( int number) {
		
		int i = 0;
		
		while (i <= 10) {
		System.out.println (number + " * " + i + " = " + (number * i));
		i++;
		}
	}
	public static void main(String[] args) {
		
		//table (2);
		
		//numberBetween (20);
		
		//sum (5);
		
		//oddNumber ();
		
		// onlyEven ();
		
		//showNumbers ();
		
		

	}

}
