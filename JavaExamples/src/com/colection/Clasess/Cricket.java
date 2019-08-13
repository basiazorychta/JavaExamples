package com.colection.Clasess;

class Cricket extends Insect {
	
	private double length;
	
	Cricket (int age, int numberOfLegs, double length) {
		
		super (age, numberOfLegs);
		
		this.length = length;
	}
	public void says () {
		System.out.println("Cricket is " + age + " years old. Has : " + numberOfLegs 
				+ " and " + length + "cm length");
		System.out.println("says: CHIRP");
	}
	public void jump () {
		System.out.println("A cricket jumped!");
	}

}
