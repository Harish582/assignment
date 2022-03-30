package com.one.lambda;

public class Test {
	public static void main(String[] args) {
		Runnable run=()->{
			for(int i=0;i<9;i++)
			{
				System.out.println(i);
			}
			
		};
		Thread thread = new Thread(run);
		thread.start();
	}

}
