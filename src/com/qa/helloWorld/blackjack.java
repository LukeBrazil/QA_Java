package com.qa.helloWorld;

public class blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(play(20, 18));
	}
	
	public static int play(int number1, int number2) {
		int blackjack = 21;
		int result1;
		int result2;
		
		if(number1 > 0 && number1 <= 21) {
			result1 = number1;
		} else {
			result1 = 0;
		}
		
		if(number2 > 0 && number2 <= 21) {
			result2 = number2;
		} else {
			result2 = 0;
		}
		
		int bresult1 = blackjack - result1;
		System.out.println("bresult1 " + bresult1);
		int bresult2 = blackjack - result2;
		System.out.println("bresult1 " + bresult2);
		if (bresult1 < bresult2) {
			return result1;
		} else {
			return result2;
		}
		
	}

}
