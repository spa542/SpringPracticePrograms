package com.ryanrosiak.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Get the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theCoach2 = context.getBean("pingPongCoach", Coach.class);
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		// Call some methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(swimCoach.getDailyWorkout());
		// Make use of the new methods added for the daily fortune
		System.out.println(theCoach.getDailyFortune());
		// Testing the values injected from the properties file
		System.out.println("Testing swim coach injections:");
		System.out.println(swimCoach.getDailyFortune());
		swimCoach.displayInformation();
		// Close the container
		context.close();
		
	}

}
