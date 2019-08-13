package com.training;

import java.util.ArrayList;
import java.util.Arrays;

public class Training14ArrayList {

	public static void createArrayList() {

		ArrayList<String> name = new ArrayList<String>();

		name.add("Abid");
		name.add("Basia");

		System.out.println(name.get(0));
		System.out.println(name.get(1));

		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}

		name.add(1, "Khan");

		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}

		String removed = name.remove(1);
		System.out.println(removed + " removed");

		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}

		boolean out = name.remove("Basia");
		System.out.println(out + " removed");

		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		out = name.remove("Basia");
		System.out.println(out + " removed");

	}

	public static void initArrayList() {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

		System.out.println("add element: ");

		list.add(4);
		list.add(0, 9);

		printlist(list);

		System.out.println("size of list: " + list.size());

		list.removeAll(Arrays.asList(9, 4));

		printlist(list);

		System.out.println("size of list: " + list.size());

		System.out.println("list contains 4:  " + list.contains(4));

		list.set(1, 100);
		printlist(list);

		list.clear();
		System.out.println("size of list: " + list.size());

		list.isEmpty();
		System.out.println("is it empty ?: " + list.isEmpty());

		list.addAll(Arrays.asList(0, 3, 2, 5, 6, 8, 89, 6, 4));
		printlist(list);
		System.out.println(list.get(9));

	}

	public static void printlist(ArrayList<Integer> list) {

		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

	public static void sortArray() {

		int[] numeric = { 1, 3, 5, 7, 3, 4, 98, 76, 47, 44, 345, 8, 4567, 65, 44, 323, 66, 4 };

		Arrays.sort(numeric);
		System.out.println(Arrays.toString(numeric));

		String[] name = { "blue", "pink", "red", "green", "gray", "white", "black" };

		Arrays.sort(name);
		System.out.println(Arrays.deepToString(name));

	}

	public static void functionArray() {

		
		ArrayList<Integer> mylist = new ArrayList<>(5);

		mylist.add(1);
		mylist.add(4000);
		mylist.add(6);
		mylist.add(76);
		mylist.add(900);

		for (Integer i : mylist) {
			System.out.println(i);
		}
		System.out.println(mylist);
		System.out.println("size is = " + mylist.size());

		mylist.remove(3);

		System.out.println(mylist);
		System.out.println("size is = " + mylist.size());

		System.out.println("index of 0 = " + mylist.get(0));

		mylist.set(3, 4);
		System.out.println(mylist);

	}

	public static void stringArrayList () {
		
		ArrayList <String> vegetableslist = new ArrayList <> ();
		
		vegetableslist.add ("Cucamber");
		vegetableslist.add ("Carrot");
		vegetableslist.add(2, "Potatoe");
		
		for (int i = 0; i < vegetableslist.size (); i++) {
		System.out.println (vegetableslist.get(i));
		}
		
		System.out.println (vegetableslist);
		
		
		ArrayList fruits = new ArrayList ();
		
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Strawberry");
		fruits.add("Kiwi");
		
		System.out.println (fruits);
		System.out.println (fruits.contains("Watermelon"));
		
		
		
		for (int i = 0; i < fruits.size (); i++) {
			System.out.println (fruits.get(i));
			}
	
		System.out.println (fruits);
		
		Object [] fruitsList = new Object [3];
		fruitsList = fruits.toArray();
		
		System.out.println (Arrays.toString (fruitsList));

	}

	public static void main(String[] args) {

		stringArrayList();

		// functionArray ();

		// sortArray ();

		// createArrayList ();

		// initArrayList ();

	}

}
