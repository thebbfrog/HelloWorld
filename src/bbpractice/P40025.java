package bbpractice;

import java.util.Scanner;

public class P40025 {
	
	public static String wanshu2(int num) {
		if (num == 1) {
			return "1";
		}
		String str = "";
		int sum = 0; 
		for(int i =1; i < num; ++i){
			if ( num % i == 0){
				sum = sum + i;
				str = str + i + " + ";
			}
		}
		// num = 6
		// str = 1 + 2 + 3 +
		if (sum == num){
			return str.substring(0, str.length() - 3);
		} else {
			return null;
		}
	}
	
	public static boolean wanshu(int num){
		int sum = 0; 
		for(int i =1; i < num; ++i){
			if ( num*1.0%i == 0){
				sum = sum + i;
			}	
		}
		if (sum == num){
			return true;
		} else {return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for (int i = 0; i < repeat; ++i){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int a = 2;
			for (int t =m; t < n; ++t){
				String w = wanshu2(t);
				if(w != null){
					System.out.printf("%d = %s\n", t, w);
					
					/*while(t%a==0 && a <t ){
						System.out.printf(" + %d", a);
						++a;
					}
					System.out.printf("\n");*/
						
				}
			}
					
					
		}
	}
	

}
