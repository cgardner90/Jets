package com.skilldistillery.jets.entities;

public class FighterPlane extends Jet implements Fighter {

	private String type = "";
	private String model = "";
	private int speedInMph = 0;
	private int gallonsOfFuel = 0;
	private int range = 0;
	private double price = 0;
	private int numberOfGuns=0;


	public FighterPlane(String type, String model, int speed, int gallons, int range, double price, int numGuns) {

		this.type = type;
		this.model = model;
		this.speedInMph = speed;
		this.gallonsOfFuel = gallons;
		this.range = range;
		this.price = price;
		this.numberOfGuns = numGuns;
		
	}
	
	
	public FighterPlane() {
	}

	@Override
	public void fight() {
	System.out.println("The "+this.model+" is equipped with an armament of "+ this.numberOfGuns+" guns");
		
	}

	@Override
	public void fly() {
			
		int flightTime = (range / speedInMph);
		if(flightTime==0) {
			flightTime = 1;
		}
		System.out.println("Model:  == "+this.model+" == has the following specifications: ");
		System.out.println(" -Type: Fighter");
		System.out.println(" -Speed: " +this.speedInMph);
		System.out.println(" -Fuel Capacity: " +this.gallonsOfFuel);
		System.out.println(" -Range: " +this.gallonsOfFuel);
		System.out.println(" -# of Guns: "+ this.numberOfGuns);
		System.out.println("The "+ this.model+" can stay aloft for approximately\n"+ flightTime + " hour(s)");
	}

	@Override
	public String toString() {
		return "FighterPlane [type=" + type + ", model=" + model + ", speedInMph=" + speedInMph + ", gallonsOfFuel="
				+ gallonsOfFuel + ", range=" + range + ", price=" + price + ", numberOfGuns=" + numberOfGuns + "]";
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getSpeedInMph() {
		return speedInMph;
	}


	public void setSpeedInMph(int speedInMph) {
		this.speedInMph = speedInMph;
	}


	public int getGallonsOfFuel() {
		return gallonsOfFuel;
	}


	public void setGallonsOfFuel(int gallonsOfFuel) {
		this.gallonsOfFuel = gallonsOfFuel;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getNumberOfGuns() {
		return numberOfGuns;
	}


	public void setNumberOfGuns(int numberOfGuns) {
		this.numberOfGuns = numberOfGuns;
	}

}
