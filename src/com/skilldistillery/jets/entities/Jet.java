package com.skilldistillery.jets.entities;

public abstract class Jet {
	
	public  String type = "";
	public  String model = "";
	public  int speedInMph= 0;
	public  int gallonsOfFuel= 0;
	public  int range= 0;
	public  double price= 0;
	
	public Jet() {};
	public Jet(String type, String model, int speed, int gallons, int range, double price, int numGuns) {

		this.type = type;
		this.model = model;
		this.speedInMph = speed;
		this.gallonsOfFuel = gallons;
		this.range = range;
		this.price = price;
	}
	
	
	
	
	
	public abstract void fly();
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
		

}
