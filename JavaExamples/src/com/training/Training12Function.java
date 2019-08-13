package com.training;

public class Training12Function {

	/** 1. Write a function which return true or false if number is prime or not.
		*/
	
	public static boolean isPrime (int number) {
	
		boolean result = true;
		
		for (int i = 2; i < number; i++) {
			
			if (number % i == 0) {
 				result = false;
 				break;
			}
		}
		return result;
			
	}
	
	/** 2. Write a function which print all prime numbers in range of 1 to 100.
	 */
	
	public static void primeNumbers (int from, int till) {
		
			for (int i = from; i <= till; i++) {
				if (isPrime(i)) {
					System.out.println (i + " Prime" );
				}
			}
	}
	
	/**3. Write a function which print power of given base.

	Example: 
	base 2 with power of 3 answer is 8 
	2 * 2 * 2 = 8

	base 3 power of 4 answer is 81
	3 * 3 * 3 * 3 = 81

	Function will take two parameters double base, double power 
	and will return double as a result. 
	*/
	
	public static int getPower (int base, int power) {
		
		int sum =1;
		
		for (int i = 1; i<= power; i++) {
			sum = sum * base;
		}
		return sum;
		
	}
	public static void printPower (int base, int power) {
		
		int sum =1;
		
		for (int i = 1; i<= power; i++) {
			sum = sum * base;
			System.out.println ("Result of Power for base " + base + " and power " + power + " is: " + sum );
		}
		System.out.println (" ----------------");
		System.out.println ("Result of Power is: " + sum );
		
	}
	
	/**4. Write a function to get the square root of given number, 
	 * Function will take int as parameter and return int square root as value.
	 * if given value has no square root then return 0;
	*/
	
	public static int squareRoot (int value) {
	
		if (value == 0 || value == 1) {
			return value;
	
		}
		int answer = -1;
	
		for (int i = 2; i<= value; i++) {
			if ((i*i) == value) {
			answer = i;
			break;
			
		}
			if ((i*i) > value) {
			break;
		}
	}
		return answer;
}
	
	/**5. Write a function to return absolute value of given number, 
	 * function will take double as parameter and return double

			absloue of 5 is 5
			absloue of -5 is 5

			*/
	
	public static double absolute01 (double givennumber) {
		
		if (givennumber >= 0) {
			System.out.println ("Absolute value of"  + givennumber + " = " + givennumber );
			return givennumber;
		}
		
		givennumber = givennumber * (-1);
		System.out.println ("Absolute value of"  + givennumber + " = " + givennumber );
			return givennumber;
	}
	
	public static double absolute (double givennumber) {
		
		if (givennumber < 0) {
			givennumber = givennumber * (-1);
		}
		
		
		return givennumber;
	}
	
	/** 6. Write a function to return floor value of given number, 
	 * function will take double as parameter , function must return valid value.

			floor of 2.3 is 2.0 
			floor of 3.8 is 3.0

			Cieling of 2.3 is 3

			double i = 3.3;
			int temp = i ;
	*/
	
	public static int floorvalue (double givennumber) {
		
		
		int floornumber = (int)givennumber;
		
		return floornumber;
	}
			
	/**7. Write a program to find all Armstrong number in the range of 100 and 999.

	An Armstrong number of three digits is an integer such that the sum 
	of the cubes of its digits is equal to the number itself. 
	For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.
	*/
	
	public static boolean isArmstrong01 ( int number) {
		
		boolean answer = false;
		
		if (number > 100 && number < 1000) {
			
			int firstdigit = number / 100;
			int modulus = number % 100;
			int seconddigit = modulus / 10;
			int thirddigit = modulus % 10;
			
			int sum = getPower (firstdigit, 3) + 
					  getPower (seconddigit, 3) +
					  getPower (thirddigit, 3);
			
			if (sum == number) {
			
				answer = true;
			}
		}
		
		return answer;
	}
	
	public static boolean isArmstrong (int number) {
		
		boolean answer = false;
		
		String str = Integer.toString(number);
		
		int length = str.length();
		
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i); // char ch = str [i];
			int base = Character.getNumericValue(ch);
			
			sum += getPower (base, length);
			
		}
		
		if (sum == number) {
			answer = true;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		//System.out.println (isArmstrong (12));
		
		for (int i = 150; i < 400; i++) {
			System.out.println (i + "is : " +isArmstrong01 (i));
			System.out.println (i + "is : " +isArmstrong (i));
		}
		
		
		/**boolean answer = isArmstrong (371);
		System.out.println (answer);
		*/
		
		// System.out.println (floorvalue (8.93));
		
		/**Math.abs(9);
		
		for (int i = -5; i<=5; i++) {
		System.out.println ("Absolute value of"  + i + " = " + absolute(i));
		}
		
		*/
		/**for (int i = 0; i <=100 ; i++ ) {
		
		System.out.println ("square root is " + i + " is " + squareRoot (i));
		}
		*/
		
		//printPower (2,8);
		
		
		//primeNumbers (2,71);
		
		/**int i = 5;
		System.out.println (i + " " + isPrime (i));
		*/
		
		/** for (int i = 2; i<=71; i++) {
			System.out.println (i + " " + isPrime (i));
			}
			*/
		
	

	}

}
