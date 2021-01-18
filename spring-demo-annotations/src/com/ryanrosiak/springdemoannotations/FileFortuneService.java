package com.ryanrosiak.springdemoannotations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	// Create the array for the strings
	private String[] data;
	
	// Create the random number generator
	Random rand;
	
	// Constructor will do all of the grunt work
	public FileFortuneService() {
		// Will only take 3 lines (fortunes) from the file for testing purposes
		data = new String[3];
		rand = new Random();
		
		try {
			Scanner read = new Scanner(new File("C:/Users/ryan1/Documents/eclipse-workspace-local/spring-demo-annotations/src/test.txt"));
			for (int i = 0; read.hasNextLine(); i++) {
				if (i == 3) {
					break;
				}
				data[i] = read.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found. An error occured!");
			e.printStackTrace();
		}
		
		/*
		// Print out the contents of the array
		for (int i = 0; i < data.length; i++) {
			System.out.println(">> " + data[i]);
		}
		*/
	}
	
	@Override
	public String getFortune() {
		return data[rand.nextInt(data.length)];
	}

}
