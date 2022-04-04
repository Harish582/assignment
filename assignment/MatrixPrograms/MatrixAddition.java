package MatrixPrograms;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, i, j;
		System.out.println("Enter no of rows:");
		m = sc.nextInt();
		System.out.println("Enter no of columns:");
		n = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int sum[][] = new int[m][n];
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
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("The resultant matrix addition is:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.println(sum[i][j]);
			}
		}

	}

}
