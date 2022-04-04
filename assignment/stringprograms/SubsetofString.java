package com.onebill.stringprograms;
import java.util.Scanner;

public class SubsetofString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		int temp=0,len,i,j;
		System.out.println("Enter the string:");
		str=sc.nextLine();
		len=str.length();
		String arr[]=new String[len*(len+1)/2];
		for(i=0;i<len;i++)
		{
			for(j=i;j<len;j++)
			{
				arr[temp]=str.substring(i,j+1);
				temp++;
			}
		}
		System.out.println("subset of given string is:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
