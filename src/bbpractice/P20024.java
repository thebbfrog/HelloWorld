package bbpractice;

import java.util.Scanner;

public class P20024 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int r = sc.nextInt();
		for (int i=0; i < r; ++i){
			float x = sc.nextFloat();
			float y;
			if (x >= 0){
				y = (float)Math.pow(x, 0.5);
			} else{
				y = (float)(Math.pow(x+1, 2) + 2 * x + 1 / x);
			}
			System.out.printf("f(%.2f) = %.2f\n", x, y);	
		}
	

	}

}
