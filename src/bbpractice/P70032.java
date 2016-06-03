package bbpractice;

import java.util.Scanner;

public class P70032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int repeat = sc.nextInt();
		sc.nextLine(); //è¯»å›žè½¦
		
		for (int i = 0; i < repeat; ++i) {
			String x = sc.nextLine(); //从当前地方读到回车，并且把回车也读进去。
			char c = x.charAt(0);
			String line = sc.nextLine();
			int idx = -1;
			for (int j = 0; j < line.length() - 1; ++j) {
				if (line.charAt(j) == c) {
					idx = j;
				}
			}
			if (idx == -1) {
				System.out.println("Not Found");
			} else {
				System.out.println("index = " + idx);
			}
		}
		
	}

}
