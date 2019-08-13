package com.training;

import java.util.Scanner;

public class Training05TimeConversion {

	/**
	 * Write a program which can take input from user in seconds. Your program should convert seconds into minutes and hours and seconds.
	 * 
	 * Example: 4000 seconds as input 
	 * 
	 * Output should be:
	 * 1 Hour and 6 minutes and 40 seconds 
	 * Your program must use const variable where required.
	 * 
	 * As you know that:
	 * 1 minute = 60 sec
	 * 1 hour = 60 minute
	 * 
	 */
	public static final int TIMEUP = 60;
	
	public static void time () {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter time in seconds: ");
		int timeinput = scan.nextInt();
		
		int sec = 0;
		int min = 0;
		int hour = 0;
		
		
		min = timeinput / TIMEUP;
		hour = min / TIMEUP;
		
		min = min % TIMEUP;
		sec = timeinput % TIMEUP;
		
		
		System.out.println (timeinput + " in sec. It is: " + hour + " hour" + " and " + min + " min " + sec + " sec");
		
	}
	
	public static void main(String[] args) {
		
		time ();

	}

}
