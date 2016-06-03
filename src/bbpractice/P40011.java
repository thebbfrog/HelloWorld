package bbpractice;

import java.util.Scanner;

public class P40011 {

	public static int commonDivisor(int n, int m){
		while (n%m!=0){
			int temp=n%m;
			n=m;
			m=temp;
		}
		return m;
		
	}
	public static int commonMultiple(int n, int m){
		return n*m/commonDivisor(n,m);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int commonDivisor = commonDivisor(n,m);
			int commonMultiple = commonMultiple(n,m);
			System.out.printf("%d is the least common multiple of &d and &d, %d is the greatest common divisor of %d and %d\n", commonMultiple, m, n, commonDivisor, m, n);
		}

	}

}
