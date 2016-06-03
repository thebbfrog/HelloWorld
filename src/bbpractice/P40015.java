package bbpractice;

import java.util.Scanner;

public class P40015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0 ; i < repeat; ++i){
			int n = sc.nextInt();
			int temp = sc.nextInt(); //1
			for (int t=0; t<(n-1); ++t){
				int input = sc.nextInt();//2
				if (temp < input){
					temp = temp + 0;
				}else{
					temp = input;
				}
			}
			System.out.println("min = " + temp);
		
		}
		
		
	}

}
