package com.qa.helloWorld;

public class flowchart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(input(1, 2, false));
		input2(99);
	}
	
	public static int input(int num1, int num2, boolean flag) {
		if (flag == true) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}
	}
	
	public static void input2(int a) {
		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (a > 100) {
				System.out.println("3");
				if (a > 600) {
					System.out.println("4");
					if (a > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}

}
