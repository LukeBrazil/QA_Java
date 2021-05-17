package com.qa.helloWorld;

public class uniqueSum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findUniques(1, 1, 2));
		
	}
	
	public static int findUniques(int number1, int number2, int number3) {
		int result = 0;
		if(number1 != number2 && number1 != number3) {
			result += number1;
		}
		if(number2 != number1 && number2 != number3) {
			result += number2;
		}
		if(number3 != number1 && number3 != number2) {
			result += number3;
		}
		return result;
	}

}
