package com.onebill.overriding;

public class Owner {
	public static void main(String[] args) {
		Ferari f=new Ferari();
		f.drive();
		f.brake();
		f.horn();
		
		System.out.println("==========");
		
		Audi g=new Audi();
		g.drive();
		g.brake();
		g.horn();
	}

}
