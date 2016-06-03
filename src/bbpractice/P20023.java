package bbpractice;

import java.util.Scanner;

public class P20023 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		float m = sc.nextFloat();
		float y = sc.nextFloat();
		float r = sc.nextFloat();
		float i = (float) (m * Math.pow( 1 + r, y) - m);
		System.out.printf("interest = %.2f", i );
	}

}
