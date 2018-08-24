package main;

import java.awt.Color;

public class Car {
	
	private Color color;
	private String make;
	private String model;
	
	private State state = State.STOP;
	
	enum State {
		STOP, START
	}
	
	
	public Car(Color color, String make, String model) {
		this.color = color;
		this.make = make;
		this.model = model;
	}
	
	public void start() {
		state = State.START;
	}
	
	public void stop() {
		state = State.STOP;
	}
		
	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}
	
}
