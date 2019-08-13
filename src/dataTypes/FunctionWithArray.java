package dataTypes;

public class FunctionWithArray {

	public static boolean CompareArray(int[] array1, int[] array2) {

		if (array1 == array2) {
			for (int i = 0; i < array1.length; i++) {
				return true;
			}
		} else {

		}
		return false;

	}

	public static int[] AddTwoArray(int[] array1, int[] array2) {

		int length = array1.length + array2.length;
		int[] arrayanswer = new int[length];

		for (int i = 0; i < length; i++) {
			arrayanswer[i] = array1[i] + array2[i];

		}
		return arrayanswer;

	}

	public static int AddArray(int[] array) {

		int result = 0;

		for (int value : array) {
			result += value;
		}
		return result;

	}

	public static int[] ArrayFromInt(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;

		return array;
	}

	public static boolean FindElement(int[] array, int value) {

		/*
		 * int i = 5; if (array[i] == value) {
		 * 
		 * return true; } return false;
		 */
		
		for (int i=0; i<array.length; i++) {
		
			if (array [i]==value) {
				return true;
			}
		}
		
		return false;

	}
	
	public static int FindElementWithPosition (int []array, int value) {
		
		for (int i=0; i<array.length; i++) {
			
			if (array [i]== value) {
				return i;
			}
		}
		return -1;
	}
	
	public static int FindNumbersOfValueInArray (int [] array, int value) {
		
		int result = 0;
		for (int i=0; i<array.length; i++)
		{
			if (array [i]==value)
			{
				result ++;	// result = result +1;	
			}
		}
	
		return result;
		
	}
	public static void main(String[] args) {
		
		int[]array = {2,4,2,4,2,3};
		for (int i=0; i<10; i++) {
			int answer = FindNumbersOfValueInArray (array, i);
			System.out.println (i + " " + answer);
			
		}
		
		/*
		 * int [] array = {2,4,6,8}; for (int i=0; i<10; i++) { int answer =
		 * FindElementWithPosition (array,i); System.out.println (i + " index " +
		 * answer); }
		 */
		
		/*
		 * int []array = {1,2,3,4,5}; boolean found = FindElement (array, 8);
		 * System.out.println (found);
		 */

		/*
		 * int[] answer = ArrayFromInt (1,2,3);
		 * 
		 * for (int i=0; i<answer.length; i++) { System.out.println (answer[i]); }
		 */

		/*
		 * int[] number = { 1, 2, 3, 4, 5, 6 }; int answer = AddArray(number);
		 * System.out.println(answer);
		 */
		
		

	}

}
