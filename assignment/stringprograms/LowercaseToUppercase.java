package com.onebill.stringprograms;

import java.util.Scanner;

public class LowercaseToUppercase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(Character.isLowerCase(ch))
				System.out.print(Character.toUpperCase(ch));
		}
	}
}
