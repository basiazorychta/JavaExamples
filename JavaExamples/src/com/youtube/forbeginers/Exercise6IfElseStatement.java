package com.youtube.forbeginers;

public class Exercise6IfElseStatement {

	public static void IfElse1() {

		int x = 10;

		if (x == 10) {
			System.out.println("x is == 10");
		}
	}

	public static void IfElse2() {

		int x = 20;

		if (x != 10) {
			System.out.println("x is : 20 so it is not equal to 10");
		} else {
			System.out.println("x is != 20");
		}
	}

	public static void LogicOp1() {

		int x = 20;
		int y = 60;

		if (x >= 10 || y < 30 ) {
			System.out.println("print - condition is true");
		} else if (x == 20 && y !=60){
			System.out.println("will not print it if one is not true");
		}
	}

	public static void main(String[] args) {
		// IfElse1();
		// IfElse2 ();
		LogicOp1();

	}

}
