package com.tyys.has$relationship;
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int number1=sc.nextInt();
		System.out.println("Enter second number");
		int number2=sc.nextInt();
		int res=0;
		res=number1/number2;
		
		int a[];
		a=new int[res];
		a[4]=20;
		System.out.println(a[4]);
		System.out.println(res);
		
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("array index out of bound");
			}
			if(e instanceof ArithmeticException)
			{
				System.out.println("denom>0");
			}
		}
	}
}
