package com.onebill.arrayprograms;

import java.util.Scanner;

public class secondlargest {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[],i;
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		a = new int[n];
		int largest=a[0],second_largest=a[0];
		System.out.println("Enter array elements:");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}	
		for(i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				second_largest=largest;
				largest=a[i];
				
			}
			else if(a[i]>second_largest)
			{
				second_largest=a[i];
			}
		}
		System.out.println("The second largest number is:"+ second_largest);
	}

}
