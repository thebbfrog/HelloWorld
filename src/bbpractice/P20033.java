package bbpractice;

import java.util.Scanner;

public class P20033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			int m = sc.nextInt();
			int n = sc.nextInt();
			double s = 0; 
			for (int t = m; t <= n; ++t){
				s = s + 1.0 / t; 
			}
			System.out.printf("sum = %.3f\n", s);
		}
	}

}//dadadadada
