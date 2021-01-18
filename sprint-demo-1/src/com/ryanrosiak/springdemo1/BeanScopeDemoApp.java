package com.ryanrosiak.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// Retrieve beans from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		// Check to see if these are the same beans
		boolean result = (theCoach == alphaCoach);
		System.out.println(result); // This should be true, it is a reference to the same bean (when the bean is singleton) Otherwise, prototype will yield two different addresses
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		// Close the application context
		context.close();
	}

}
