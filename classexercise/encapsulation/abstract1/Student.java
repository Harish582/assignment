package com.tyys.abstract1;

public class Student {
	public static void main(String[] args) {
		Calculator calc=new Casio();
		System.out.println(calc.add(20, 3));
		System.out.println(calc.sub(2, 3));
		System.out.println(calc.mul(67, 44));
		System.out.println(calc.div(245, 33));
		System.out.println("==================");
		
		Calculator calc1=new Casio1();
		System.out.println(calc1.add(20, 33));
		System.out.println(calc1.sub(20, 33));
		System.out.println(calc1.mul(20, 33));
		System.out.println(calc1.div(20, 33));
		
	}

}
