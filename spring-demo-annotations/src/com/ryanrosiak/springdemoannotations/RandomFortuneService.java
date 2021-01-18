package com.ryanrosiak.springdemoannotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// Create a random number generator
	private Random rand = new Random();
	
	@Override
	public String getFortune() {
		// Pick a random fortune from the array
		return data[rand.nextInt(data.length)];
	}

}
