package dev.romero.main;

public class Ball { //blueprint
	
	/*
	 * Public - Can access anywhere
	 * Private - Can only access through class
	 */
	
	
	
	//Children classes
	//Properties or instance variables
	public String color;
	public int capacity;
	public String name;
	public int bounceRate;

	//Behaviors
	public void bounce() {
		System.out.println("Bouncing");
	}
	
	public void deflate() {
		System.out.println("deflating..");
	}
	
	public void inflates() {
		System.out.println("inflating..");
	}
}
