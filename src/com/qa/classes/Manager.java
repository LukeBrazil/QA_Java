package com.qa.classes;
import java.util.*;

public class Manager extends Employee{
	

	public Manager(String name, int age, String gender, double annualSalary) {
		super(name, age, gender, annualSalary);
		// TODO Auto-generated constructor stub
	}

	ArrayList<Object> employeesUnderManager = new ArrayList<Object>();
	
	public void addEmployee(Object emp) {
		employeesUnderManager.add(emp);
		System.out.println("Added!");
	}
	
	public void showEmployees() {
		System.out.println(employeesUnderManager.toString());
		for (int i = 0; i < employeesUnderManager.size(); i++) {
			System.out.println(employeesUnderManager.get(i));
		}
		
		for(Object emp : employeesUnderManager) {
			System.out.println(">>>>" + emp.toString());
		}
	}
}
