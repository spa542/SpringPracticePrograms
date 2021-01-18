package com.ryanrosiak.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// This is for constructor qualifier injection
	@Autowired
	public PingPongCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 30 twin swings";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
