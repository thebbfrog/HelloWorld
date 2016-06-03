package bbpractice;

import java.util.Scanner;

public class P70033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		sc.nextLine();
		for(int j=0; j < repeat; ++j){
			String x = sc.nextLine();
			int count1 = 0;
			int count2=0;
			for (int i =0; i < x.length(); ++i){
				char c = x.charAt(i);
				switch (c){
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					++count1;
				}
			}
			for (int i =0; i < x.length(); ++i){
				char c = x.charAt(i);
				if (c >= 'A' && c <= 'Z'){
					++count2;
				}
			}
			int b = count2 - count1;
			System.out.println("count = " + b);
		}
	}

}
