package com.ryanrosiak.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve the bean from the spring container
		// We use CricketCoach here because we want to see all of the functions that are implemented in the CricketCoach class, not just the Coach class
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// call our new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		// Close the context
		context.close();
	}

}
