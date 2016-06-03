package bbpractice;

import java.util.Scanner;

public class P80013 {
	public static void swap(int[]arr, int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2]= temp;
	}
	public static void sort(int[]arr, int n){
		
		for(int j =0; j < n; ++j){
			int min = arr[j];
			int minIndex = j;
			for(int i =j; i < n; ++i){
				if(arr[i] < min){
					min = arr[i];
					minIndex = i;
				}
			}	
			swap(arr,j,minIndex);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int j=0; j < repeat; ++j){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i =0; i <n; ++i){
				arr[i] = sc.nextInt();
			}
			sort(arr,n );
			System.out.print("After sorted: ");
			for(int e: arr){
				System.out.print(" ");
				System.out.print(e);
			}
			System.out.print("\n");
		}
	}

}
