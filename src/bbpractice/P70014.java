package bbpractice;

import java.util.Scanner;

public class P70014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i =0; i < repeat; ++i){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j =0; j < n; ++j){
				arr[j]= sc.nextInt();
			}
			int max = arr[0];
			int idx = 0;
			for (int b =0; b < n; ++ b){
				if (arr[b] > max){
					max = arr[b];
					idx = b;
				}
			}
			System.out.printf("max = %d, index = %d\n", max, idx);
		}
	}

}
