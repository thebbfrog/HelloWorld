package bbpractice;

import java.util.Scanner;

public class P40013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i =0; i<repeat;++i){
		int sum = 0;
		int input = sc.nextInt();
		while( input > 0){
			
			if (input%2 == 1){
				sum = sum + input;
			}
			input = sc.nextInt();

		}
		System.out.println("The sum of the odd numbers is " + sum);
	    }
	}
	
}


