package com.qa.helloWorld;

public class calculator {
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public static double divide(double num1, double num2) {
//		if(num1 < num2) {
//			return num1 / num2;
//		} else {
//			System.out.println("Cannot divide");
//		}
//		
		return num1 / num2;
	}
	
	public static double modulous(int num1, int num2) {
		return num1 % num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Add: " + add(5, 5));
		System.out.println("Subtract: " + subtract(5, 5));
		System.out.println("Divide: " + divide(517, 31));
		System.out.println("Modulous: " + modulous(5, 5));
	}

}
