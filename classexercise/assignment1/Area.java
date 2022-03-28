package com.tyys.assignment1;

public class Area extends Shape {

	@Override
	void rectanglearea(int x, int y) {
		System.out.println("Area of Rectangle is" + x * y);

	}

	@Override
	void squarearea(int x) {

		System.out.println("area of square is" + x * x);
	}

	@Override
	void circlearea(int x) {
		System.out.println("area of circle is" + 3.14 * x * x);

	}

	public static void main(String[] args) {
		Area a = new Area();
		a.rectanglearea(2, 3);
		a.squarearea(8);
		a.circlearea(5);
	}

}
