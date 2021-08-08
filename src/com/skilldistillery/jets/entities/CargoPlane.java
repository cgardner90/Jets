package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements Cargo {

	private String type = "";
	private String model = "";
	private int speedInMph = 0;
	private int gallonsOfFuel = 0;
	private int range = 0;
	private double price = 0;
	private int payload = 0;

	public CargoPlane(String type, String model, int speed, int gallons, int range, double price, int carry) {
		this.type = type;
		this.model = model;
		this.speedInMph = speed;
		this.gallonsOfFuel = gallons;
		this.range = range;
		this.price = price;
		this.payload = carry;
	}
	public CargoPlane() {
		
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
	public int getPayload() {
		return payload;
	}
	public void setPayload(int payload) {
		this.payload = payload;
	}
	@Override
	public void fly() {
		int flightTime = (range/speedInMph);
		System.out.println("Model: == "+this.model+ " ==  has the following specifications: ");
		System.out.println(" -Type: Cargo");
		System.out.println(" -Speed: " +this.speedInMph);
		System.out.println(" -Fuel Capacity: " +this.gallonsOfFuel);
		System.out.println(" -Range: " +this.gallonsOfFuel);
		System.out.println(" -Payload : "+ this.payload);
		System.out.println("The "+ this.model+" can stay aloft for approximately\n"+ flightTime + " hour(s)");

	}

	@Override
	public String loadCargo() {
		String s = this.model;
		return s+ "\nReady for Action!!\nLet's Load up!!";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "CargoPlane [type=" + type + ", model=" + model + ", speedInMph=" + speedInMph + ", gallonsOfFuel="
				+ gallonsOfFuel + ", range=" + range + ", price=" + price + ", payload=" + payload;}

}
