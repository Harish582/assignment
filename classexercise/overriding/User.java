package com.onebill.overriding;

public class User {
	public static void main(String[] args) {
		//Test a = new Test();
		//a.message();
		Test1 b = new Test1();
		b.message();
		Test c = new Test();
		int add = c.add(2, 3);
		System.out.println(add);
		Test1 d = new Test1();
		int add1 = d.add(2, 3);
		System.out.println(add1);

	}

}
