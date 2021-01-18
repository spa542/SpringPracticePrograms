package com.ryanrosiak.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext; // Eclipse will help you import this class from this specific package

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve a bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); // The first argument is the id/alias of the bean and the second argument is the interface of the class
		Coach coachInsult = context.getBean("myCoachInsult", Coach.class);
		// This bean is using dependency injection
		Coach coachDependency = context.getBean("myCoachDepend", Coach.class);
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(coachInsult.insultMe());
		// Call new method from the dependency injection
		System.out.println(coachDependency.getDailyFortune());
		// Close the application context
		context.close();
	}

}
