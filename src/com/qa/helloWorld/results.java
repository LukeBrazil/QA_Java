package com.qa.helloWorld;

public class results {
	
	static int Physics = 125;
	static int Chemistry = 89;
	static int Biology = 150;
	static int totalMarks = Physics + Chemistry + Biology;
	public static double percentage = totalMarks * 100 / 450;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayResults();
		displayPercentage();
	}
	
	public static void displayResults() {
		System.out.println("Physics Score: " + Physics);
		System.out.println("Chemistry Score: " + Chemistry);
		System.out.println("Biology Score: " + Biology);
		System.out.println("Total Marks Score: " + totalMarks);
	}

	public static void displayPercentage() {
		System.out.println("Total Percentage Score: " + percentage);
		if (percentage > 60 && Physics > 90 && Chemistry > 90 && Biology > 90) {
			System.out.println("You passed!");
		} else {
			System.out.println("You have failed!");
		}
	}
}
