package com.onebill.stringprograms;

import java.util.Scanner;

public class Reversestring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String str1=" ";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			str1=ch+str1;
		}
		System.out.println("Reverse of given string is:");
		System.out.println(str1);
	}
}
