package bbpractice;

import java.util.Scanner;

public class P70021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		for (int i =0; i < m; ++i){
			for (int j =0; j< n; ++j){
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int j =0; j <m; ++j){
			int sum = 0;
			for (int i =0; i <n; ++i){
			sum = sum + arr[j][i];
			}
			System.out.println("sum of row " + j + " is " + sum);
		}
	   }
}	

