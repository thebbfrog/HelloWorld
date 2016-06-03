package bbpractice;

import java.util.Scanner;

public class P20026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
	}

}
