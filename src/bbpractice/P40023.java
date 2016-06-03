package bbpractice;

import java.util.Scanner;

public class P40023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int i = 0; i < repeat; ++i){
			int money = sc.nextInt();
			int fen5, fen2, fen1;
			int count =0;
			for ( int x = 1; x <= money / 5; ++x) {
				fen5 = x;
				for (int y = 1; y <= (money - 5*x) / 2; ++ y) {
					fen2 = y;
					int z = money - 5 * x - 2 * y;
					if (z !=0){
						fen1 = z;
						
						System.out.printf("fen5:%d,fen2:%d,fen1:%d,total:%d\n", fen5,fen2,fen1,fen5+fen2+fen1);
						++count;
						
						
							
					}
				}
					
			}
			
			System.out.println("count = " + count);
			
		}
			
	}

}


