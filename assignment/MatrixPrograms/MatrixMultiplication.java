package MatrixPrograms;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, i, j,k;
		System.out.println("Enter no of rows:");
		m = sc.nextInt();
		System.out.println("Enter no of columns:");
		n = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int mul[][] = new int[m][n];
		
		System.out.println("Enter matrix 'a' elements ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter matrix 'b' elements ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				mul[i][j]=0;
				for(k=0;k<m;k++)
				{
					mul[i][j] =mul[i][j]+ a[i][k] + b[k][j];
				}
				
			}
		}
		System.out.println("the resultant matrix multiplication is:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println(mul[i][j]);
			}
		}
	}
}
