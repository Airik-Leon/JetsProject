package com.skilldistillery.jets;

public class Jet {
	private String model; 
	private int speedInMPH;
	private double range; 
	private double price;
	private Pilot initialPilot = new Pilot();
	
	public Jet() {
		initialPilot.setRandomPilotAndOrganization(); 
	}
	public Jet(String model, int speedInMPH, double range, int price) {
		this.model = model; 
		this.speedInMPH = speedInMPH;
		this.range = range; 
		this.price = price;
		initialPilot.setRandomPilotAndOrganization(); 
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeedInMach() {
		return (speedInMPH * 0.00130332);
	}
	public void setSpeedInMPH(int speedInMPH) {
		this.speedInMPH = speedInMPH;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Pilot getInitialPilot() {
		return initialPilot;
	}
	public void setInitialPilot(Pilot initialPilot) {
		this.initialPilot = initialPilot;
	}
	
	
	
}
