package com.onebill.stringprograms;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter first string:");
		str1=sc.nextLine();
		System.out.println("Enter second string:");
		str2=sc.nextLine();
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(String.valueOf(arr1).equals(String.valueOf(arr2)))
		{
			System.out.println("Given string is anagram");
		}
		else
		{
			System.out.println("Given string is not anagram");
		}
	}
}
