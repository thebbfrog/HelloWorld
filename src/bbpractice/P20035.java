package bbpractice;

import java.util.Scanner;

public class P20035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			int n = sc.nextInt();
			double s = 0;
			int flag = 1; 
			for (int t=0; t < n ;++t ){
				s = s + 1/(3.0*t + 1) * flag;
				flag = flag * -1;
			}
			System.out.printf("sum = %.3f\n", s);
		}
	}

}
