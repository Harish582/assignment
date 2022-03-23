package com.tyys.accessspecifier;

public class Demo extends Test {
	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println(demo.z);
		//System.out.println(demo.a);
		
		demo.add();
		demo.sub();
		//demo.mul();

	}
	

}
