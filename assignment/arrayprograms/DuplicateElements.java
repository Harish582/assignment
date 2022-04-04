package com.onebill.arrayprograms;

import java.util.Scanner;

public class DuplicateElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], i, j;
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		a = new int[n];
		System.out.println("Enter array elements:");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}

	}

}
