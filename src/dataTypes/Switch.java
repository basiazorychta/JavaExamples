package dataTypes;

public class Switch {

	public static void SwitchExemple(int month) {

		switch (month) {

		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Default" + "Calendar has only 12 month");

		}

	}

	public static void IsVowel(char ch) {

		switch (ch) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is vowel");
			break;
		default:
			System.out.println("Invalid");

		}
	}

	public static boolean IsVowel2(char ch) {

		switch (ch) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;

		default:
			return false;

		}
	}

	public static void Calculator(char operator, double a, double b) {

		double result = 0;

		switch (operator) {

		case '+': {

			result = a + b;
			System.out.println("Addition result: " + result);

		}
			break;
		case '-': {

			result = a - b;
			System.out.println("Substraction result: " + result);
		}

			break;
		case '*': {

			result = a * b;
			System.out.println("Multiplication result: " + result);

		}
			break;
		case '/': {

			result = a / b;
			System.out.println("Division result: " + result);
		}
			break;
		default:
			System.out.println("This Operator is not impleminted - yet.");

		}

	}

	public static void main(String[] args) {

		// SwitchExemple(3);
		// IsVowel ('i');
		// System.out.println (IsVowel2 ('k'));
		Calculator('%', 19.0, 9.0);

	}

}
