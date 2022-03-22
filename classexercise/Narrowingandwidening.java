package com.java;

public class Narrowingandwidening {
	public static void main(String[] args) {
		int x=10;
		long y=x;
		System.out.println(y);
		
		long a=20;
		int b=(int)a;
		System.out.println(b);
		
		int c='f';
		System.out.println(c);
		
		byte d=(byte)12;
		byte e=(byte)1;
		byte z=(byte)((byte)x+y);
		System.out.println(z);
		
		
	}
	

}
