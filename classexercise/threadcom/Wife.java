package com.tyys.threadcom;

public class Wife extends Thread {
	Account account;
	public Wife(Account account) {
		this.account=account;
	}
	
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			account.withdraw(100);
		}
	}
}
