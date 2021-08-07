package com.skilldistillery.jets.entities;

public class FighterPlane extends Jet implements Fighter {

	public String type = "";
	public String model = "";
	public int speedInMph = 0;
	public int gallonsOfFuel = 0;
	public int range = 0;
	public double price = 0;
	public int numberOfGuns=0;


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
		
	}

	@Override
	public void fly() {
		System.out.println("Model:  == "+this.model+" == has the following specifications: ");
		System.out.println(" -Type: Fighter");
		System.out.println(" -Speed: " +this.speedInMph);
		System.out.println(" -Fuel Capacity: " +this.gallonsOfFuel);
		System.out.println(" -Range: " +this.gallonsOfFuel);
		System.out.println(" -# of Guns: "+ this.numberOfGuns);
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
