package com.onebill.arrayprograms;

import java.util.Scanner;

public class RightRotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[];
		int i, j, d = 2, temp;
		System.out.println("Enter size of array:");
		int res = sc.nextInt();
		a = new int[res];
		System.out.println("Enter the array elements:");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < d; i++) {
			temp = a[res - 1];
			for (j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];

			}
			a[0]=temp;
		}
		System.out.println("After rotation the array elements is:");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
