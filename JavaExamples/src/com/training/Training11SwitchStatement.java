package com.training;

public class Training11SwitchStatement {

	/**Program to print day of week using switch case. 
	
	Function should take int parameter and return String... 
	for invalid input function should return "Invalid input"
	
	*/
	public static void dayOfWeek (int day) {
		
		switch (day) {
		
		case 1 :
			System.out.println ("Monday");
			break;
		case 2:
			System.out.println ("Tuesday");
			break;
		case 3:
			System.out.println ("Wednesday");
			break;
		case 4:
			System.out.println ("Thursday");
			break;
		case 5:
			System.out.println ("Friday");
			break;
		case 6:
			System.out.println ("Saturday");
			break;
		case 7:
			System.out.println ("Sunday");
			break;
		default:
			System.out.println ("Invalid input");
		}
		
	}
	
	/** Write a program to check whether an alphabet is vowel or not using switch case,
	Function should take one parameter as character and return boolean. 
	Function should work for Capital and small letters both

	Vowels are A E I O U
	*/
	
	public static boolean isVowel01 (char ch) {
		
		boolean result;
		
		switch (ch) {
		
		case 'a':
			System.out.println (ch + " is vowel");
			result= true;
			break;
		case 'A':
			System.out.println (ch + " is vowel");
			result= true;
			break;
		case 'e':
			System.out.println (ch + " is vowel");
			result= true;
			break;
		case 'E':
			System.out.println (ch + " is vowel");
			result= true;
			break;
		case 'i':
			System.out.println (ch + " is vowel");
			result= true;
			break;
		case 'I':
			System.out.println (ch + " is vowel");
			result= true;
			break;
		case 'o':
			System.out.println (ch + " is vowel");
			result= true;
			break;
		case 'O':
			System.out.println (ch + " is vowel");
			result= true;
			break;
		case 'u':
			System.out.println (ch + " is vowel");
			result= true;
			break;
		case 'U':
			System.out.println (ch + " is vowel");
			result= true;
		break;
			
		default:
			System.out.println (ch + " is not vowel");
			result = false;
		
		}
		
		return result;
	}
	
	public static boolean isVowel (char ch) {
		
		boolean result;
		
		switch (ch) {
		
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println (ch + " is vowel");
			result= true;
		break;
			
		default:
			System.out.println (ch + " is not vowel");
			result = false;
		
		}
		
		return result;
	}
	/** Program to create Simple Calculator using switch case, 
	Function should take one character (for + - / *) and two integers for calculations.
	*/
	
	public static void simpleCalculator (char ch, int a, int b) {
		
		switch (ch) {
		
		case '+':
			System.out.println (a + " + " + b + " = " + (a+b));
			break;
		case '-':
			System.out.println (a + " - " + b + " = " + (a-b));
			break;
		case '/':
			System.out.println (a + " / " + b + " = " + (a/b));
			break;
		case '*':
			System.out.println (a + " * " + b + " = " + (a*b));
			break;
		default:
		System.out.println ("Invalid input");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		simpleCalculator ('+', 20, 5);
		simpleCalculator ('-', 20, 5);
		simpleCalculator ('/', 20, 5);
		simpleCalculator ('*', 20, 5);
		simpleCalculator ('%', 20, 5);
		
		boolean result = isVowel('a');
		
		/**dayOfWeek (1);
		dayOfWeek (3);
		dayOfWeek (5);
		dayOfWeek (9);
		*/
	}

}
