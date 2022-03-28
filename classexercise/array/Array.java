package com.tyys.array;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int a[];
		System.out.println("enter no of elements in array");
		int res=sc.nextInt();
		a=new int[res];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter array element"+i);
			a[i]=sc.nextInt();
		}
		System.out.println("The array elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
	}

}
