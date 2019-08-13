package com.training;

import java.util.ArrayList;
import java.util.Arrays;

public class Training13ArrayMore {

	public static void printIntArray (int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println (arr[i]);
		}
	}
	
	public static void printStringArray (String [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println (arr[i]);
		}
	}
	
	/**1. Write a Java program to sort a numeric array and a string array.
	 * */
	
	public static void sortArray () {
		
		int [] numeric = {1,3,5,7,3,4,98,76,47,44,345,8,4567,65,44,323,66,4};
		
		Arrays.sort(numeric);
		printIntArray (numeric);
		
		System.out.println ("\n");
		
		String []name = {"blue", "pink", "red", "green", "gray", "white", "black"};
		
		Arrays.sort(name);
		printStringArray(name);
 	}
	
	/** 2. Write a Java program to sum values of an array. 
	 */
	
	public static void valueOfArray () {
		
		int [] array = {2,3,1};
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
			
			System.out.println (sum);
		}
		
	}
	
	/**3. Write a Java program to print the following grid.

	Expected Output :

	- - - - - - - - - -                                                                                           
	- - - - - - - - - -                                                                                           
	- - - - - - - - - -                                                                                           
	- - - - - - - - - -                                                                                           
	- - - - - - - - - -                                                                                           
	- - - - - - - - - -                                                                                           
	- - - - - - - - - -                                                                                           
	- - - - - - - - - -                                                                                           
	- - - - - - - - - -                                                                                           
	- - - - - - - - - -  
	*/
	
	public static void gridArray () {
		
		int [][] grid = new int [10][10];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
				System.out.printf (" %d " , grid [i][j]);
			}
			System.out.println ();
		}
	}
	
	/**4. Write a Java program to calculate the average value of array elements.
	*/
	
	public static void avarageValue () {
		
		int [] array = {4,6,1,1};
		int sum = 0;
		double average = 0;
		
		for (int i = 0; i< array.length; i++) {
			sum = array [i]+ sum;
		}
			average = sum / array.length;
			System.out.println (" sum " + sum + " avarage " + average);
		
	}
	
	/** 5. Write a Java program to test if an array contains a specific value.
	 */

	public static boolean isspecificValue ( int [] array, int value) {
		
		boolean result = true;
		
	
		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				return true;
			}
		}
		return false;
		
	}
	
	/** 6. Write a Java program to find the index of an array element.
	*/
	
	public static int indexOfArray (int [] index, int array) {
		
		int answer = 0;
		
		for (int i = 0; i < index.length; i++) {
			if (array == index [i]) {
				return i;
				
			}
		}
		return answer;
	}
	
	/**7. Write a Java program to remove a specific element from an array.
	*/
	
	public static void removeElementArray () {
		
		int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println (Arrays.toString(array));
		
		System.out.println (array.length);
		
		int removeIndex = 11;
		
		for (int i = removeIndex; i < array.length - 1; i++) {
			array [i] = array [i + 1];
		}
			System.out.println ("After removing 11 index: " + Arrays.toString(array));
		}
	
	
	
	/** 8. Write a Java program to copy an array by iterating the array
	*/
	
	public static void copyAnArray () {
		
		int[] array = {2, 5, 7, 98, 67};
		
		int [] array_copy = new int [5];
		
		array_copy = array;
		
		for (int i = 0; i < array.length; i++) {
				System.out.println ( array [i]);
			}
		System.out.println ("\n");
		for (int i = 0; i < array_copy.length; i++) {
			System.out.println ( array_copy [i]);
		}
		
		/* for (int i = 0; i < array.length; i++){
		 * array_copy [i] = array;
		 * other way.
		 */
		
	}
	public static void copyArray () {
		
			
			int[] array = {2, 5, 7, 98, 67};
			
			int [] array_copy = new int [5];
			
			array_copy = array;
			
			for (int i = 0; i < array.length; i++) {
				array_copy [i] = array [i];
			
				System.out.println (array [i]);
			}
			
			array [2] = 200;
			
			
			System.out.println ("\n");
			for (int i = 0; i < array_copy.length; i++) {
				System.out.println (array_copy [i]);
			}
			
	}
	
	/**10. Write a Java program to find the maximum and minimum value of an array.
	 */
	
	public static int findMax (int [] value) {
	
		int max = value[0];

		for (int i = 0; i < value.length; i++) {
			if (value[i] > max) {
				max = value[i];
			}
		}

		return max;

	}
	
	public static int findMin (int[] value) {
		
		int min = value[0];

		for (int i = 0; i < value.length; i++) {
			if (value[i] < min) {
				min = value[i];
			}
		}

		return min;
	}
	
	/**11. Write a Java program to reverse an array of integer values.
	*/
	
	public static void reversePrint ( int [] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print (array [i] + " ");
		}
		System.out.println ("\n");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print ( array [i] + " ");
		}
	}
	
	public static int [] reverse ( int [] original) {
		
		int [] reverse = new int [original.length];
		
		for (int i = 0; i < original.length; i++) {
		}
		for ( int i = original.length -1, j=0; i >= 0; i--, j++) {
			reverse [j] = original [i]; 
	
		}
		return reverse;
	}
	
	/** 12. Write a Java program to reverse an array of integer values.
	 */
	
	public static void duplicateValue () {
		
		int [] value = {2, 5, 4, 8, 5, 4, 87};
		
		for ( int i = 0; i < value.length; i++) {
			for (int j = i+1; j< value.length; j++) {
				if ((value [i] == value [j])) {
					System.out.println (value[j]);
				}
			}
		}	
	}
	
	/**13. Write a Java program to find the common elements between two arrays of integers.
	 */
	
	public static void commonElements () {
		
		int [] array_1 = {0, 5, 3, 6, 38, 987};
		int [] array_2 = {8, 67, 3, 876, 38, 2};
		
		System.out.println ("Elements of array_1: " + Arrays.toString(array_1));
		System.out.println ("Elements of array_1: " + Arrays.toString(array_2));
		
		for (int i = 0; i < array_1.length; i++) {
			for ( int j = 0; j < array_2.length; j++) {
				if ( array_1 [i] == array_2[j]) {
					System.out.println ("Common element : " + array_1 [i]);
				}
			}
		}
	}
	
	/** 20. Write a Java program to convert an array to ArrayList.
	 * */
	
	 public static void convertArrayToArrayList () {
		 
		 String [] myList = new String [] {"Summer", "Winter", "Autum", "Spring"}; 
		 
		 System.out.println (Arrays.toString(myList));
		 
		 ArrayList <String> list = new ArrayList <String> (Arrays.asList(myList));
		 
		 System.out.println (list);
	 }
	 
	 /**21. Write a Java program to convert an ArrayList to an array.
	 */
	 
	 public static void convertArrayListToArray () {
		 
		 ArrayList <String> list = new ArrayList <String> ();
		 
		 list.add("Summer");
		 list.add("Winter");
		 list.add("Star");
		 list.add("Spring");
		 
		 String [] new_list = new String [list.size()];
		 list.toArray(new_list);
		 
		 for (String string : new_list) {
			 System.out.println (string);
		 }
		 
		 
	 }
	/** Write a program to compare to arrays
	 * 
	 */
	 
	 public static void compareTwoArray () {
		 
		 int [] first_array = {1, 3, 5, 7};
		 int [] second_array = {1, 3, 5, 7};
		 
		 boolean isEqual = Arrays.equals(first_array, second_array);
		 
		 if ( isEqual) {
			 System.out.print (Arrays.toString(first_array)+ " first array \n" + 
					 		  Arrays.toString(second_array) + " and second array \n are equal");
		 }
		 else {
			 System.out.print (Arrays.toString(first_array) + " first array \n" +
					 		  Arrays.toString(second_array) + " and second array \n are not equal");
		 }
		 

	 }
	/** 14. Write a Java program to find the second largest element in an array.
	 */
	public static void secondMax () {
		
		int [] value = {234, 567, 433, 66666, 8765, 9877};
		
		
		System.out.println (Arrays.toString (value));
		Arrays.sort (value);
		System.out.println (Arrays.toString (value));
		System.out.println (value.length);
		
		if (value.length > 1) {
		System.out.println (value [value.length -2]);
	
		}
		}
	
	
	public static void main(String[] args) {
		
		//compareTwoArray ();
		
		//convertArrayListToArray ();
		
		//convertArrayToArrayList ();
		
		//secondMax ();
		 
		
		// commonElements ();
		
		 //duplicateValue ();

		// removeElementArray ();
		
		/**int [] array = {234, 567, 433, 66666, 8765, 9877};
		
	        System.out.println ("Old Array");
	        for (int i = 0; i < array.length; i++) {
	            System.out.println (array [i]);
	        }

	        int[] newarray = reverse(array);
	        System.out.println ("New Array");
	        for (int i = 0; i < newarray.length; i++) {
	            System.out.println (newarray [i]);
	        }
	        */
		//reverse (arr);
		//reversePrint (arr);
		
		
		/** int [] arr = {234, 567, 433, 66666, 8765, 9877};
		System.out.println (findMax (arr));
		System.out.println (findMin (arr));
		*/
		
		// copyArray ();
		
		// copyAnArray ();
		
		//removeElementArray ();
		
		/**int [] arr = {234, 567, 433, 66666, 8765, 9877};
		int number = 433;
		System.out.println (indexOfArray (arr, 66666));
		System.out.println (indexOfArray (arr, 433));
		*/
		
		/** int [] arr = {234, 567, 433, 66666, 8765, 9877};
		int number = 433;
		
		boolean answer = isspecificValue (arr, number);
		System.out.println (isspecificValue (arr, 433));
		System.out.println (isspecificValue (arr, 0));
		*/
		
		//avarageValue();
		
		gridArray ();
		
		//valueOfArray ();
		
		// int [] arr = {1,3,5,7,3,4,98,76,47,44,345,8,4567};
		//printIntArray (arr);
		
		/**String [] arr = {"blue", "pink", "mom", "red", "tulip", "sun", "flower"};
		printStringArray (arr);
		*/
		
		//sortArray ();
		
		/** System.out.println ("c:\notes directory to desktop");
		System.out.println ("c:\toy directory");
		System.out.println ("My name is Basia and I will be Test Engineer in coming days");
		*/
		
		

	}

}
