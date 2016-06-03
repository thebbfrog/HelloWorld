package bbpractice;

import java.util.Scanner;

public class P20025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		for (int i=0; i < r; ++i){
		double x = sc.nextInt();
		double y;
			if (x==10){
			y = 1/x;
			} else{
			y = x;	
			} 
		System.out.printf("f(%.1f) = %.1f\n", x, y); 		
		}
	}
}
