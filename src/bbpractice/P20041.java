package bbpractice;

import java.util.Scanner;

public class P20041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for (int t = 0; t <= i; ++t){
			double mypow = 1;
			mypow = Math.pow(3, t);
			System.out.printf("pow(3, %d) = %.0f\n", t, mypow);
		}
	}

}
