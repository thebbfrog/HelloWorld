package bbpractice;

import java.util.Scanner;

public class P20021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		
		for (int i = 0; i < repeat; ++i){
			float x = sc.nextFloat();
			float y;
			if (x == 0) {
				y = 0;
			} else {
				y = 1.0f / x;
			}
			System.out.printf("f(%.2f) = %.1f\n", x * 1.0, y);
		}
		
	}

}
