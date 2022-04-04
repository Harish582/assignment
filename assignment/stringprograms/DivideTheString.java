package com.onebill.stringprograms;

import java.util.Scanner;

public class DivideTheString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1;
		int length;
		int n;
		System.out.println("Enter the string:");
		str1=sc.nextLine();
		System.out.println("enter n value:");
		n=sc.nextInt();
		if(str1.length()%n!=0)
		{
			System.out.println("Invalid input");
		}
		length=str1.length()/n;
		for(int i=0;i<str1.length();i++)
		{
			if(i%length==0)
				System.out.println(" ");
			System.out.println(str1.charAt(i));
		}
		
		
	}
}
