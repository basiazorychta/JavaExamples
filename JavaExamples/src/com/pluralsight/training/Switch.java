package com.pluralsight.training;

public class Switch {

	public static void main(String[] args) {

		int iVal = 25;

		switch (iVal % 2) {
		case 0:
			System.out.print(iVal);
			System.out.println(" is even ");
			break;
		case 1:
			System.out.print(iVal);
			System.out.println(" id odd ");
			break;
		default:
			System.out.println(" oops it broke");
			break;
		}

		// Array - Exercise 1 to Switch
		
				double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
				double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
				char[] opCodes = {'d', 'a', 's', 'm'};
				double [] results = new double [opCodes.length];
				
				for (int i = 0; i < opCodes.length; i++) {
					switch (opCodes [i]) {
					case 'a': 
					results[i] = leftVals[i] + rightVals[i];
					break;
					case 's':
					results [i]= leftVals [i] - rightVals [i];
					break;
					case 'd':
					results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals [i] : 0.0d;
					break;
					//rightVals [i] != 0.0d;
					//results [i] = leftVals [i] / rightVals [i];
					//results [i] = 0.0d;}
					case 'm':
					results [i]= leftVals [i] * rightVals [i];
					break;
				 default:
					System.out.println ("Error - invalid opCodes");
					results [i] = 0.0d;
					break;
				}
	}
				for (double theResult : results) {
				System.out.print ("result = ");
				System.out.println (theResult);
				}

		
		
	}

}
