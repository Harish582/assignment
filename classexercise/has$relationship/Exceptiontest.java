package com.tyys.has$relationship;

public class Exceptiontest {
 public static void main(String[] args) {
	System.out.println("program starts");
	try {
		throw new ArithmeticException();
	}catch(Exception e)
	{
	  e.printStackTrace();
	}
	
	System.out.println("program ends");
	
}
}
