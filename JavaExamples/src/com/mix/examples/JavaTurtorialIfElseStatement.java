package com.mix.examples;
import java.util.Scanner;

public class JavaTurtorialIfElseStatement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Enter a grade: ");
		
		int n = scan.nextInt();
		System.out.println ("answer is: " + n);
		
		if (n >= 90 && n <= 100) {
			System.out.println ("A");
		} else if (n>=80 && n<90){
			System.out.println ("B");
		} else if (n>=70 && n<80){
			System.out.println ("C");
		} else if (n>=0 && n<70){
			System.out.println ("D");
		} else {
			System.out.println ("Give me a break! It's not in a range!");
		}
	

	}

}
