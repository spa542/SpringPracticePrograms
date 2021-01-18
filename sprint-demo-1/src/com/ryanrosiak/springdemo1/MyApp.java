package com.ryanrosiak.springdemo1;

public class MyApp {
	
	public static void main(String[] args) {
		// Create the object
		Coach theCoach = new FootballCoach(); // Just a generic interface POLYMORPHISM!!!
		// Use the object
		System.out.println(theCoach.getDailyWorkout());
		
	}
	
}
