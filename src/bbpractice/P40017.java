package bbpractice;

import java.util.Scanner;

public class P40017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int i = 0; i < repeat; ++i){
			int n = sc.nextInt();
			int a = 2;
			int b = 1;
			int a1 =0;
			float sum = 0;
			for (int t =0; t < n; ++t){
				sum = sum + (a * 1.0f /b);
				a1 =a;
				a = a + b;
				b = a1;	
			}
			System.out.printf("sum = %.2f\n", sum);
		}
	}

}
