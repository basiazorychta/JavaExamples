package com.mix.examples;

public class WhileTest {

	public static void WhileTest() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
			
			if (i == 5) {
				break;

			}

		}
	}

	public static void ForLoopTest() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}
	}

	public static void main(String[] args) {
		WhileTest();
		// ForLoopTest();

	}

}
