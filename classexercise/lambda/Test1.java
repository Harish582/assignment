package com.one.lambda;

public class Test1 {
	public static void main(String[] args) {
		MyFunctionalInterface obj=(x,y)->{
			return x+y;
			
		};
		double add=obj.add(20, 30);
		System.out.println(add);
		
	}

}
