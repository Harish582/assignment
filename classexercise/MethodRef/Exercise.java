package com.one.MethodRef;

public class Exercise {
		public void chat()
		{
			System.out.println("this is from exercise");
		}
		public static void test()
		{
			System.out.println("this is from test method ");
		}
		public static void main(String[] args) {
			Test t=new Exercise()::chat; 
			t.message();
			
			Test t1=Exercise::test;
			t1.message();
		}
	

}
