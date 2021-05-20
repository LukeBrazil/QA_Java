package com.qa.classes;
import java.util.*;

public class Trainee extends Person{
	
	public double bursary;

	public Trainee(String name, int age, String gender, double bursary) {
		super(name, age, gender);
		this.bursary = bursary;
		// TODO Auto-generated constructor stub
		
	}
	
	ArrayList<String> subjects = new ArrayList<String>();
	
	public void addSubjects(String sbj) {
		subjects.add(sbj);
	}
	
	public String showSubjects() {
		return subjects.toString();
	}
	
}
