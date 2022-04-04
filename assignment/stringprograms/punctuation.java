package com.onebill.stringprograms;

import java.util.Scanner;

public class punctuation {
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
    		System.out.println("Enter the string:");
    		String str=sc.nextLine();
    		int p=0;
    		for(int i=0;i<str.length();i++)
    		{
    			if(str.charAt(i)==','||str.charAt(i)=='.'||str.charAt(i)==';'||str.charAt(i)=='!'||str.charAt(i)=='?')
    				{
    						p++;
    				}
    		}
    		System.out.println("total no of punctuation is:" + p);
    		
		}
}
