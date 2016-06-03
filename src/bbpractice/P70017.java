package bbpractice;

import java.util.Arrays;
import java.util.Scanner;

public class P70017 {
	public static void swap(int[] arr, int index1, int index2){
		int a = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int j =0; j< repeat; ++j){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i =0; i <n; ++i){
				arr[i] = sc.nextInt();
			}
			for(int q = 0; q < arr.length-1; ++q){
				for(int i=0; i <arr.length-1; ++i){
					if(arr[i]<arr[i+1]){
					swap(arr, i, i+1);
					}
					
				}
			}
			System.out.println( "After sorted: " + Arrays.toString(arr));
			
		}
	}
}

