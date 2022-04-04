package com.onebill.arrayprograms;
import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[],i,max=0;
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		a = new int[n];
		System.out.println("Enter array elements:");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}	
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The maximum number is :"+ max);
	}

}
