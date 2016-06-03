package bbpractice;

import java.util.Scanner;

public class P30006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; ++i){
			int s = sc.nextInt();
			if (s < 60){
				System.out.println("Fail");
				
			} else{
				System.out.println("Pass");
				
			}
		}

	}

}
