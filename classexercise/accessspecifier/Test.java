package com.tyys.accessspecifier;

public class Test {
	public int x=10;
	protected int y=20;
	int z=30;
	private int a=40;
	public static void main(String[] args) {
		Test test=new Test();
		System.out.println(test.x);
		System.out.println(test.y);
		System.out.println(test.z);
		System.out.println(test.a);

	}
	public void add()
	{
		System.out.println("public add");
	}
	protected void sub()
	{
		System.out.println("protected sub");
	}
	private void mul()
	{
		System.out.println("private mul");
	}

}
