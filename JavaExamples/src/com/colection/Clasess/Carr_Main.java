package com.colection.Clasess;

public class Carr_Main {

	public static void printCarr (String info) {
		System.out.println(info);
	}
	
	public static void main(String[] args) {
		
		Carr c1 = new Carr ("Mercedes", "Silver", 2010, 5, 10, 230, 270000);
		
		printCarr (c1.info());
		System.out.println("\n");
		
		c1.increaseSpeed(420);
		printCarr (c1.info());
		System.out.println("\n");
		c1.decreaseSpeed(5);
		printCarr (c1.info());
		System.out.println("\n");
		c1.turnLeft();
		c1.engineStart();
		
		

	}

}
