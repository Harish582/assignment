package com.tyys.threadcom;

public class Account {
	Double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	public synchronized void withdraw(int amount) {
		if(amount<balance) {
			balance=balance-amount;
		}
	}
	public void deposit(int amount)
	{
		balance=balance+amount;
	}
	public void getbalance()
	{
		System.out.println("The balance left is="+ balance);
	}
	

}
