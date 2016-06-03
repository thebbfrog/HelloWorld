package bbpractice;

import java.util.Scanner;

public class P30010 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int i = 0; i < repeat; ++i){
			int x = sc.nextInt();
			String operator = sc.next();
			int y = sc.nextInt();
			switch (operator){
			case "*" :
				System.out.printf("%d * %d = %d\n", x, y, x*y );
			break;
			
			case "/":
				System.out.printf("%d / %d = %d\n", x, y, x/y );
			break;
			
			case "%":
				System.out.printf("%d Mod %d = %d\n", x, y, x%y );
			break;
			default:
				System.out.printf("Invalid operator\n");
				
			}
			
			
		
		}

	}

}
