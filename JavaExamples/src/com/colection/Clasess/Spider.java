package com.colection.Clasess;

class Spider extends Insect{

	private boolean isPoisonous;
	
	Spider (int age, int numberOfLegs, boolean isPoisonous) {
		
		super (age, numberOfLegs);
		this.isPoisonous = isPoisonous;
		
		
	}
	
	public void says () {
		
		System.out.println("Spider is " + age + " years old. Has : " + numberOfLegs 
				+ " and " + isPoisonous + " about poisonous");
		System.out.println("Spider says: HISSSS");
	}
}
