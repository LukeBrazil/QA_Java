package com.qa.iteration;

import java.util.Arrays;


public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 26, 31, 421, 55};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		int[] myArray;
		
		myArray = new int[3];
		myArray[0] = 1;
		myArray[1] = 2;
		myArray[2] = 3;
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
//		for each loop
		
		for (int num : nums) {
			System.out.println(num);
		}
		
		// Multi-Dimensional Array
		String[][] namesArray = {{"Bob", "Fred"}, {"John", "Lori"}};
		String fred = namesArray[0][1];
		namesArray[0][1] = "Jamie";
		System.out.println(">>> " + namesArray[0][1]);
		
		for (int i = 0; i < namesArray.length; i++) {
			System.out.println(Arrays.toString(namesArray[i]));
			for (int j = 0; j < namesArray[i].length; j++) {
				System.out.println(namesArray[i][j]);
			}
		}
		
		for (String[] names : namesArray) {
			for (String name : names) {
				System.out.println(name);
			}
		}
		
		
	}

}
