package com.skilldistillery.jets;

import java.util.Scanner;

public class Barracks {
	private Pilot[] pilotsGroup;
	private Pilot[] persistedPilots; 
	


	public Barracks(){
		this.pilotsGroup = new Pilot[6];
		this.persistedPilots =new Pilot[6];
		persistedPilots[0] = new Pilot("Rocky Hardflyer", "Cream Croppers", 23, 1);
		persistedPilots[1] = new Pilot("Jimmy TwoWings", "Company X", 45, 10);
		persistedPilots[2] = new Pilot("Sarah Silverflyer", "Fatal Foxes", 34, 4);
		persistedPilots[3] = new Pilot("Allen Twoeyes", "Silver Liners", 56, 4);
		persistedPilots[4] = new Pilot("Freddy Fourfingers", "Cloud Fortress", 78, 20);
		persistedPilots[5] = new Pilot("Chuey Cloud", "Klepton 5", 43, 12);	
	}
	public Barracks(int size) {
		this.pilotsGroup = new Pilot[5];
	}
	public void hirePilot() {
		Scanner input = new Scanner(System.in); 
		int choice=0; 
		System.out.println(
				"1. Rocky Hardflyer\n" + 
				"2. Jimmy TwoWings\n" + 
				"3. Sarah Silverflye\n" + 
				"4. Allen Twoeye\n" + 
				"5. Freddy Fourfinger\n" + 
				"6. Chuey Cloud\n"+
				"7. Return to Home\n"); 
		choice = input.nextInt();
		switch(choice) {
		case 1:
				addPilot(persistedPilots[0]);
				break;
		case 2: 
				addPilot(persistedPilots[1]);
				break;
		case 3: 
				addPilot(persistedPilots[2]);
				break;
		case 4: 
				addPilot(persistedPilots[3]);
				break;
		case 5: 
				addPilot(persistedPilots[4]);
				break;
		case 6:
				addPilot(persistedPilots[5]);
				break;
		case 7: return;
		default: return;
		}
	}
	public void addPilot(Pilot x) {
		for(int i = 0; i < pilotsGroup.length; i++) {
			
			if(pilotsGroup[i] == null ) {
				pilotsGroup[i] = x;
				System.out.println(pilotsGroup[i].getName() + " is the next pilot on deck. ");
				break;
			}
			else if(pilotsGroup[i].getName().equals(x.getName())) {
				System.out.println(x.getName() + " has already been hired try someone else");
				break;
			}
		}
	}
	public void listPilots() {
		System.out.println("== Hired Pilots ==");
		for(int i = 0; i < pilotsGroup.length ; i++) {
			if(pilotsGroup[i] != null) {
				System.out.println(pilotsGroup[i].getName());
			}
		}
		System.out.println("==============");
	}
}
