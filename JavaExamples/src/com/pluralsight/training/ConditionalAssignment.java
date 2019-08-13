package com.pluralsight.training;

public class ConditionalAssignment {

	public static void main(String[] args) {

		// 6 - Conditional Assignment

		// result = condition? true - value : false - value;

		int v1 = 7;
		int v2 = 5;

		int vMax = v1 > v2 ? v1 : v2;

		System.out.println(vMax);

		System.out.println();

		float rooms = 4;
		float students = 30;

		float studentsPerRoom = rooms == 0.0f ? 0.0f : students / rooms;

		System.out.println(studentsPerRoom);

	}

}
