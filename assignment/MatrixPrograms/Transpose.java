package MatrixPrograms;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, i, j;
		System.out.println("Enter no of rows:");
		m = sc.nextInt();
		System.out.println("Enter no of columns:");
		n = sc.nextInt();
		int a[][] = new int[m][n];
		int transpose[][] = new int[m][n];
		System.out.println("Enter matrix  elements ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				transpose[i][j]=a[j][i];
			}
		}
		System.out.println("transpose of a matrix is:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println(transpose[i][j]);
			}
		}
	}
}
