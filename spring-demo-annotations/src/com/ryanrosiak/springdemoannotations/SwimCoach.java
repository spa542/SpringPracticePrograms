package com.ryanrosiak.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService") // Testing the FileFortuneService dependency injection
	private FortuneService fortuneService;
	
	// These are injecting values into private fields using a properties file and annotations
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Override
	public String getDailyWorkout() {
		return "Practice your butterfly stroke";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void displayInformation() {
		System.out.println("Email: " + this.email);
		System.out.println("Team Name: " + this.team);
	}

}
