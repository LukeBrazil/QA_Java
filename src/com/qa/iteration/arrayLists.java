package com.qa.iteration;

import java.util.*;

public class arrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a new ArrayList
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		
		
		//add() several elements
		
		for(int i = 1; i <= 10; i++) {
			intArray.add(i);
			
		}
		//print out the entire ArrayList
		System.out.println(intArray.toString());

		//iterate through the ArrayList and print out each element (with both normal and enhanced for-loops)
		for (int i = 0; i < intArray.size(); i++) {
			System.out.println(intArray.get(i));
		}
		//get() specific elements
		
		for (int i = 0; i < intArray.size(); i++) {
			if (intArray.get(i) > 5) {
				System.out.println(intArray.get(i));
			}
		}
		//set() different elements
		intArray.set(0, 1024);
		System.out.println(intArray.toString());
		for (int i : intArray) {
			System.out.println(i);
		}
		
		//remove() elements
		intArray.remove(0);
		System.out.println(intArray.toString());
		for (int i : intArray) {
			System.out.println(i);
		}
		//sort() the ArrayList (try this with several object types)
		intArray.sort(null);
		for (int i : intArray) {
			System.out.println(i);
		}
		System.out.println(intArray.toString());
		//try using the reverse(), swap() and clone() methods from the Collections class
		
		// reverse
		Collections.reverse(intArray);
		System.out.println(intArray.toString());
		
		// swap 
		Collections.swap(intArray, 0, intArray.size() - 1);
		System.out.println(intArray.toString());
		
		// clone
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		newArray.clone(intArray);
		
	}	

}
