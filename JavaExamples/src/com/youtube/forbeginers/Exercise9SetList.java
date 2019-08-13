package com.youtube.forbeginers;

import java.util.Set;
import java.util.HashSet;

public class Exercise9SetList {

	
	
	public static void Set () {
		
		Set<Integer> t = new HashSet<Integer>();
		t.add (5);
		t.add (1);
		t.add (9);
		t.add (5);
		t.add (-8);
		//t.remove(9);
		//t.clear();
		t.size();
		
		boolean x = t.contains(5);
		int i = t.size();
		
		System.out.println(t);
		System.out.println (x);
		System.out.println (i);
		
	}
	public static void main(String[] args) {
		Set();

	}

}
