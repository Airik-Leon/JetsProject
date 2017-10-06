package com.skilldistillery.jets;

public class Pilot {
	private String name; 
	private String organization; 
	private String pilotNames[] ={"Rocky hard flyer", "Jimmy two wings", "Sarah Silverflyer", "Allen two eyes", "Freddy four fingers", "Chuey cloud"};
	private String organizations[] = {"Cream croppers", "Company X", "Fatal Foxes", "Silver Liners", "Cloud fortress", "Klepton 5"};
	
	public Pilot() {
		
	}
	public Pilot(String name, String organization) {
		this.name = name; 
		this.organization = organization;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public void setRandomPilotAndOrganization() {
		int randomNumber = (int)(Math.random() * 5);		
		this.name = pilotNames[randomNumber];
		this.organization = organizations[randomNumber]; 
	}
}
