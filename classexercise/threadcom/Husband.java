package com.tyys.threadcom;

public class Husband extends Thread {
	
	Account account;
	public Husband(Account account) {
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
