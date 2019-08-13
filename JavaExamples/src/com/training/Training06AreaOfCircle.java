package com.training;

public class Training06AreaOfCircle {

	/**
	 * Write a program to calculate area of circle. User should enter the radius of a circle. 
	 * Formula to calculate area of a circle if radius is given: 
	 * A = Pi x radius x radius 
	 * 
	 * value of pi is 3.1415 
	 * 
	 * Program must use constant if required
	 * 
	 */
	
	public static final double PI = 3.1415;
	
	public static double radius (double radius) {
		
		double pi = PI;
		
		double area = PI * radius * radius;
		return area;
		
	}
	public static void main(String[] args) {
		
		double result = radius (10);
		System.out.println ("Area of circle with = " + result);

	}

}
