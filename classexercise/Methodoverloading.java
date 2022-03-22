package com.java;

public class Methodoverloading {
	int b=20;
	Methodoverloading()
	{
		System.out.println("hi");
	}
	static void add(int x, int y) {
		System.out.println(x + y);
	}

	static void add(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	static void add(int x, double y) {
		System.out.println(x + y);
	}

	static void add(double x, int y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		Methodoverloading.add(25, 33.34);
	}

}
