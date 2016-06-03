package bbpractice;

import java.util.Scanner;

public class P40021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int i =0; i < repeat; ++i){
			int n = sc.nextInt();
			double e = 1;
			double x = 1; 
			for (int t = 1; t <= n; ++t){
				x = x * t;
				e = e + 1/x;
			}
		System.out.printf("e = %.4f\n", e);
		}
	}

}
