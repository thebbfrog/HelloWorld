package bbpractice;

import java.util.Scanner;

public class P70034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		sc.nextLine();
		for(int j=0; j<repeat; ++j){
			String x = sc.nextLine();
			String y = "";
			for(int i =0; i <x.length(); ++i){
				char c = x.charAt(i);
				if (c>='A' && c<='Z'){
					c = (char) ('Z' - c + 'A'); //Z-c = c离z的距离
				}//char 本质上就是一个整数
				y = y + c;
			}
			System.out.println(y);
		}
	}

}
