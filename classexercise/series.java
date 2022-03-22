package com.java;
import java.util.Scanner;
public class series {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		for(int i=0;i<c;i++)
		{
			int result=0;
			for(int j=0;j<=i;j++) {
				result+=(((Math.pow(2, j))*b));
			}
			System.out.println(a+result);
				
				
		}
	}

}
