package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements Cargo {

	public String type = "";
	public String model = "";
	public int speedInMph = 0;
	public int gallonsOfFuel = 0;
	public int range = 0;
	public double price = 0;
	public int carryCapacity = 0;

	public CargoPlane(String type, String model, int speed, int gallons, int range, double price, int carry) {
		this.type = type;
		this.model = model;
		this.speedInMph = speed;
		this.gallonsOfFuel = gallons;
		this.range = range;
		this.price = price;
		this.carryCapacity = carry;
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
	public int getCarryCapacity() {
		return carryCapacity;
	}
	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	@Override
	public void fly() {
		System.out.println("Model: == "+this.model+ " ==  has the following specifications: ");
		System.out.println(" -Type: Cargo");
		System.out.println(" -Speed: " +this.speedInMph);
		System.out.println(" -Fuel Capacity: " +this.gallonsOfFuel);
		System.out.println(" -Range: " +this.gallonsOfFuel);
		System.out.println(" -Carry Capacity: "+ this.carryCapacity);
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
				+ gallonsOfFuel + ", range=" + range + ", price=" + price + ", carryCapacity=" + carryCapacity + "]";
	}

}
