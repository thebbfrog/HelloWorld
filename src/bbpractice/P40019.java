package bbpractice;

import java.util.Scanner;

public class P40019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			double height = sc.nextDouble();
			int n = sc.nextInt();
			double distance = height;
			double heightn = height; 
			for (int t=1; t < n; ++t){ //? t=0
				heightn = heightn/2;
				distance = distance + heightn * 2 ;
			}
			System.out.printf("distance = %.1f, height = %.1f\n", distance , heightn/2);//?
		}
	}

}
