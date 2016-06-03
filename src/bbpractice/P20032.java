package bbpractice;

import java.util.Scanner;

public class P20032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt() ;
		
		for (int i = 0; i < repeat; ++i){
			int m = sc.nextInt();
			int s = 0;
			for (int t = m; t <= 100; ++t){
				s = s + t;
			}
			System.out.println("sum = " + s);
		}

	}

}
