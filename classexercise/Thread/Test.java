package com.one.Thread;

public class Test extends Thread {
	
	int num;

	public Test(int num) {
		super();
		this.num = num;
	}
	public void run() {
		try {
			while(num>0)
			{
				if(num%2==0)
				{
					System.out.println(num);
					Thread.sleep(1000);
				}
				num--;
			}
		}catch(Exception e) {
			
		}
	}
	
	
	public static void main(String[] args) {
			Test a=new Test(10);
			a.start();
			Test b=new Test(20);
			b.start();
			
			
		}
		
	
		
		
	}



