package bbpractice;

import java.util.Scanner;

public class P30009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] counters = new int[5];
		String[] ranges = {"A(90-100)", "B(80-89)", "C(70-79)", "D(60-69)", "E(0-59)"};
		for (int i = 0; i < n; ++i){
			int num = sc.nextInt();
			switch ( num / 10 ) {
			case 10:
			case 9:
				counters[0]++;
				break;
			case 8:
			case 7:
			case 6:
				counters[9-num]++;
				break;
			default:
				counters[4]++;
				break;
			}
		}
		int i = 0;
		for (int counter: counters) {
			System.out.println("Number of " + ranges[i++] + ": " + counter);
		}
		sc.close();

	}

}
