package bbpractice;

import java.util.Scanner;

public class P30007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i <10; ++i){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a + b > c && a + c > b && b + c > a){
				double s = (a + b + c) / 2.0;
				double area = Math.sqrt((s * (s - a)* (s - b)*(s - c)));
				
				System.out.printf("area = %.2f, perimeter = %.2f\n", area, s*2);
			} else{
				System.out.println("These sides do not correspond to a valid triangle");
			}
		}

	}

}
