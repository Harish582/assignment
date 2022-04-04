package com.onebill.stringprograms;
import java.util.Scanner;

public class vowelsandConsonants {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int vowels=0,consonants=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u')
			{
				vowels++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				consonants++;
			}
		}
		System.out.println("total no vowels is:"+ vowels);
		System.out.println("total no of consonants is:" + consonants);
		
		
	}

}
