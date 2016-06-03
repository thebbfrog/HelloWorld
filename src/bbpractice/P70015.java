package bbpractice;

import java.util.Scanner;

public class P70015 {
	public static void swap(int[] arr, int index1, int index2){
		int a = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = a; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int i =0; i < repeat; ++i){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j =0; j < n; ++j){
				arr[j] = sc.nextInt();
			}
			int max = arr[0];
			int min = arr[0];
		    int idxmax = 0;
			int idxmin = 0;
			for (int q =0; q < n; ++q){
				if(arr[q] > max){
					max =  arr[q];
					idxmax = q;
				}
				if(arr[q] < min){
					min = arr[q];
					idxmin = q;
				}
			}
			swap(arr, 0, idxmin);
			swap(arr, n-1, idxmax);

			for( int e : arr){
				System.out.print(e);
			}
		}
	}

}//分开换
