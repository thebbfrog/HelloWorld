package bbpractice;

import java.util.Scanner;

public class P20038 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			double x = sc.nextDouble();
			int n = sc.nextInt();
			double sum = 1;
			for (int t =0;  t < n; ++t){
				sum = sum * x;
			}
			System.out.printf("%.2f\n", sum);
			
		}
	}

}
