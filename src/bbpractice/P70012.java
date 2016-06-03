package bbpractice;

import java.util.Scanner;

public class P70012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i =0; i < repeat; ++i){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; ++j){
				arr[j] = sc.nextInt();
			}
			float sum = 0;
			for(int e: arr){
				sum += e;
			}
			System.out.printf("average = %.2f\n", sum /n);
		}
	}

}
