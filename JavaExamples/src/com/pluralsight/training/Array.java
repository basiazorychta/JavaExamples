package com.pluralsight.training;

public class Array {

	public static void main(String[] args) {
		
		float[] theVals = new float [3];
		
		theVals [0] = 10.0f;  //float []theVals = {10.0f, 20.0f, 15.0f};
		theVals [1] = 20.0f;
		theVals [2] = 15.0f;
		
		float sum = 0.0f;
		for (int i = 0 ; i < theVals.length; i++) {
			sum += theVals[i];

		}
		System.out.println (sum);
		System.out.println ();
		
		
		
		// Array - Exercise 1
		
		double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
		double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
		char[] opCodes = {'d', 'a', 's', 'm'};
		double [] results = new double [opCodes.length];
		
		for (int i = 0; i < opCodes.length; i++) {
		if (opCodes [i] == 'a') { 
			results[i] = leftVals[i] + rightVals[i];
		}else if (opCodes [i] == 's') {
			results [i]= leftVals [i] - rightVals [i];
		}else if (opCodes [i] == 'd') {
			//result = val2 != 0.0d ?val1 / val2 : 0.0d;
			if (rightVals [i] != 0.0d) {
				results [i] = leftVals [i] / rightVals [i];
			}else {
				results [i] = 0.0d;}
		}else if (opCodes [i] == 'm') {
			results [i]= leftVals [i] * rightVals [i];
		}else {
			
			System.out.println ("Error - invalid opCodes");
			results [i] = 0.0d;
		}
		}
		for (double theResult : results) {
		System.out.print ("result = ");
		System.out.println (theResult);
		}

	}

}
