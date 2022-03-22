package com.java;

public class Group {
	public static void main(String[] args) {
		User user=new User("harish",638349868);
		user.chat();
		user.videocall();
		user.share();
		
		User u=new Admin("harish",638349868);
		u.chat();
		
		Admin b=(Admin)u;
		b.adduser("naveen");
		
		
		
		
	}

}
