package com.mix.examples;

public class Declatarion {

	public static void Declaration() {

		int i1 = 2, i2 = 5, i3 = -3;
		double d1 = 2.0, d2 = 5.0, d3 = -2.0;

		int resulti = i1 + (i2 * i3);
		System.out.println("Result is: " + resulti);

		resulti = i1 * (i2 + i3);
		System.out.println("Result is: " + resulti);

		resulti = i1 / (i2 + i3);
		System.out.println("Result is: " + resulti);

		resulti = i1 / i2 + i3;
		System.out.println("Result is: " + resulti);

		resulti = 3 + 4 + 5 / 3;
		System.out.println("Result is: " + resulti);

		resulti = (3 + 4 + 5) / 3;
		System.out.println("Result is: " + resulti);

		double resultd = d1 + (d2 * d3);
		System.out.println("Result is: " + resultd);

		resultd = d1 + d2 * d3;
		System.out.println("Result is: " + resultd);

		resultd = d1 / d2 - d3;
		System.out.println("Result is: " + resultd);

		resultd = d1 / (d2 - d3);
		System.out.println("Result is: " + resultd);

		resultd = d1 + d2 + d3 / 3;
		System.out.println("Result is: " + resultd);

		resultd = (d1 + d2 + d3) / 3;
		System.out.println("Result is: " + resultd);

		resultd = d1 + d2 + (d3 / 3);
		System.out.println("Result is: " + resultd);

		resultd = 3 * (d1 + d2) * (d1 - d3);
		System.out.println("Result is: " + resultd);

	}

	public static void main(String[] args) {

		Declaration();

	}

}
