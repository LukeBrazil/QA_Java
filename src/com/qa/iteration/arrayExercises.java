package com.qa.iteration;

import java.util.Arrays;
import java.util.ArrayList;

public class arrayExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		int[] array = new int[10];

		ArrayList<Integer> fillerArray = new ArrayList<Integer>();		
		
		for (int i = 0; i <= 10; i++) {
			fillerArray.add(i, i);
			System.out.println(fillerArray.get(i));
		}
		for (int num : fillerArray) {
			num = num * 10;
			System.out.println(num);
		}
		
		for (int i = 0; i < fillerArray.size(); i++) {
			fillerArray.set(i, fillerArray.get(i) * 10);
			System.out.println();
		}
		
		System.out.println(">>>> " + fillerArray.toString());
		
		for (int i = 1; i < array.length; i++) {
			array[i] = i * 10;
			
		}
		
		System.out.println(Arrays.toString(array));
		
	}
	
	

}
