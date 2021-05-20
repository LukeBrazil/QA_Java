package com.qa.classes;

public class Employee extends Person{
	
	public double annualSalary;
	public double weeklySalary;

	public Employee(String name, int age, String gender, double annualSalary) {
		super(name, age, gender);
		this.annualSalary = annualSalary;
		// TODO Auto-generated constructor stub
	}
	
	public String describe() {
		return "Employee: " + this.name + "\n Age: " + this.age + "\n Gender: " + this.gender + "\n Weekly Pay: " + this.annualSalary;
	}
	
	public double calculateWeeklySalary() {
		this.weeklySalary = annualSalary / 52;
		return annualSalary / 52;
	}
	
	

}
