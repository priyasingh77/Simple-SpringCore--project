/*
 * 
 */


package com.springcore;

public class developer {
	
	private String devName;
	private laptop lap;
	
	//Generating getters and setters for laptop lap.
	public laptop getLap() {
		return lap;
	}

	public void setLap(laptop lap) {
		this.lap = lap;
	}

// Generating getters and setters to access the private variable(devName)
	public String getDevName() {
		return devName;
	}


	public void setDevName(String devName) {
		this.devName = devName;
	}


	public void coding() {
		System.out.println("Hello....I Can Code!...");
		lap.deploy();
	}
}
