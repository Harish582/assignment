package com.tyys.array;
import java.util.Scanner;

public class Bubblesort {
	public static void main(String[] args) {
		int i,j,n,temp=0;
		int a[];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements in array:");
		n=s.nextInt();
		a=new int[n];
		System.out.println("Enter array elements:");
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting the array elements are:");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
