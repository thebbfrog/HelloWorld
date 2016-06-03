package bbpractice;

import java.util.Scanner;

public class P80012 {
	public static int search(int[] list, int x){
		for (int u=0; u < list.length; ++u){
			if (x == list[u]){
				return u;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i=0; i<repeat; ++i){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int t = 0; t<n; ++t){
				arr[t] = sc.nextInt();
			}
			int x = sc.nextInt();
			int y = search(arr,x);
			if (y==-1){
				System.out.println("Not found");
			}else{
				System.out.printf("index = %d\n", y);
			}
		}
			
		//超级难difficult， bb做了一个小时哼哼哼！！！
	}

}
