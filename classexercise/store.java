package com.java;

public class store {
	 public static void main(String[] args) {
		 phone phone=new phone();
	     phone.price=1999;
	     phone.brand="nokia";
	     phone.ram=4;
	     
	     phone.call();
	     phone.msg("hello");
	     phone.radio();
	     System.out.println("=========");
	     
	     smartphone sc=new smartphone();
	     sc.playinggame();
	     sc.selfie();
	     
	     
	}
    
     
     
}
