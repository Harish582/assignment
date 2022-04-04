package com.onebill.arrayprograms;

import java.util.Scanner;

public class Removeduplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], i, j=0;
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		a = new int[n];
		int temp[]=new int[n];
		System.out.println("Enter array elements:");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
			
		}
		temp[j++]=a[a.length-1];
		for(i=0;i<j;i++)
		{
			a[i]=temp[i];
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
}
}
