package com.java;

public class Admin extends User {
	public Admin(String name,long number)
	{
		super(name,number);
		System.out.println("from admin");
	}
	
	public void adduser(String username)
	{
		System.out.println(username+"added");
		
    }
	
	public void removeuser(String username)
	{
		System.out.println(username+"removed");
	}
	

}
