package com.onebill.arrayprograms;

import java.util.Scanner;

public class frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], i,j,visited=-1;
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		a = new int[n];
		int freq[]=new int[a.length];
		System.out.println("Enter array elements:");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			int count=1;
			for(j=i+1;j<a.length;j++)
			{
			   if(a[i]==a[j])
			   {
				   count++;
				   freq[j]=visited;
			   }
			   if(freq[i]!=visited) {
				   freq[i]=count;
			   }
			}
			
		}
		for(i=0;i<a.length;i++)
		{
			if(freq[i]!=visited)
			{
				System.out.println(a[i]+"------>"+freq[i]);
			}
		}
		
	}

}
