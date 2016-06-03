package bbpractice;

import java.util.Scanner;

public class P70013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i =0; i < repeat; ++i){
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; ++j){
				a[j] = sc.nextInt();
			}
			for (int b = (n-1); b >=0; --b){
				System.out.print(a[b] + " ");
				if(b==0){
					System.out.print("\n");
				}
			}
		}
	}

}
