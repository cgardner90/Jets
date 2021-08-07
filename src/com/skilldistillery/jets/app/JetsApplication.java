package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterPlane;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {
	public static void main(String[] args) {
		JetsApplication me = new JetsApplication();
		Airfield af = new Airfield();
		String filename = "Jets.txt";
		ArrayList<Jet> jets = (ArrayList<Jet>) me.importJets(filename);
//		me.printMenu();
		me.makeChoice(jets);
	}

	public ArrayList<Jet> importJets(String fileName) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Jet> imported = new ArrayList<Jet>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			int counter = 1;
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
			for (String s : list) {
				String type = s.split(", ")[0];
				String model = s.split(", ")[1];
				int speed = Integer.parseInt(s.split(", ")[2]);
				int gallons = Integer.parseInt(s.split(", ")[3]);
				int range = Integer.parseInt(s.split(", ")[4]);
				double price = Double.parseDouble(s.split(", ")[5]);
				if (type.equals("Cargo")) {
					int carry = Integer.parseInt(s.split(", ")[6]);
					Jet j = new CargoPlane(type, model, speed, gallons, range, price, carry);
					imported.add(j);
					counter++;

					// System.out.println("Cargo Added");
				} else if (type.equals("Fighter")) {
					int guns = Integer.parseInt(s.split(", ")[6]);
					Jet j = new FighterPlane(type, model, speed, gallons, range, price, guns);
					imported.add(j);
					counter++;
//					System.out.println("Fighter Added");
				} else {
					System.err.println("Plane #" + counter
							+ " :of Incorrect type, jet not added.\nCheck input file for correct parameters.");
				}
				// Work out parsing logic
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
			e.getMessage();
		} catch (IOException e) {
			System.err.println("Output Error");
			e.printStackTrace();
		}
		return imported;
	}

	public void printMenu() {
		System.out.println("\n****************************************");
		System.out.println("****************************************");
		System.out.println("*** Welcome to our Jets Application !***");
		System.out.println("***                                  ***");
		System.out.println("*** Select an option below to start  ***");
		System.out.println("***                                  ***");
		System.out.println("****************************************");
		System.out.println("****************************************\n\n");
		System.out.println("	1. List Fleet					");
		System.out.println("	2. Fly All Jets					");
		System.out.println("	3. View Fastest Jet				");
		System.out.println("	4. View Longest Ranged Jet		");
		System.out.println("	5. Load All Cargo Jets			");
		System.out.println("	6. DogFight!					");
		System.out.println("	7. Add Jet to Fleet				");
		System.out.println("	8. Remove Jet From Fleet		");
		System.out.println("	9. Quit Application				");
		System.out.println("\n\n");
	}

	public void makeChoice(ArrayList<Jet> jets) {
		boolean done = false;
		do {
		printMenu();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Choice: ");
		int num = input.nextInt();
		switch (num) {
		case 1:
			listFleet(jets);
			break;
		case 2:
			flyJets(jets);
			break;
		case 3:
			fastestJet(jets);
			break;
		case 4:
			longestRange(jets);
			break;
		case 5:
			loadCargo(jets);
			break;
		case 6:
			break;
		case 7:
			System.out.println(jets.size());
			jets.add(newJet());
			System.out.println(jets.size());
			break;
		case 8:
			break;
		case 9:
			done = true;
			break;
		default:
			System.out.println("Wrong");
		}
		}
while(!done);
	}

	public void listFleet(ArrayList<Jet> jets) {
		for (Jet j : jets) {
			System.out.println(j.toString());
			System.out.println("\n");
		}
	}

	public void flyJets(ArrayList<Jet> jets) {
		for (Jet j : jets) {
			j.fly();
			System.out.println("\n");
		}
	}

	public void fastestJet(ArrayList<Jet> jets) {
		int topSpeed = 0;
		String s = "";
		for (Jet j : jets) {
			if (j.getSpeedInMph() > topSpeed) {
				topSpeed = j.getSpeedInMph();
				s = j.toString();
			}
		}
		System.out.println("The fastest plane is: ");
		System.out.println(s);
	}

	public void longestRange(ArrayList<Jet> jets) {
		int topRange = 0;
		String s = "";
		for (Jet j : jets) {
			if (j.getRange() > topRange) {
				topRange = j.getRange();
				s = j.toString();
			}
		}
		System.out.println("The plane with the longest range is : ");
		System.out.println(s);
	}
	public void loadCargo(ArrayList<Jet> jets) {
		for (Jet j : jets) {
			if(j.getType().equals("Cargo")) {
			CargoPlane cp = (CargoPlane) j;
			System.out.print(cp.loadCargo());
			System.out.println("\n");
		}
	}
		
	}
		public Jet newJet() {
			ArrayList<Jet> newJets = new ArrayList<>();
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a new Jet here: \n");
			System.out.println("New Jet type: (Cargo or Fighter)");
			String type = input.nextLine();
			System.out.println("New Jet model: ");
			String model = input.nextLine();
			System.out.println("New Jet speed(MPH): \nNote: Must be an integer.");
			int speed = input.nextInt();
			System.out.println("New Jet Fuel Cap. (Gallons): ");
			int fuel = input.nextInt();
			System.out.println("New Jet Range: ");
			int range = input.nextInt();
			System.out.println("New Jet Price: ");
			double price = input.nextDouble();
			System.out.println("If New Jet is Cargo, enter Carry Capacity: \nIf a Fighter, Enter Number of Guns:");
			int option = input.nextInt();
			if (type.equals("Cargo")) {
				Jet j = new CargoPlane(type, model, speed, fuel, range, price, option);
				System.out.println(j);
				return j;
			} else if (type.equals("Fighter")) {
				Jet j = new FighterPlane(type, model, speed, fuel, range, price, option);
				System.out.println(j);
				return j;
			}else {
				return null;
			}
			
			
}
}