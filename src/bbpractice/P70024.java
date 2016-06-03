package bbpractice;

import java.util.Scanner;

public class P70024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int j =0; j < repeat; ++j){
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			for(int a =0; a < arr.length; ++a){
				for(int b =0; b < arr.length; ++b){
					arr[a][b]= sc.nextInt();
				}
			}
			boolean mapleLeafFlag = true;
			for(int a =0; a < arr.length; ++a){
				boolean flag = true;
				for(int b =0; b < arr.length; ++b){
					if(a>b && arr[a][b]!=0){
						System.out.print("NO");
						flag = false;
						mapleLeafFlag = false;
						break;
					} 
				}
				if(flag==false){
					break;
				}
				
			}
			if(mapleLeafFlag==true){
				System.out.println("YES");
			}
			
		}
	}
	//print buchulai 

}
