package bbpractice;

import java.util.Scanner;

public class P40022 {
	public static boolean zhishu(int num) {
		if (num == 1) {
			return false;
		}
		for (int i = 2; i < num - 1; ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int count = 0;
			for (int t = m; t <= n; ++t){
				if (zhishu(t)) {
					System.out.print(t);
					if ((count + 1) % 6 == 0) {
						System.out.print("\n");
					} else {
						System.out.print(" ");
					}
					++count;
				}
			}
			System.out.print("\n");
		}
	}

}
