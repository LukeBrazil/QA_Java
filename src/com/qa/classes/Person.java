package com.qa.classes;

public class Person {

	// Attributes
	public String name;
	public int age;
	public String gender;
	
	// Constructors
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// Methods
	
	public String describe() {
		return name + " is " + age + " and is " + gender + ".";
		
	}
	
	public String speak(String msg) {
		return "Luke Says: " + msg;
	}
}
