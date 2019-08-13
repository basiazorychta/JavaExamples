package com.colection.Clasess;

class Insect {
	
	public int age;
	public int numberOfLegs;
	
	Insect (int age, int numberOfLegs) {
		
		this.age = age;
		this.numberOfLegs = numberOfLegs;
	
	}

	public void says() {
		System.out.println("Insects are mostly: " + age + " years old" + 
				" and they have min : " + numberOfLegs + " legs.");
		
	}
	
	public void crawl() {
		System.out.println("The insect crowled");
		
	}

	
 
}
