package com.tyys.has$relationship;

public class Laptop {
	String brand;
	Battery battery;
	Rom rom;
	Screen screen;
	double price;
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", battery=" + battery + ", rom=" + rom + ", screen=" + screen + ", price="
				+ price + "]";
	}
	
	

}
