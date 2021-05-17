package com.qa.helloWorld;

public class taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(salaryTax(25800));
		System.out.println(0.15 * 25800);
		System.out.println("Total taxes to pay: " + totalTax(25800, salaryTax(25800)));
	}
	
	public static double salaryTax(int salary) {
		double percentage = 0.00;
		if(salary > 45000) {
			percentage = 0.25;
		} else if (salary >= 30000 && salary <= 44999) {
			percentage = 0.20;
		} else if (salary >= 20000 && salary <= 29999) {
			percentage = 0.15;
		} else if (salary >= 15000 && salary <= 19999) {
			percentage = 0.10;
		}
		return percentage;
	}
	
	public static double totalTax(int salary, double percentage) {
		double result = salary * percentage;
		return result;
	}

}
