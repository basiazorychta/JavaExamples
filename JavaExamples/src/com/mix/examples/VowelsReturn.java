package com.mix.examples;

public class VowelsReturn {

	public static boolean IsVowel(char ch) {

		// boolean result = false;

		if (ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'
				|| ch == 'U') {

			return true;

		} else {

			return false;

		}

		/* other optional way to write program to find vowel without else
		 * 
		 * boolean result = false;
		 * 
		 * if (ch == 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u' || ch == 'A' || ch=='E' 
		 * || ch== 'I' || ch== 'O' || ch== 'U') {
		 * 
		 * 
		 * 
		 * result = true;
		 * 
		 * }
		 * 
		 * 
		 * 
		 * return result;
		 */
	}


	
	public static void main(String[] args) {
		boolean ans = IsVowel('a');
		System.out.println(ans);

	}

}
