package com.youtube.forbeginers;

public class Exercise8String {

	public static void String1 () {
		
		String sentence = "I love my husband very much!";
		int sentenceLength = sentence.length();
		String sentenceToLowerCase = sentence.toLowerCase();
		String sentenceToUpperCase = sentence.toUpperCase();
		
		System.out.println (sentence);
		System.out.println (" -------------- ");
		System.out.println (sentenceLength);
		System.out.println (" -------------- ");
		System.out.println (sentenceToLowerCase);
		System.out.println (" -------------- ");
		System.out.println (sentenceToUpperCase);
		System.out.println (" -------------- ");
		System.out.println (sentence.indexOf('h'));
		
	}
	public static void main(String[] args) {
		String1 ();


	}

}
