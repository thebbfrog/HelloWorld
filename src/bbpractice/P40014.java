package bbpractice;

import java.util.Scanner;

public class P40014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			int count = 1;
			int input = sc.nextInt();
			int value = input;
			while(Math.abs(value/10)>0.1){
				++count;
				value = value/10;
			}
			System.out.println("count = " + count);
		}
	}

}
