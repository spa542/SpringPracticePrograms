package com.ryanrosiak.springdemo1;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String insultMe() {
		return "You got shin splints or something? I can't see how you run that slow.";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// Add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside method doMyStartUpStuff");
	}
	
	// Add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: Inside method doMyCleanupStuff");
	}
	
}
