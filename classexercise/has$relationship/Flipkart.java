package com.tyys.has$relationship;

public class Flipkart {
	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		Battery battery=new Battery();
		battery.brand="dell";
		battery.capacity=20000;
		battery.type="Lithium";
		
		Rom rom=new Rom();
		rom.type="dd4";
		rom.size=16;
		rom.clockspeed=2.4;
		
		Screen screen=new Screen();
		screen.brand="samsung";
		screen.size=1080;
		screen.size=32;
		screen.type="oled";
		
		laptop.brand="hp";
		laptop.price=100000;
		laptop.battery=battery;
		laptop.rom=rom;
		laptop.screen=screen;
		
		System.out.println(laptop);
	}

}
