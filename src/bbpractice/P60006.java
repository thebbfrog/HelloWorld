package bbpractice;

import java.util.Scanner;

public class P60006 {
	public static int prime(int m){
		int b = 0;
		for (int i =2; i < m; ++i){
			if ((m%i==0)|| (m ==1)){
				b = 0;	
			
		    }else{
			b = 1;
		     }
	    }
		return b;	
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		for (int t = m; t < n; ++t){
			if (t%2==0){
				for (int i = 2; i < t; ++i){
					if (prime(i)==1){
						System.out.printf("%d=%d+%d ", t, i, t-i);
						count++;
						break;
					}
				}
				if((count+1)%5==0){
					System.out.printf("\n");
				}
				
			}
		}
	}

}
