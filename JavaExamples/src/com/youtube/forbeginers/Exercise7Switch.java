package com.youtube.forbeginers;

public class Exercise7Switch {

	public static void Switch1() {
		
		int score = 260;
		
		switch (score) {
		
	
		case 260:
			System.out.println ("Very good!. You are the first");
			break;
		case 190:
			System.out.println ("Good");
			break;
		case 150:
				System.out.println ("I hope it is enough");
				break;
		case 100:
				System.out.println ("Not enought to win");
				break;
		default :
			System.out.println ("The grades are not defined");
			break;
		}
 
	}

	public static void main(String[] args) {
		Switch1();

	}

}
