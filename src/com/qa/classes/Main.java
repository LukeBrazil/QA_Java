package com.qa.classes;
import com.qa.classes.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person luke = new Person("Luke", 29, "Male");
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
		
		
	}

}
