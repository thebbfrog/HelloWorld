package bbpractice;

import java.util.Scanner;

public class P60003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < repeat; ++i){
			String line = sc.nextLine(); //读到回车啦啦啦啦！
			int letter = 0 ;
			int blank = 0 ;
			int digit = 0 ; 
			int other = 0;
			for (int t = 0; t < line.length(); ++t){
				char c = line.charAt(t);
				if((c >='A' && c <='Z') || (c >= 'a' && c <= 'z')){ //a小z大
					letter++;
				} else if (c ==' '){
					blank++;
				  } else if (c >='0' && c <= '9'){ //0小9大
					digit++;
					
				    }else {
					other++;
				     }
				
			}
		System.out.printf("letter = %d, blank = %d, digit = %d, other = %d\n", letter, blank, digit, other);
		}
	}

}
//第一行， 空格