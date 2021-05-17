package com.qa.iteration;

public class iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		whileStatement();
//		doWhileStatement();
//		forStatements();
		nestedLoops();
	}
	
	public static void whileStatement() {
		int parkingLotCapacity = 550;
		int parkedCars = 450;
		boolean notFull = true;
		
		while (notFull) {
			parkedCars++;
			System.out.println(parkedCars);
			if(parkedCars >= parkingLotCapacity) {
				notFull = false;
				System.out.println("Finished");
			}
		}
		System.out.println("Ended");
	}
	
	public static void doWhileStatement() {
		int parkingLotCapacity = 550;
		int parkedCars = 450;
		boolean notFull = true;
		
		do {
			parkedCars++;
			System.out.println(parkedCars);
			
		} while(parkedCars < parkingLotCapacity);
	}
	
	public static void forStatements() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		
	}
	
	public static void nestedLoops() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}
	
}
