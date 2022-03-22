package com.java;

public class Addition {
	
	static int mul(int x,int y)
	{
		int mul=x*y;
		return mul;
	}
	
	public static void main(String[] args) {
		int res=Addition.mul(3, 4);
		System.out.println(res);
		int res1=Addition.mul(25, 33);
		System.out.println(res1);
	}

}
