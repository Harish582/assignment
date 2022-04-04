package numberSystemPrograms;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int n,sum=0,rem;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			
			
		}
		if(temp==sum)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not palindrome");
		}
		
	}

}
