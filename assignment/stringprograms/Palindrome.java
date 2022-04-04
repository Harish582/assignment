package com.onebill.stringprograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String rev=" ";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("given string is palidrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}
}
