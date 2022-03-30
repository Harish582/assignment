package com.one.runnable;

public class Test {
	public static void main(String[] args) {
		Mythread thread = new Mythread();
		Thread thread1 = new Thread(thread);
		thread1.start();
	}

}
