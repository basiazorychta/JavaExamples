package com.colection.Clasess;

public class Aircraft {
	
	String name;
	private int passengers;    	// numbers of people
	int cruiseSpeed;			// miles per hours
	double fuelCapacity; 		//gallons
	double fuelBurnRate;  		// gallons per hours
	static int wings;
	
	Aircraft ( String n, int p, int cs, double fc, double fbr){
		
		this.name = n;
		this.passengers = p;
		this.cruiseSpeed = cs;
		this.fuelCapacity = fc;
		this.fuelBurnRate = fbr;
		
		
	}
	
	
	void calculateEndurance() {
		
		double endurance = this.fuelCapacity / this.fuelBurnRate;
		
		System.out.println("The endurance is: " + endurance + " hours.");
	}
	
	public double otherWayToCalculateEndurance() {
		
		double endurance2 = this.fuelCapacity / this.fuelBurnRate;
		
		return endurance2;
		
	}
	
	public double fuelNeeded (double time) {
		
		return this.fuelBurnRate * time;
		
	}
	
	void setPassengers (int p) {
		
		if ((p > 0) && (p<=10)) {
			passengers = p;
			System.out.println("Revised passengers count : " + passengers);
		}
		else {
			
			System.out.println("Error setting passengers");
		}
	}

}
