package com.ryanrosiak.springdemoannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// This is for specifying a bean id
// @Component("thatSillyCoach")
// This is for a default bean id (The default bean id is the class name with the first letter lower case)
@Component
@Scope("singleton") // This is the annotation for changing the scope
public class TennisCoach implements Coach {
	
	// We can do field injection
	@Autowired
	@Qualifier("randomFortuneService") // We need to specify which bean to use when we have multiple
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor");
	}
	
	// This if for bean lifecycle methods using annotations
	// Define the init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: Inside of doMyStartupStuff()");
	}
	
	// Define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: Inside of doMyCleanupStuff()");
	}
	
	
	/* This is constructor injection
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	/* This is for setter injection
	// Define the setter method for setter injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}
	*/
	
	/* This is any method injection
	// Custom method name for injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
