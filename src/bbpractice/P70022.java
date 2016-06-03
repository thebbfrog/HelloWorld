package bbpractice;

import java.util.Scanner;

public class P70022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int j=0; j <repeat; ++j){
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			for (int i =0; i <n; ++i){
				for (int q=0; q<n; ++q){
					arr[i][q]=sc.nextInt();
				}
			}
			int sum =0;
			for(int i=0; i<arr.length-1; ++i ){
				for(int q=0; q<arr.length-1; ++q){
					if(i+q!=n-1){
						sum = sum + arr[i][q];
					}
				}
			}
		 System.out.println("sum = " + sum);
		}
	}	
}

