package com.skilldistillery.jets;

public class Hangar {
	private Jet[] tempJets;
	
	public Hangar(){
		this.tempJets = new Jet[20];
		tempJets[0] = new Jet("Rager", 5000, 1000, 1_000_000);
		tempJets[1] = new Jet("Jubilent", 1000, 2000, 800_000); 
		tempJets[2] = new Jet("Sorrow", 4000, 3000, 1_000_000);
		tempJets[3] = new Jet("Envy", 6000, 600, 900_000);
		tempJets[4] = new Jet("Greedy", 3000, 10000, 1_500_000);
	}
	public Hangar(int size) {
		this.tempJets = new Jet[size];
		tempJets[0] = new Jet("Rager", 5000, 1000, 1_000_000);
		tempJets[1] = new Jet("Jubilent", 1000, 2000, 800_000); 
		tempJets[2] = new Jet("Sorrow", 4000, 3000, 1_000_000);
		tempJets[3] = new Jet("Envy", 6000, 600, 900_000);
		tempJets[4] = new Jet("Greedy", 3000, 10000, 1_500_000);
	}
	public void addJet(Jet newJet) {
		for(int i =0; i < tempJets.length; i++) {
			if(tempJets[i]== null) {
				tempJets[i] = newJet; 
				System.out.println(tempJets[i].getModel()+ " added. " );
				break;
			}
		}
	}
	public void listJets() {
		System.out.println("== Jets in the Fleet ==" );
		for(int i = 0; i < tempJets.length; i++) {
			if(tempJets[i] != null) {
				System.out.println("Model: "+ tempJets[i].getModel());
				System.out.println("Speed: mach "+ tempJets[i].getSpeedInMach());
				System.out.println("Range: "+ tempJets[i].getRange());
				System.out.println("Price: "+ tempJets[i].getPrice());
				System.out.println("Pilot: " + tempJets[i].getInitialPilot().getName());
				System.out.println("Organization: " + tempJets[i].getInitialPilot().getOrganization());
				System.out.println("Experience: " + tempJets[i].getInitialPilot().getExperience());
				System.out.println("Age: " + tempJets[i].getInitialPilot().getAge());
				System.out.println("================");
			}
		}
	}
	public void displayFastestJet() {
		Jet fastestJet; 
		fastestJet = tempJets[0];
		
		for(int i = 1; i < tempJets.length; i++){
			if(tempJets[i] == null) {
				continue;
			}
			else if(tempJets[i].getSpeedInMach() > fastestJet.getSpeedInMach()) {
				fastestJet = tempJets[i];
			}
		}
		System.out.println("== Fastest Jet Information ==" );
		System.out.println("Model: "+ fastestJet.getModel());
		System.out.println("Speed: mach"+ fastestJet.getSpeedInMach());
		System.out.println("Range: "+ fastestJet.getRange());
		System.out.println("Model: "+ fastestJet.getPrice());
		System.out.println("Pilot: " + fastestJet.getInitialPilot().getName());
		System.out.println("Organization: " + fastestJet.getInitialPilot().getOrganization());
		System.out.println("Experience: " + fastestJet.getInitialPilot().getExperience());
		System.out.println("Age: " + fastestJet.getInitialPilot().getAge());
		System.out.println("================\n");

	}
	public void displayLongestRange() {
		Jet range; 
		range = tempJets[0]; 
		for(int i = 0; i < tempJets.length; i++) {
			if(tempJets[i] == null) {
				continue;
			}
			else if(tempJets[i].getRange() > range.getRange()){
				range = tempJets[i];
			}
		}
		System.out.println("== Longest Range Jet  ==" );
		System.out.println("Model: "+ range.getModel());
		System.out.println("Speed: mach "+ range.getSpeedInMach());
		System.out.println("Range: "+ range.getRange());
		System.out.println("Price: "+ range.getPrice());
		System.out.println("Pilot: " + range.getInitialPilot().getName());
		System.out.println("Organization: " + range.getInitialPilot().getOrganization());
		System.out.println("Experience: " + range.getInitialPilot().getExperience());
		System.out.println("Age: " + range.getInitialPilot().getAge());
		System.out.println("================\n");
	}
}
