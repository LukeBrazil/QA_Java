package com.qa.iteration;

import java.util.Arrays;

public class stringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
		String x = "Today it is Sunny";
		String y = "Yesterday it was raining.";
//		Concatenate both values, capitalise both strings and print out the result.
		String xy = x.toUpperCase() + ", " + y.toUpperCase();
		System.out.println(xy);
		// Now use the substring method to print out: `TODAY IT IS RAINING`
		String substring = xy.substring(0, 11) + xy.substring(35, 43);
		System.out.println(substring);
		
		// Method 1 - When given a String, count and return how many words there are in that String.
		String st1 = "The wind is howling outside!";
		String[] split = st1.split(" ", st1.length());
		System.out.println(Arrays.toString(split));
	

		
		// Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println(" ");
		
		// Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
		for (int i = split.length - 1; i >= 0; i--) {
			System.out.println(split[i]);
		}
		System.out.println(" ");
		
		// Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. A boolean value should be returned to indicate whether or not the second String has been found in the message.
		String message = "The winds whispers mary.";
		String compareMessage = "whispers mary.";
		
		System.out.println(message.contains(compareMessage));
		
		
	}

}
