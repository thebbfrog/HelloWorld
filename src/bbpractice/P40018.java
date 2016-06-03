package bbpractice;

import java.util.Scanner;

public class P40018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int i=0; i<repeat; ++i){
			int a = sc.nextInt();
			int n = sc.nextInt();
			int sum = 0;
			int temp = 0;
			for (int t = 0; t < n; ++t){
				
				temp = temp * 10 + a;
				sum = sum + temp;
			}
			System.out.println("sum = " + sum);
		}
	}

}
