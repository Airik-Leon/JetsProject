package com.skilldistillery.jets;

public class Pilot {
	private String name; 
	private String organization;
	private int age; 
	private int experience; 
	private String pilotNames[] ={"Rocky hard flyer", "Jimmy two wings", "Sarah Silverflyer", "Allen two eyes", "Freddy four fingers", "Chuey cloud"};
	private String organizations[] = {"Cream croppers", "Company X", "Fatal Foxes", "Silver Liners", "Cloud fortress", "Klepton 5"};
	private int pilotAges[] = {23, 45, 34,56, 78,43};
	private int pilotExperience[] = {1, 10, 4, 4, 20,12};
	
	public Pilot() {
	}
	public Pilot(String name, String organization, int age, int experience) {
		this.name = name; 
		this.organization = organization;
		this.age = age; 
		this.experience = experience;
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
	void setRandomPilotAndOrganization() {
			int randomNumber = (int)(Math.random() * 5);		
			this.name = pilotNames[randomNumber];
			this.organization = organizations[randomNumber];
			this.age = pilotAges[randomNumber]; 
			this.experience  = pilotExperience[randomNumber];
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
