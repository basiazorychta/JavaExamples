package com.pluralsight.training;

public class MyClass {

	public static void showSum (float x, float y, int count) {
		
		
		float sum = x + y;
		
		for (int i = 0; i < count; i++) {
			System.out.println (sum);
			return;
		}
		
		if (count < 1) {
			return;
	}
	}
	
	public static void main(String[] args) {
		
		
		showSum(7.5f, 1.4f, 3);
	}
}
