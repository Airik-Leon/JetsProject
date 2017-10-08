package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput; 
		boolean repeat= true; 
		Hangar cloudNine = new Hangar();
		Barracks pilotsGroup = new Barracks();
		
		while(repeat) {
			System.out.println(
					"1. List fleet\n" + 
					"2. View fastest jet\n" + 
					"3. View jet with longest range\n"+ 
					"4. Add a jet to the fleet\n" + 
					"5. Hire a pilot\n" + 
					"6. Quit\n");
			userInput = input.nextInt();
			
			switch(userInput) {
			case 1:
				cloudNine.listJets();
				break;
			case 2: 
				cloudNine.displayFastestJet();
				break;
			case 3: 
				cloudNine.displayLongestRange();
				break;
			case 4: 
				Jet newJet = new Jet();
				System.out.println("Enter the model for your jet");
				newJet.setModel(input.next());
				System.out.println("Enter the speed of the jet. (MPH)");
				newJet.setSpeedInMPH(input.nextInt());
				System.out.println("Enter the range of the jet. ");
				newJet.setRange(input.nextDouble());
				System.out.println("Enter the price of the jet. " );
				newJet.setPrice(input.nextDouble());
		
				cloudNine.addJet(newJet);
				newJet = null; 
				break;
			case 5: 
				pilotsGroup.hirePilot();
				pilotsGroup.listPilots();
				break;
			case 6:
				System.out.println("Shutting down...");
				repeat = false; 
				break;
			}
		}
	}
}
