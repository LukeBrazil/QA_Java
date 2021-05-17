package com.qa.iteration;

public class splitNumbers {
	
	public static void main(String[] args) {
//		split(12719);
//		flowchart2();
//		dupNumbers();
//		dupNumbers2(3);
		correctChange(4.58, 20);
	}
	
	public static void split(int n) {
		int i,count = 0;

		while(n > 0) {
			i = n % 10;
			count += i;
			n = n / 10;
		}
		System.out.println(count);
	}
	
	public static void flowchart1() {
		for (int a = 100; a < 200; a++) {
			System.out.println(a);
		}
	}
	
	public static void flowchart2() {
		for (int a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	
	public static void dupNumbers() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i);
			}
		}
	}
	
	public static void dupNumbers2(int n) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println(i);
			}
		}
	}
	
	public static void correctChange(double price, int note) {
		double change = note - price;
		System.out.println(change);
		String output = "";
//		for(double i = change; i <= 0; i++) {
//			if (i < 10) {
//				output += "1 $10 Note";
//				i -= 11;
//				continue;
//			}
//		}
//		while(change > 0) {
//			int tenBills;
//			int fiveBills;
//			int oneBills;
//			
//			
//			if (change > 10) {
////				tenBills += 1;
//			}
//		}
		System.out.println(output);
		
	}

}
