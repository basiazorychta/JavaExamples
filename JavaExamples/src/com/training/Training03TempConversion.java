package com.training;

public class Training03TempConversion {

	/**
	 * 1. Write a program to convert from Celcius to Farenheit ((0°C × 9/5) + 32 = ... F).
	 * 2. Write a program to convert from Celcius to Kelvin. (0°C + 273.15 = ... K)

	 * 3. Write a program to convert from Farenheit to Celcius. ((32°F − 32) × 5/9 = ....C)
	 * 4. Write a program to convert from Farenheit to Kelvin. ((0°F − 32) × 5/9 + 273.15 = ... K)

	 * 5. Write a program to convert from Kelvin to Celcius. (0K − 273.15 = ... C)
	 * 6. Write a program to convert from Kelvin to Farenheit. ((0K − 273.15) × 9/5 + 32 = ... F)
	 * 
	 */
	
	public static final double FARENHEIT = 32.0;
	public static final double KELVIN = 273.15;
	public static final double CELCIUSCONVERT = 1.8;
	public static final double FARENHEITCONVERT = 0.555555555;
	
	public static double celciusToFarenheit (double cel) {
		
		double farenheit = (cel * CELCIUSCONVERT) + FARENHEIT;
		
		System.out.println (cel + "'C - is the same as: " + farenheit + " ' Farenheit");
		
		return farenheit;
	}
	
	public static double celciusToKelvin (double cel) {
		
		double kelvin = cel + KELVIN;
		
		System.out.println (cel + "'C - is the same as: " + kelvin + " ' Kelvin");
		
		return kelvin;
	}
	
	public static double farenheitToCelcius (double far) {
		
		double celcius = ((far - FARENHEIT) * FARENHEITCONVERT);
		
		System.out.println (far + "'F - is the same as: " + celcius + " ' Celcius");
		
		return celcius;
	}
	
	public static double farenheitToKelvin (double far) {
		
		double kelvin = ((far - FARENHEIT) * FARENHEITCONVERT + KELVIN);
		
		System.out.println (far + "'F - is the same as: " + kelvin + " ' Kelvin");
		
		return kelvin;
	}
	
	public static double kelvinToCelcius (double kel) {
		
		double celcius = (kel - KELVIN);
		
		System.out.println (kel + "'K - is the same as: " + celcius + " ' Celcius");
		
		return celcius;
	}
	
	public static double kelvinToFarenheit (double kel) {
		
		double farenheit = ((kel - KELVIN) * CELCIUSCONVERT + FARENHEIT);
		
		System.out.println (kel + "'K - is the same as: " + farenheit + " ' Farenheit");
		
		return farenheit;
	}
	
	public static void main(String[] args) {
		
		
		/**for(int i = -50; i<200; i+=10) {
		celciusToKelvin(i);
		}
		*/
		
		double result = celciusToFarenheit (-7.0);
		result = celciusToKelvin (-7.0);
		result = farenheitToCelcius (-7.0);
		result = farenheitToKelvin (-7.0);
		result = kelvinToCelcius (-7.0);
		result = kelvinToFarenheit (-7.0);
		

	}

}
