package bbpractice;

import java.util.Scanner;

public class P70017b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i =0; i < repeat; ++i){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j =0; j <n; ++j){
				arr[j]=sc.nextInt();
			}
			int x = sc.nextInt();
			boolean flag = true;
			for(int j =0; j < arr.length; ++j){
				if(x == arr[j]){
					flag = false;
					System.out.println(x + ": a[" + j + "]" );
					break;
				}
			}
			if (flag)
				System.out.println(x + ": not found");
		}
	}

}
//not found