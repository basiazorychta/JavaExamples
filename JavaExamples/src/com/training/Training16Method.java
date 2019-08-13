package com.training;

import java.util.Scanner;

public class Training16Method {

	public static void radius () {
		
		Scanner scan = new Scanner (System.in);
		System.out.println ("Enter circus radius");
		double radius = scan.nextDouble ();
		
		double circ = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.printf("Circumfrence : %f Area %f\n",circ , area);
		System.out.println ("Circ : " + circ + "\nArea : " + area);
		
	}
	
	public static void main(String[] args) {
		radius ();

	}

}
