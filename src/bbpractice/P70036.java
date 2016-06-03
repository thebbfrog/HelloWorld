package bbpractice;

import java.util.Scanner;

public class P70036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		sc.nextLine();
		for(int j=0; j < repeat; ++j){
			String x = sc.nextLine();
			String y = "";
			
			int sum =0;
			for (int i =0; i < x.length(); ++i){
				char c = x.charAt(i);
				if (c >= '0' && c <='9'){
					y = y +c;
					sum = sum*10 + (c-'0');
				}
				
				
			}
			System.out.println(sum);
		}
	}

}
