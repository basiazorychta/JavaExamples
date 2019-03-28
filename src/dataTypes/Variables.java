package dataTypes;

public class Variables {

	/*
	 * 
	 * */

	public static void MyFirstMethod() {

		System.out.println("Hello World!!!!");
	}

	/**
	 * String - always in double quotes. Strings in java are characters grouped
	 * together. if we want to print double quote in String we need to use: \ before
	 * first double quote character and at the end  "\"....\""
	 * "\n" - will print our String in new line 
	 * "\t" - will give us extra space (like with Tab)
	 * if we want to print backslash we need to add \\"
	 */
	public static void StringMethod() {
		String sentence = "We can print whatever we want!";
		System.out.println("\n" + sentence);

		System.out.println("My ______ is to become a _____. My great husband ______ who is teaching me is my Mentor!");
		String firstword = "goal";
		String allsentence = "great java programmer";
		String name = "Abid";

		System.out.println("My " + firstword + " is to become a " + allsentence + ". " + "My handsome husband " + name
				+ " who is teaching me is my Mentor!");

		System.out.println("\n" + "\"My husband is my friend\"");
		System.out.println("\n" + "backslash: \\");
		System.out.println ("Save my files in c:\\toy directory");

	}

	public static void ScapeCharacter() {

		/*
		 * Character are always written in single quote
		 */

		char a = '*';
		char b = 'z';
		char c = '/';

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("\n" + "Special characters which we want to print: " + "\n" + "\\" + "\n" + "\" ... \"");

	}

	public static void FunnyScapeCharacter () {
		/*
		 * \n = \r
		 * \t
		 * \"
		 * \b
		 * \r = \n
		 * \f
		 * \'
		 * \"
		 * \\
		 */
		 
		System.out.println ("Please copy my files from c:\notes directory to desktop");
		System.out.println ("Save my files in c:\toy directory");
		System.out.println ("My name is Basia and I am \"awesome\" developer");
		System.out.println ("My files in c:\book");
		System.out.println ("files in c:\radio");
		System.out.println ("files in c:\favourite");
		System.out.println ("files in c:\'");
		System.out.println ("files in c:\"");
		System.out.println ("files in c:\\");
		
	}
	
	public static void Integer() {

		/*
		 * integer can be only whole number!
		 */

		int a = 5;
		int b = 2;
		int c = 9999;
		int d = -9;
		int result = b * (c + a - d);
		int ans = a % b;

		System.out.println(a + c);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(result);
		System.out.println(ans);

		// because int can be only whole numbers we will not receive anything after
		// whole numb

	}

	public static void FloatDoubleLong() {

		/*
		 * https://cs.fit.edu/~ryan/java/language/java-data.html
		 */

		int a = 4;
		long b = 999999L;
		float c = 2.5F;
		double d = 67875.56;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a + b + c + d);

	}

	public static void BooleanInJava() {

		/*
		 * boolean in java can ONLY be true or false 
		 * Comparison Operation : 
		 * == is equal to
		 * != is not equal to
		 * <= is less than or equal to, < is less than
		 * >= is greater or equal to, > is greater to
		 */

		int a = 0;  
		int b = 5;
		boolean c = false;
		boolean d = (a == b); // boolean c = false
		boolean e = (a <= b); // boolean e = (a<b);
		boolean f = (a >= b); // boolean f = (a>b);
		boolean g = (a != b);

		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		

		/*
		 * Mostly boolean in Java is for "If statement" 
		 */

		if (true) {
			System.out.println("Because if statement is true, method will be printed");
		}
		if (a==0) {
			System.out.println ("a is equal to 0");
		}
		
		// a = 10;
		if (a!=0) {
			System.out.println ("a is not equal to 0");
		}

		boolean goodWeather = true;
		boolean warmClothes = true;
		boolean badWeather = false;
		boolean badClothes = false;

		if (goodWeather) {
			System.out.println("Go for a walk");
		}
		if (badWeather) {
			System.out.println("Stay home");
		}
		if (goodWeather) {
			System.out.println("I hope it is warm");
		}

		/*
		 * in boolean we are using also:
		 * && - AND and 
		 * || - OR
		 */

		if (goodWeather || warmClothes) {
			System.out.println("Go for a walk");
		}
		if (goodWeather && badClothes) {
			System.out.println("Stay home");
		}
		if (a==0 || a==3) {
			System.out.println ("a is equal to "+ a);
		}
		if (b>1 && b< 400) {
			System.out.println ("b is in the range " + "\"b\" = " + b);
		}

	}

	public static void main(String[] args) {

		// MyFirstMethod();
		StringMethod();
		// ScapeCharacter ();
		// Integer();
		// FloatDoubleLong ();
		//BooleanInJava();
		//FunnyScapeCharacter ();

	}

}
