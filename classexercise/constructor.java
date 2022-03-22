package com.java;

public class constructor {
	constructor() {
		System.out.println("HI AM FROM CONSTRUCTOR");
	}

	public static void main(String[] args) {
		constructor con = new constructor();
		Methodoverloading.add(3,4);
		Methodoverloading i=new Methodoverloading();
		System.out.println(i.b);
	}

}
