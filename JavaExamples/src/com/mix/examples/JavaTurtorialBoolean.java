package com.mix.examples;

public class JavaTurtorialBoolean {

	public static void main(String[] args) {
		
		
		int a = 0;
		boolean b = (a==2);
		boolean c = true;
		
//		System.out.println (b);
//		System.out.println (c);
		
//		if (true) {
//			System.out.println("It's June 26th. Pakistan should win match with New Zealand");
//			
//		}
		
		boolean passedDoor = true;
		boolean missedDoor = false;
		boolean passedAllDoors = false;
		int doorCount = 0;
		
		if (passedDoor) {
			System.out.println ("We passed the first door");
			doorCount = doorCount + 1;
		}
		if (passedDoor) {
			System.out.println ("We passed the second door");
			doorCount = doorCount + 1;
		}
		if (passedDoor) {
			System.out.println ("We passed the third door");
			doorCount = doorCount + 1;
		}
		if (doorCount ==3) {
			passedAllDoors = true;
		}
		if (passedAllDoors) {
			System.out.println ("Congratulations!");
		}
		}
		

	}


