package bbpractice;

import java.util.Scanner;

public class P20037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int summ=1;
			int sumn=1;
			for (int t = 1; t <= m; ++t){
				summ = summ * t;
				
			}for (int r = 1; r <= n; ++r){
				sumn = sumn * r;
			}
			int sum = summ + sumn;
			
		System.out.printf("%d! + %d! = %d\n", m,n,sum);
		}
	}

}
