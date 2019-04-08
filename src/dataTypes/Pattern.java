package dataTypes;

public class Pattern {

	public static void PatternWithForLoop() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void PatternBox() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void PetternEmptyBox() {

		int max = 8;

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {

				if (i == 0 || i == max - 1) {
					System.out.print("* ");
				} else if (j == 0 || j == max - 1) {
					System.out.print("* ");
				} else {

					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

	public static void PatternXBox () {
		
		int max = 8;

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {

				if (i == 0 || i == max - 1) {
					System.out.print("* ");
				} else if (j == 0 || j == max - 1) {
					System.out.print("* ");
				} else {
					
					if (i== max/2 && j== max/2) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
						

					
				}

			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		PatternWithForLoop();
		PatternBox();
		PetternEmptyBox();
		PatternXBox () ;

	}

}
