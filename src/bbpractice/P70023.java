package bbpractice;

import java.util.Scanner;

public class P70023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int j = 0; j < repeat; ++j){
			int n = sc.nextInt() +1;
			int[][] arr = new int[n][n];
			for(int i=1; i < arr.length; ++i){
				arr[0][i] = i;
				arr[i][0] =i;
			}
			for(int i =1; i < n; ++i){
				for(int m =1; m < n; ++m){
					if(i>=m){
						arr[i][m] = i * m;
					}
				}
			}
			for(int i =0; i <n; ++i){
				for(int m = 0; m<n; ++m){
					if (i==0 && m==0) {
						System.out.print("* ");
						continue;
					}
					if(i>=m||i==0){
					System.out.print(arr[i][m]+" ");
					}
				}
				System.out.print("\n");
			}
		}
	}

}
//print 格式不对