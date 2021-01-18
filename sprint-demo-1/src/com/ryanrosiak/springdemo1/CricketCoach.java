package com.ryanrosiak.springdemo1;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	// Add new fields for emailAddress and team to showcase literal value setter injection
	private String emailAddress;
	private String team;
	
	// Create a no-args constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-args constructor");
	}
	
	// Add the setter method for the setter injection using beans
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	// Add the setter methods for the setter injection using literal values
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}
	
	// Add some getters for testing purposes
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public String getTeam() {
		return this.team;
	}

	@Override 
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}
	
	@Override
	public String insultMe() {
		return "Cricket is for girls";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
