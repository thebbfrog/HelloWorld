package bbpractice;

import java.util.Scanner;

public class P70025 {
	
	public static int days(int yr, int mo, int day){
		int[] a= { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int to = 0;
		for(int i = 0; i < mo; ++i){
			to = to + a[i];
		}
		to = to + day;
		if(yr%4==0 && mo>2){
			++to;
		}
		return to;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int i =0; i < repeat; ++i){
			int yr = sc.nextInt();
			int mo = sc.nextInt();
			int day = sc.nextInt();
			int days = days(yr,mo,day);
			System.out.println("days of year: " + days);
		}
	}

}

//答案不对

