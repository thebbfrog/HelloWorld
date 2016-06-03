package bbpractice;

import java.util.Arrays;
import java.util.Scanner;

public class P70011 {
	
	private static void insert(int[] arr, int num) {
		int idx = 0;
		for (int i = 0; i < arr.length - 1; ++i) {
			if (num <= arr[i]) {
				idx = i;
				break;
			}
			if (i == arr.length - 2) {
				idx = i + 1;
			}
		}
		
		// num should be inserted at index idx
		for (int i = arr.length - 2; i >= idx; --i) {
			arr[i + 1] = arr[i];
		}
		
		arr[idx] = num;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int repeat = sc.nextInt();
		
		for (int i = 0; i < repeat; ++i) 
		{
			int length = sc.nextInt();
			int[] arr = new int[length+1];
			
			for (int j = 0; j < length; ++j) {
				arr[j] = sc.nextInt();
			}
			
			insert(arr, sc.nextInt());
			
			
			int sum = 0;
			for (int e: arr) {
			//for (int j = 0; j < arr.length; ++j) {
			//	int e = arr[j];
				System.out.print("" + e + " ");
				sum += e; //sum = sum + e
			}
			
			System.out.println();
		}		
	}

}
