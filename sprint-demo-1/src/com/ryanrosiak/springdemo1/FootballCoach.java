package com.ryanrosiak.springdemo1;

public class FootballCoach implements Coach {
	
	public String getDailyWorkout() {
		return "50 up-downs right now maggot";
	}

	public String insultMe() {
		return "You don't have the balls to be out on that field";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
