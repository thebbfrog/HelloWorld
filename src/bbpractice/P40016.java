package bbpractice;

import java.util.Scanner;

public class P40016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i =0; i < repeat; ++i){
			int input = sc.nextInt();
			if(input < 0){
				input = Math.abs(input);
			}
			if(input == 0){
				System.out.println("count = 1, sum = 0");
				continue; //最大的int是(2^31-1)=2147483647
			}
			int count = 0;
			int sum = 0;
			while(input > 0){
				++count;
				sum = sum + input%10;
				input = input/10;
			}
			System.out.printf("count = %d, sum = %d\n", count, sum);
		}
			
		}
	}


