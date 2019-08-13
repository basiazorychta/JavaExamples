
public class NumberConversionNormal {

	public static String UnderTen(int value) {

		String num = "";
		switch (value) {

		case 1:
			num = "one";
			break;
		case 2:
			num = "two";
			break;
		case 3:
			num = "three";
			break;
		case 4:
			num = "four";
			break;
		case 5:
			num = "five";
			break;
		case 6:
			num = "six";
			break;
		case 7:
			num = "seven";
			break;
		case 8:
			num = "eight";
			break;
		case 9:
			num = "nine";
			break;
		case 10:
			num = "ten";
			break;

		}

		return num;

	}

	public static String UnderTwenty(int value) {

		String num = "";
		switch (value) {

		case 1:
			num = "eleven";
			break;
		case 2:
			num = "twelve";
			break;
		case 3:
			num = "thirteen";
			break;
		case 4:
			num = "fourteen";
			break;
		case 5:
			num = "fifteen";
			break;
		case 6:
			num = "sixteen";
			break;
		case 7:
			num = "seventeen";
			break;
		case 8:
			num = "eighteen";
			break;
		case 9:
			num = "nineteen";
			break;

		}

		return num;
	}

	public static String UnderHundred(int value) {

		String num = "";
		switch (value) {

		case 2:
			num = "twenty";
			break;
		case 3:
			num = "thirty";
			break;
		case 4:
			num = "forty";
			break;
		case 5:
			num = "fifty";
			break;
		case 6:
			num = "sixty";
			break;
		case 7:
			num = "seventy";
			break;
		case 8:
			num = "eighty";
			break;
		case 9:
			num = "ninety";
			break;

		}

		return num;
	}

	public static String UnderThousand(int value) {

		String num = "";
		switch (value) {

		case 1:
			num = "one hundred";
			break;
		case 2:
			num = "two hundred";
			break;
		case 3:
			num = "three hundred";
			break;
		case 4:
			num = "four hundred";
			break;
		case 5:
			num = "five hundred";
			break;
		case 6:
			num = "six hundred";
			break;
		case 7:
			num = "seven hundred";
			break;
		case 8:
			num = "eight hundred";
			break;
		case 9:
			num = "nine hundred";
			break;

		}

		return num;

	}

	public static String UnderTenThousand(int value) {

		String num = "";
		switch (value) {

		case 1:
			num = "one tousand";
			break;
		case 2:
			num = "two tousand";
			break;
		case 3:
			num = "three tousand";
			break;
		case 4:
			num = "four tousand";
			break;
		case 5:
			num = "five tousand";
			break;
		case 6:
			num = "six tousand";
			break;
		case 7:
			num = "seven tousand";
			break;
		case 8:
			num = "eight tousand";
			break;
		case 9:
			num = "nine tousand";
			break;
		case 10:
			num = "ten tousand";
			break;

		}

		return num;

	}

	public static String UnderHundredThousand(int value) {

		String num = "";
		switch (value) {

		case 2:
			num = "twenty";
			break;
		case 3:
			num = "thirty";
			break;
		case 4:
			num = "forty";
			break;
		case 5:
			num = "fifty";
			break;
		case 6:
			num = "sixty";
			break;
		case 7:
			num = "seventy";
			break;
		case 8:
			num = "eighty";
			break;
		case 9:
			num = "ninety";
			break;

		}

		return num;
	}

	public static void Engine(int value) {

		int original = value;

		String result = "";

		if (value == 0) {
			result = "zero";

		} else if (value == 100000) {
			result = "one hundred of thousand";

		} else {

			if (value >= 10000 && value <= 100000) {

				int number = value / 10000;

				result = result + " " + UnderHundredThousand(number);

				value = value % 10000;
			}

			if (value >= 1000 && value <= 10000) {

				int number = value / 1000;

				result = result + " " + UnderTenThousand(number);

				value = value % 1000;
			}

			if (value >= 100 && value <= 1000) {

				int number = value / 100;

				result = result + " " + UnderThousand(number);

				value = value % 100;

			}

			if (value >= 20 && value <= 100) {

				int number = value / 10;

				result = result + " " + UnderHundred(number);

				value = value % 10;
			}

			if (value >= 10 && value <= 20) {

				result = result + " " + UnderTwenty(value);

			}

			if (value > 0 && value <= 10) {

				result = result + " " + UnderTen(value);

			}
		}

		System.out.println(original + " - " + result);
	}

	public static void main(String[] args) {

		Engine(93578);

		/*
		 * for (int i=1; i<100000; i++) { Engine (i); }
		 */

	}

}
