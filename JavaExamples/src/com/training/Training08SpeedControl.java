package com.training;

public class Training08SpeedControl {

	/**
	 * Write a program to control a vehicle(car, truck) speed system. 
	 * System should perform following task.
	 * 
	 * Program has already set a speed limit in it const int SPEED_LIMIT = 80
	 * 
	 * If a vehicle drives with speed till 80 km/h then system should display a message:
	 *  "Nice and pleasant driving"
	 *  
	 * If vehicle is driving more than 80 but under 100 km/h then system should display a message:
	 *  "You are driving fast, you are fined 500 Rupees"
	 *  
	 *  If vehicle is driving 100 or more but under 120 km/h then system should display a message:
	 *   "Your driving can injured you and others, you are fined 1000 Rupees" 
	 *   
	 *   but if vehicle is driving 120 or more, system should display a message:
	 *    "Hand over your driving licence! you are not allowed to drive on road."
	 * 
	 */
	
	public static final int SPEEDLIMIT = 80;
	public static final int FIRSTFINES = 500;
	public static final int SECONDFINES = 1000;
	
	public static int speedcontrol ( int speed) {
		
		
		if (speed <= 80) {
			System.out.println ("Nice and pleasant driving");
		} else if (speed > 80 && speed < 100){
			System.out.println ("You are driving fast, you are fined: " + FIRSTFINES + " Rupees.");
		} else if (speed >= 100 && speed < 120) {
			System.out.println ("Your driving can injured you and others, you are fined: "
								+ SECONDFINES + " Rupees.");
		}else {
			System.out.println ("Hand over your driving licence! you are not allowed to drive on road!");
		}
		return speed;
	}
	
	public static void main(String[] args) {
		
		int speed = speedcontrol (100);
		System.out.println (speed);

	}

}
