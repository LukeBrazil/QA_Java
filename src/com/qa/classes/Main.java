package com.qa.classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Person
		Person luke = new Person("Luke", 29, "Male");
		
		// Book
		Book redwall = new Book("Redwall", "Dunno Name", "Adventure", 765);
		System.out.println(luke.describe());
		System.out.println(luke.speak("Hello!"));
		System.out.println(redwall.genre);
		if (redwall.isOpen) {
			redwall.describe();
		} else {
			redwall.open();
			redwall.describe();
		}
		
		// Employee
		Employee john = new Employee("John", 25, "Male", 56500.75);
		
		System.out.println(john.describe());
		System.out.println(john.calculateWeeklySalary());
		
		// Trainee
		Trainee tony = new Trainee("Tony", 17, "Male", 11789.98);
		tony.addSubjects("Math");
		tony.addSubjects("Literature");
		tony.addSubjects("History");
		System.out.println("Tony: " + tony.showSubjects());
		
		Trainee david = new Trainee("David", 17, "Male", 11089.98);
		david.addSubjects("Com Sci");
		david.addSubjects("Poetry");
		david.addSubjects("Goblins");
		System.out.println("David: " + david.showSubjects());
		
		// Manager
		Manager garry = new Manager("Gary", 32, "Male", 120000.69);
		garry.addEmployee(david);
		garry.showEmployees();
	}

}
