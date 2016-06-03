package bbpractice;

import java.util.Scanner;

public class P20036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			float lower = sc.nextFloat();
			float uper = sc.nextFloat();
			System.out.println("fahr   celsius");
			for (float t = lower; t <= uper; t = t + 2){
				float fahr = t;
				float celsius = 5 * (fahr - 32) / 9;
				System.out.printf("%3.0f %6.1f\n",  fahr, celsius);
			}
		}
	}

}
