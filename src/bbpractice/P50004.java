package bbpractice;

import java.util.Scanner;

public class P50004 {
	public static double distance(double x1, double x2, double y1, double y2){
		
		double dis = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		return Math.abs(dis);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			System.out.printf("Distance = %.2f\n", distance(x1,x2,y1,y2));
		}
		
	}

}
//答案错啦

