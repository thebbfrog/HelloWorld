package bbpractice;

import java.util.Scanner;

public class P20034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			int n = sc.nextInt();
			double s = 0; 
			for (int t = 1; t <= 2*n - 1; t = t + 2){
				s = s + 1.0 / t ;
			}
			System.out.printf("sum = %.6f\n", s);
		}
	}

}
