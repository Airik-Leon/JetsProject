package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput; 
		boolean repeat= true; 
		
		while(repeat) {
			System.out.println(
					"1. List fleet\n" + 
					"2. View fastest jet\n" + 
					"3. View jet with longest range\n"+ 
					"4. Add a jet to the fleet\n" + 
					"5. Quit\n");
			userInput = input.nextInt();
			
			switch(userInput) {
			case 1:
				//listFleet();
				break;
			case 2: 
//				displayFastestJet();
				break;
			case 3: 
				//displayLongestRange();
				break;
			case 4: 
				//addJet();
				break;
			case 5: 
				System.out.println("Shutting down...");
				repeat = false;
				break;
			}
		}
	}
}
