package com.time.classes;

import java.util.Calendar;

public class ClockMain {

	public static void printTime (String info) {
		System.out.println(info);
	}
	
	public static void main(String[] args) {
		
		Clock clock = new Clock (2, 33, 45);
		printTime (clock.info());
		
		clock.setTime(12, 05, 20);
		printTime (clock.info());
		printTime (clock.toString());
		
		clock.incrementMinutes();
		clock.incrementMinutes();
		printTime (clock.info());
		
		Clock c1 = new Clock (12, 07, 20);
		
		System.out.println(clock.equals(c1));
		
		System.out.println("\n");
		Calendar c2 = Calendar.getInstance();
		
		System.out.println("Current Time: " + c2.get(Calendar.HOUR_OF_DAY) 
									+ " : " + c2.get(Calendar.MINUTE)
									+ " : " + c2.get(Calendar.SECOND));
		
		c2.add(Calendar.HOUR, 1);
		c2.add(Calendar.MINUTE, 1);
		c2.add(Calendar.SECOND, 1);
		
		
		System.out.println("Time after 1hr, 1min and 1sec add: " + c2.get(Calendar.HOUR_OF_DAY) 
		+ " : " + c2.get(Calendar.MINUTE)
		+ " : " + c2.get(Calendar.SECOND));
		
		c2 = Calendar.getInstance();
		c2.add(Calendar.HOUR, -10);
		System.out.println("Time before 10hr: " + c2.get(Calendar.HOUR_OF_DAY) 
		+ " : " + c2.get(Calendar.MINUTE)
		+ " : " + c2.get(Calendar.SECOND));
				

	}

}
