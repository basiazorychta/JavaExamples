package com.colection.Clasess;

public class Aircraft_Main {
	
	
	public static Aircraft createAircraft (String name, int passenger, int cruiseSpeed, 
			double fuelCapacity, double fuelBurnRate) {
		
		Aircraft aircraft = new Aircraft (name, passenger, cruiseSpeed, fuelCapacity, fuelBurnRate );
		
		return aircraft;
	
		
	}
	
	public static void printAircraft (Aircraft aircraft) {
		
		System.out.println("Name of Aircraft is: " + aircraft.name);
		
		System.out.println(aircraft.name + " has : " + aircraft.wings + " wings");
		
		System.out.println (aircraft.name + " Endurance is : " + aircraft.otherWayToCalculateEndurance() + " hours");
		
		System.out.println("\n" + aircraft.name + " to fly for 2.5 hours it takes : " 
				+ aircraft.fuelNeeded(2.5) + " gallons of fuel.");
		
	}
	public static void main(String[] args) {
	
		Aircraft cessna172 = createAircraft ("cessna172", 4, 140, 56.5, 9.5);
		
		Aircraft.wings = 2;
		
		
		printAircraft(cessna172);
		
		Aircraft piperSaratoga = createAircraft ("piperSaratoga", 6, 201, 102.5, 20.5);
		
		printAircraft(piperSaratoga);
		
		
	/*
	Aircraft cessna172 = new Aircraft("cessna172", 4, 140, 56.5, 9.5);
	Aircraft piperSaratoga = new Aircraft ("piperSaratoga", 6, 201, 102.5, 20.5);
	
	cessna172.passengers = 4;
	cessna172.cruiseSpeed = 140;
	cessna172.fuelCapacity = 56.5;
	cessna172.fuelBurnRate = 9.5;
	
	piperSaratoga.passengers = 6;
	piperSaratoga.cruiseSpeed = 201;
	piperSaratoga.fuelCapacity = 102.5;
	piperSaratoga.fuelBurnRate = 20.5;
	
	
	System.out.println(cessna172.name);
	cessna172.calculateEndurance();
	
	System.out.println("\nCessna 172 Endurance2 is : " + cessna172.otherWayToCalculateEndurance() + " hours");
	System.out.println("************* \nCessna 172 to fly for 2.5 hours it takes : " 
				+ cessna172.fuelNeeded(2.5) + " gallons of fuel\n*************");
	
	cessna172.setPassengers(6);
	
	System.out.println("\n" + piperSaratoga.name);
	piperSaratoga.calculateEndurance();
	
	System.out.println("\nPiper Saragota Endurance2 is : " + piperSaratoga.otherWayToCalculateEndurance() + " hours");
	
	double enduranceSaratoga = piperSaratoga.otherWayToCalculateEndurance();
	System.out.println("\nPiper Saragota Endurance2 is : " + enduranceSaratoga + " hours");
	
	System.out.println("************** \nPiperSaratoga to fly for 2.5 hours it takes : " 
				+ piperSaratoga.fuelNeeded(2.5) + " gallons of fuel\n**************");
	
	Aircraft.wings = 4;
	System.out.println("***********\nAll of my aircraft have : " +Aircraft.wings + " wings. \n***********");
	System.out.println(cessna172.wings);
	System.out.println(piperSaratoga.wings);
	*/
	
	
	

	}
}
