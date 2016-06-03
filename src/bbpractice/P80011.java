package bbpractice;

import java.util.Arrays;
import java.util.Scanner;

public class P80011 {
	public static void mov(int[] list, int m){
		for (int i=0; i<m; ++i){
			int tmp = list[list.length -1];
			for (int t=list.length-1; t>=1; --t){
				list[t]=list[t-1];
			}
			list[0]=tmp;	
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int t=0; t<n; ++t){
			arr[t]= sc.nextInt();
		}
		mov(arr,m);
		System.out.println(Arrays.toString(arr));
	}

}
