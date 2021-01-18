package com.ryanrosiak.springdemo1;

public class HappyFortuneService implements FortuneService {

	private String fortuneArray[];
	
	public HappyFortuneService() {
		fortuneArray = new String[3];
		fortuneArray[0] = "This is the best time to be alive!";
		fortuneArray[1] = "You will achieve great things very soon!";
		fortuneArray[2] = "Your friends will show you the way in due time. Stay patient!";
	}
	
	@Override
	public String getFortune() {
		return fortuneArray[(int)(Math.random() * 3)];
	}

}
